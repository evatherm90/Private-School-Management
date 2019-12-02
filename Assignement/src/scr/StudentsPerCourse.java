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
public class StudentsPerCourse {

    private HashMap<Integer, ArrayList<Student>> map = new HashMap<>();
    private HashMap<Integer, Course> mapCourseID = new HashMap<>();

    public void set(Course c, Student st) {

        if (map.containsKey(c.getId())) {
            map.get(c.getId()).add(st);
        } else {
            ArrayList<Student> temp = new ArrayList<>();
            temp.add(st);
            map.put(c.getId(), temp);
            mapCourseID.put(c.getId(), c);
        }
    }

    public void printAll() {
        for (HashMap.Entry<Integer, ArrayList<Student>> entry : map.entrySet()) {
            System.out.println(mapCourseID.get(entry.getKey()).getTitle());

            for (Student st : entry.getValue()) {
                System.out.println("\t" + st.getLastName() + " " + st.getFirstName());
            }
        }

    }

    public void printStudentsAssignedToMoreThanOneCourse(ArrayList<Student> listOfStudents) {

        for (Student st : listOfStudents) {
            int counter = 0;
            for (HashMap.Entry<Integer, ArrayList<Student>> entry : map.entrySet()) {
                int megethos = entry.getValue().size();
                for (int i = 0; i < megethos; i++) {
                    if (entry.getValue().get(i).getId() == st.getId()) {
                        counter = counter + 1;
                    }
                }

            }
            if (counter >= 2) {
                System.out.println(st.getLastName() + " " + st.getFirstName());
            }

        }

    }

    public ArrayList<Student> getStudentsInAcourse(Integer courseID) {
        ArrayList<Student> temp = new ArrayList<>();
        if (map.containsKey(courseID)) {
            temp = map.get(courseID);
        } else {
            System.out.println("course has no students");
        }
        return temp;
    }

}
