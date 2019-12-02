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
public class AssignmentsPerCourse {

    private HashMap<Integer, ArrayList<Assignment>> map = new HashMap<>();
    private HashMap<Integer, Course> mapCourseID = new HashMap<>();

    public void set(Course c, Assignment a) {
        if (map.containsKey(c.getId())) {
            map.get(c.getId()).add(a);
        } else {
            ArrayList<Assignment> temp = new ArrayList<>();
            temp.add(a);
            map.put(c.getId(), temp);
            mapCourseID.put(c.getId(), c);
        }
    }

    public ArrayList<Assignment> getAssignment(Integer cID) {//pairnei ton kodiko toy mathimatos kai epistrefei lista me assignments
        ArrayList<Assignment> temp = new ArrayList<>();
        if (map.containsKey(cID)) {
            temp = map.get(cID);
        } else {
            System.out.println("no assignments");
        }

        return temp;
    }

    public void printAll() {
        for (HashMap.Entry<Integer, ArrayList<Assignment>> entry : map.entrySet()) {
            System.out.println(mapCourseID.get(entry.getKey()).getTitle());

            for (Assignment a : entry.getValue()) {
                System.out.println("\t" + a.getTitle());
            }
        }

    }

}
