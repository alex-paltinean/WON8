package org.fasttrackit;

public class RegexExample {
    public static void main(String[] args) {
        String text = "Alex arre 31 de anni.";

        System.out.println(text.replaceAll("a", "*"));

        // oricare dintre caractere
        System.out.println(text.replaceAll("[AaEe]", "*"));
        System.out.println(text.replaceAll("(a|e|A|E)", "*"));

        // orice caracter ce nu e intre paranteze
        System.out.println(text.replaceAll("[^ae ]", "*"));

        // orice caracter din range-ul ASCII
        System.out.println(text.replaceAll("[0-9]", "*"));
        System.out.println(text.replaceAll("[a-n]", "*"));
        System.out.println(text.replaceAll("[a-nA-N]", "*"));

        // oricare dintre grupurile de caractere
        System.out.println(text.replaceAll("(le|an)", "*"));

        // orice caracter
        System.out.println(text.replaceAll(".", "*"));

        // orice punct
        System.out.println(text.replaceAll("\\.", "*"));

        // orice cifra
        System.out.println(text.replaceAll("\\d", "*"));

        // de zero sau mai multe ori orice caracter
        System.out.println(text.replaceAll("Ale.*x", "*"));
        // o data sau de mai multe ori
        System.out.println(text.replaceAll("Ale.+x", "*"));

        // incepe cu A?
        System.out.println(text.matches("^A.*"));

        // se termina cu punct?
        System.out.println(text.matches(".*\\.$"));

        // toate cuvintele de 4 caractere
        System.out.println(text
                .replaceAll("^[a-zA-Z]{4} ", "* ")
                .replaceAll(" [a-zA-Z]{4} ", " * ")
                .replaceAll(" [a-zA-Z]{4}", " *"));

    }
}
