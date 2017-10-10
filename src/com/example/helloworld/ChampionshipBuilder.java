package com.example.helloworld;


import java.util.ArrayList;
import java.util.Collections;

public class ChampionshipBuilder {
    static ArrayList<Team> teams = new ArrayList<>();
    static ArrayList<Match> allMatches = new ArrayList<>();
    static String abc = "abcdefghijklmnopqrstuvwxyz";
    static int teamsQuantity = 12;
    static int toursQuantity = teamsQuantity - 1;
    static int matchesInTours = teamsQuantity / 2;
    static int matchesTotal = toursQuantity * matchesInTours;

    public static void main(String[] args) {


        for (int i = 0; i < teamsQuantity; i++) {
            teams.add(new Team(abc.charAt(i)));
        }

        buildAllMatches();
        printAllMatches();

        //Championship championship = nastyaAlgorithm();
        Championship championship = dimaRandom();
        printAllMatches();
        printChampionship(championship);

    }

    private static Championship nastyaAlgorithm() {
        return null;
    }

    private static Championship dimaRandom() {
        int count = 0;
        long startTime = System.currentTimeMillis();
        while (true) {
            Championship championship = buildChampionshipDimaRandom();
            count++;
            if (championship.isValid()){

                System.out.println("Counted in " + count + " iterations, and in " + (System.currentTimeMillis()-startTime) + " ms");
                return championship;
            }
        }
    }

    private static void printChampionship(Championship championship) {
        System.out.println(championship);
    }


    private static Championship buildChampionshipDimaRandom() {
        Collections.shuffle(allMatches);
        Championship championship = new Championship();
        for (int i = 0; i < toursQuantity; i++) {
            Tour tour = new Tour();
            for (int j = 0; j < matchesInTours; j++) {
                tour.matches.add(allMatches.get(j+i* matchesInTours));
            }
            championship.tours.add(tour);
        }
       return championship;
    }

    private static void printAllMatches() {
        System.out.println("Amount of matches in a championship = " + matchesTotal);
        for (Match match : allMatches) {
            System.out.print(match + " ");
        }
        System.out.println("");
    }

    private static void buildAllMatches() {
        for (Team team1 : teams) {
            for (Team team2 : teams) {  //
                if (!team1.equals(team2)) {
                    boolean isUnique = true;
                    for (Match match : allMatches) { //
                        if (match.contains(team1, team2)) {
                            isUnique = false;
                        }
                    }
                    if (isUnique) {
                        allMatches.add(new Match(team1, team2));
                    }
                }
            }
        }
    }
}
