package com.example.helloworld;

import java.util.ArrayList;
import java.util.List;

public class Match {
    List<Team> teams = new ArrayList<>();

    public Match(Team team1, Team team2) {
        teams.add(team1);
        teams.add(team2);

    }

    public boolean contains(Team team1, Team team2) {
        return teams.contains(team1) && teams.contains(team2);
    }

    @Override
    public String toString() {
        String string = teams.get(0).name + teams.get(1).name;
        return string;
    }

    public boolean containsSameTeams(Match match2) {
        if (match2.teams.contains(teams.get(0)) || match2.teams.contains(teams.get(1))) {
            return true;
        }
        return false;
    }
}
