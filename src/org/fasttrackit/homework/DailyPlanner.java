package org.fasttrackit.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DailyPlanner {
    private List<DaySchedule> scheduleList = new ArrayList<>();

    public void addActivity(DayOfTheWeek day, String activity) {
        validateActivity(activity);
        DaySchedule found = getDaySchedule(day);
        if (found == null) {
            scheduleList.add(new DaySchedule(day, new ArrayList<>(Collections.singletonList(activity))));
        } else {
            found.getActivities().add(activity);
        }
    }

    public void removeActivity(DayOfTheWeek day, String activityToBeRemoved) {
        validateActivity(activityToBeRemoved);
        DaySchedule daySchedule = getDaySchedule(day);
        if (daySchedule == null) {
            throw new NoActivityException();
        } else {
            boolean wasRemoved = removeActivityFromDay(activityToBeRemoved, daySchedule);
            if (!wasRemoved) {
                throw new NoActivityException();
            }
        }
    }

    public Map<DayOfTheWeek, List<String>> endPlanning() throws NoActivitiesForDayException {
        Map<DayOfTheWeek, List<String>> result = new HashMap<>();
        DayOfTheWeek[] days = DayOfTheWeek.values();
        for (DayOfTheWeek day : days) {
            DaySchedule daySchedule = getDaySchedule(day);
            if (daySchedule == null || daySchedule.getActivities().size() == 0) {
                throw new NoActivitiesForDayException();
            }
            result.put(day, daySchedule.getActivities());
        }
        return result;
    }

    private void validateActivity(String activity) {
        if (activity == null) {
            throw new NoActivityException();
        }
    }

    private boolean removeActivityFromDay(String activityToBeRemoved, DaySchedule daySchedule) {
        for (String activity : daySchedule.getActivities()) {
            if (activity.equals(activityToBeRemoved)) {
                daySchedule.getActivities().remove(activity);
                return true;
            }
        }
        return false;
    }

    private DaySchedule getDaySchedule(DayOfTheWeek day) {
        for (DaySchedule daySchedule : scheduleList) {
            if (daySchedule.getDay() == day) {
                return daySchedule;
            }
        }
        return null;
    }
}
