/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scr;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author antonis
 */
public class TrainersPerCourse {

    private HashMap<Integer, ArrayList<Trainer>> map = new HashMap<>();
    private HashMap<Integer, Course> mapCourseID = new HashMap<>();

    public void set(Course c, Trainer t) {
        if (map.containsKey(c.getId())) {
            map.get(c.getId()).add(t);
        } else {
            ArrayList<Trainer> temp = new ArrayList<>();
            temp.add(t);
            map.put(c.getId(), temp);
            mapCourseID.put(c.getId(), c);
        }
    }

    public void printAll() {
        for (HashMap.Entry<Integer, ArrayList<Trainer>> entry : map.entrySet()) {
            System.out.println(mapCourseID.get(entry.getKey()).getTitle());

            for (Trainer t : entry.getValue()) {
                System.out.println("\t" + t.getLastName() + " " + t.getFirstName());
            }
        }

    }

}
