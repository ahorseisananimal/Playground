package com.example.helloworld;

import java.util.ArrayList;
import java.util.List;

public class Tour {
    List<Match> matches = new ArrayList<>();

    @Override
    public String toString() {
        String string = "";
        for (Match match : matches) {
            string = string + match + " ";
        }
        return string;
    }

    public boolean isValid() {
        for (Match match1 : matches) {
            for (Match match2 : matches) {
                if (match1 != match2) {
                    if (match1.containsSameTeams(match2)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
