package com.codewithatoullo;

import java.util.ArrayList;
import java.util.List;

/**
 * Скопировать MusicBand из прошлого задания и
 * доработать таким образом, чтобы в группу можно было добавлять и удалять участников.
 * Под участником понимается строка (String) с именем и фамилией.
 *
 * Реализовать статический метод слияния групп (в классе MusicBand), т.е. все участники группы А переходят в группу B.
 * Реализовать метод сияния групп, т.е. все участники группы А переходят в группу В
 * (участники не могут находиться в двух группах одновременно).
 * Реализовать метод, выводящий список участников в консоль. Проверить состав групп после слияния.
 */

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Freddie Mercury");
        members1.add("Brian May");
        members1.add("John Deacon");
        members1.add("Roger Taylor");

        MusicBand band1 = new MusicBand("Queen", 1970, members1);

        List<String> members2 = new ArrayList<>();
        members2.add("John Lennon");
        members2.add("Paul McCartney");
        members2.add("George Harrison");
        members2.add("Ringo Starr");

        MusicBand band2 = new MusicBand("The Beatles", 1960, members2);

        band1.printMembers();
        band2.printMembers();

        System.out.println();

        MusicBand.transferMemebers(band1, band2);

        band1.printMembers();
        band2.printMembers();
    }
}
