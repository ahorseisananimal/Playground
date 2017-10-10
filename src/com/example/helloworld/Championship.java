package com.example.helloworld;

import java.util.ArrayList;
import java.util.List;

public class Championship {
    List<Tour> tours = new ArrayList<>();

    @Override
    public String toString() {
        String string = "";
        for (Tour tour : tours) {
            string = string + tour + "\n";
        }
        return string;
    }


    public boolean isValid() {
        for (Tour tour : tours) {
            if (!tour.isValid()) {
                return false;
            }
        }
        return true;
    }

}


