/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scr;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

/**
 *
 * @author antonis
 */
public class AssignmentsPerStudent {

    private HashMap<Integer, ArrayList<Assignment>> map = new HashMap<>();
    private HashMap<Integer, Student> mapStudentID = new HashMap<>();

    public void set(Student s, Assignment a) {
        if (map.containsKey(s.getId())) {
            map.get(s.getId()).add(a);
        } else {
            ArrayList<Assignment> temp = new ArrayList<>();
            temp.add(a);
            map.put(s.getId(), temp);
            mapStudentID.put(s.getId(), s);
        }

    }

    public void printAll() {
        for (HashMap.Entry<Integer, ArrayList<Assignment>> entry : map.entrySet()) {
            System.out.println(mapStudentID.get(entry.getKey()).getLastName() + " " + mapStudentID.get(entry.getKey()).getFirstName());

            for (Assignment a : entry.getValue()) {
                System.out.println("\t" + a.getTitle());
            }
        }

    }

    public void printStudentsToSubAssignement(Calendar c) {
        c.setFirstDayOfWeek(Calendar.MONDAY);
        for (HashMap.Entry<Integer, ArrayList<Assignment>> entry : map.entrySet()) {

            for (Assignment a : entry.getValue()) {

                if (a.getSubDateTime().get(Calendar.WEEK_OF_YEAR) == c.get(Calendar.WEEK_OF_YEAR)) {
                    System.out.println(mapStudentID.get(entry.getKey()).getLastName() + " " + mapStudentID.get(entry.getKey()).getFirstName());
                    break;
                }
            }
        }
    }

}
