/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignement;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import scr.Trainer;
import scr.Student;
import scr.Assignment;
import scr.AssignmentsPerCourse;
import scr.AssignmentsPerStudent;
import scr.Course;
import scr.StudentsPerCourse;
import scr.TrainersPerCourse;

/**
 *
 * @author antonis
 */
public class Secretary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //lista me trainers
        ArrayList<Trainer> listOfTrainers = new ArrayList<Trainer>();
        Trainer t1 = new Trainer("Smith", "Jason", "Calculus");
        Trainer t2 = new Trainer("Black", "Oliver", "Calculus");
        Trainer t3 = new Trainer("Earp", "Noah", "Analysis");
        Trainer t4 = new Trainer("Croix", "Miriam", "Analysis");
        Trainer t5 = new Trainer("Peterson", "Noah", "Statistics");
        Trainer t6 = new Trainer("Caulson", "Ella", "Computer Science");
        listOfTrainers.add(t1);
        listOfTrainers.add(t2);
        listOfTrainers.add(t3);
        listOfTrainers.add(t4);
        listOfTrainers.add(t5);
        listOfTrainers.add(t6);

        //lista me courses
        Calendar sd = Calendar.getInstance();
        Calendar ed = Calendar.getInstance();
        sd.set(2019, 8, 1);
        ed.set(2019, 12, 1);
        ArrayList<Course> listOfCourses = new ArrayList<Course>();
        Course c1 = new Course("Foundations of Mathematics", "Theoretical", "Mandatory", sd, ed);
        Course c2 = new Course("Graph Theory", "Applied", "Choise", sd, ed);
        Course c3 = new Course("Linear Algebra", "Theoretical", "Choise", sd, ed);
        Course c4 = new Course("Mathematical Analysis", "Theoretical", "Choise", sd, ed);
        Course c5 = new Course("Statistics", "Applied", "Choise", sd, ed);
        listOfCourses.add(c1);
        listOfCourses.add(c2);
        listOfCourses.add(c3);
        listOfCourses.add(c4);
        listOfCourses.add(c5);

        TrainersPerCourse tpc = new TrainersPerCourse();
        tpc.set(c5, t1);
        tpc.set(c1, t1);
        tpc.set(c2, t2);
        tpc.set(c4, t3);
        tpc.set(c3, t4);
        tpc.set(c3, t6);

        Calendar db1 = Calendar.getInstance();
        Calendar db2 = Calendar.getInstance();
        db1.set(1999, 0, 10);
        db1.set(1999, 2, 11);

        ArrayList<Student> listOfStudents = new ArrayList<>();
        Student st1 = new Student("Waren", "Julia", db1, true);
        Student st2 = new Student("Brawn", "Clair", db1, true);
        Student st3 = new Student("Moon", "George", db1, true);
        Student st4 = new Student("Ren", "Jim", db2, true);
        Student st5 = new Student("Waffles", "Tim", db2, true);
        Student st6 = new Student("Hannigan", "Alex", db2, false);
        listOfStudents.add(st1);
        listOfStudents.add(st2);
        listOfStudents.add(st3);
        listOfStudents.add(st4);
        listOfStudents.add(st5);
        listOfStudents.add(st6);

        StudentsPerCourse stpc = new StudentsPerCourse();
        stpc.set(c1, st1);
        stpc.set(c2, st2);
        stpc.set(c3, st3);
        stpc.set(c4, st4);
        stpc.set(c5, st5);
        stpc.set(c1, st6);
        stpc.set(c2, st6);
        stpc.set(c3, st1);
        stpc.set(c4, st2);
        stpc.set(c5, st3);

        ArrayList<Assignment> listOfAssignments = new ArrayList<>();
        Calendar d1 = Calendar.getInstance();
        Calendar d2 = Calendar.getInstance();
        d1.set(2019, Calendar.SEPTEMBER, 10);
        d2.set(2019, Calendar.OCTOBER, 10);
        Assignment ass1 = new Assignment("computational technics", "gsuhuiihu", d1, "10", "10");
        Assignment ass2 = new Assignment("topology of solids", "gsuhuiihu", d1, "10", "10");
        Assignment ass3 = new Assignment("differencial equations", "gsuhuiihu", d1, "10", "10");
        Assignment ass4 = new Assignment("multi dimentional variables", "gsuhuiihu", d2, "10", "10");
        Assignment ass5 = new Assignment("linear transfer functions", "gsuhuiihu", d2, "10", "10");
        listOfAssignments.add(ass1);
        listOfAssignments.add(ass2);
        listOfAssignments.add(ass3);
        listOfAssignments.add(ass4);
        listOfAssignments.add(ass5);

        AssignmentsPerCourse apc = new AssignmentsPerCourse();
        apc.set(c1, ass1);
        apc.set(c2, ass2);
        apc.set(c3, ass3);
        apc.set(c4, ass4);
        apc.set(c5, ass5);

        AssignmentsPerStudent aps = new AssignmentsPerStudent();
        aps.set(st6, ass1);
        aps.set(st6, ass2);
        aps.set(st1, ass1);
        aps.set(st1, ass3);
        aps.set(st5, ass5);
        aps.set(st2, ass4);
        aps.set(st2, ass2);
        aps.set(st3, ass3);
        aps.set(st3, ass5);
        aps.set(st4, ass4);

        String keyWord = "start";///edw ksekinaei to "menou"
        while (keyWord.equalsIgnoreCase("start")) {

            System.out.println("Hello! if you want to make an entry");
            System.out.println("press 1");
            System.out.println("if you want to print");
            System.out.println("press 2");
            System.out.println("if you want to leave");
            System.out.println("press any other integer");

            Scanner e = new Scanner(System.in);
            int endoli = e.nextInt();

            switch (endoli) {
                case 1://register something

                    System.out.println("if you want to register a trainer press 1");
                    System.out.println("if you want to register a course press 2");
                    System.out.println("if you want to register a student press 3");
                    System.out.println("if you want to register an assignment press 4");
                    Scanner r = new Scanner(System.in);
                    int register = r.nextInt();

                    switch (register) {
                        case 1://register a trainer

                            System.out.println("Register a Trainer!");

                            System.out.println("enter last name");
                            Scanner l = new Scanner(System.in);
                            String lastName = l.nextLine();

                            System.out.println("enter first name");
                            Scanner f = new Scanner(System.in);
                            String firstName = f.nextLine();

                            System.out.println("enter subject");
                            Scanner s = new Scanner(System.in);
                            String subject = s.nextLine();

                            Trainer t = new Trainer(lastName, firstName, subject);
                            listOfTrainers.add(t);

                            System.out.println("which course is assinged to the trainer");
                            System.out.println("for each course, type the given number");

                            for (Course c : listOfCourses) {
                                System.out.println(c.getTitle() + " " + c.getId());

                            }

                            Scanner cc = new Scanner(System.in);
                            int choseCourse = cc.nextInt();
                            if (choseCourse >= 0 && choseCourse < listOfCourses.size()) {
                                tpc.set(listOfCourses.get(choseCourse), t);
                                System.out.println("ok!");
                            } else {
                                System.out.println("not valid course");
                                System.out.println("the trainer has not a course yet");
                            }

                            System.out.println("You have register a trainer!");
                            System.out.println(lastName + " " + firstName);
                            break;
                        case 2://register a course

                            System.out.println("Register a Course!");

                            System.out.println("enter title");
                            Scanner ti = new Scanner(System.in);
                            String title = ti.nextLine();

                            System.out.println("enter stream");
                            Scanner st = new Scanner(System.in);
                            String stream = st.nextLine();

                            System.out.println("enter type");
                            Scanner ty = new Scanner(System.in);
                            String type = ty.nextLine();

                            System.out.println("enter start date");

                            Calendar startDate = Calendar.getInstance();
                            startDate = doseOdigiesGiaDate();

                            System.out.println("enter end date");

                            Calendar endDate = Calendar.getInstance();
                            endDate = doseOdigiesGiaDate();

                            Course c = new Course(title, stream, type, startDate, endDate);
                            listOfCourses.add(c);

                            System.out.println("who is going to teach this course");
                            System.out.println("for each trainer, press the given number");

                            int k = 0;
                            for (Trainer tr : listOfTrainers) {
                                System.out.println(tr.getLastName() + " " + k);
                                k++;
                            }

                            Scanner ct = new Scanner(System.in);
                            int choseTrainer = ct.nextInt();
                            if (choseTrainer >= 0 && choseTrainer < listOfTrainers.size()) {
                                tpc.set(c, listOfTrainers.get(choseTrainer));
                                System.out.println("ok!");
                            } else {
                                System.out.println("not valid trainer");
                                System.out.println("the course has no trainer yet");
                            }

                            System.out.println("You have register a course!");
                            System.out.println(title + " " + stream + " " + type + " " + startDate.getTime() + " " + endDate.getTime());

                            break;
                        case 3://register a student

                            System.out.println("lets register a student!");
                            System.out.println("enter last name");
                            Scanner ln = new Scanner(System.in);
                            String last_name = ln.nextLine();

                            System.out.println("enter first name");
                            Scanner fn = new Scanner(System.in);
                            String first_name = fn.nextLine();

                            System.out.println("date of birth");

                            Calendar date_of_birth = Calendar.getInstance();
                            date_of_birth = doseOdigiesGiaDate();

                            System.out.println("tuition fees true or false");
                            Scanner tf = new Scanner(System.in);
                            boolean tuition_fees = tf.hasNextBoolean();

                            Student stu = new Student(last_name, first_name, date_of_birth, tuition_fees);
                            listOfStudents.add(stu);

                            System.out.println("which course is the student going to take");
                            System.out.println("for each course, press the given number");

                            for (Course co : listOfCourses) {
                                System.out.println(co.getTitle() + " " + co.getId());

                            }

                            Scanner cco = new Scanner(System.in);
                            int chose_course = cco.nextInt();//pairnei to id tou course

                            if (chose_course >= 0 && chose_course < listOfCourses.size()) {
                                stpc.set(listOfCourses.get(chose_course), stu);
                                ArrayList<Assignment> ergasies = new ArrayList<>();
                                ergasies = apc.getAssignment(chose_course);
                                int length = ergasies.size();
                                for (int er = 0; er < length; er++) {
                                    aps.set(stu, ergasies.get(er));
                                }

                                System.out.println("ok!");

                            } else {
                                System.out.println("not valid course");
                                System.out.println("the student has not a course yet");
                            }

                            System.out.println("You have register a student!");
                            System.out.println(last_name + " " + first_name + " " + date_of_birth.getTime() + " has tuition fees " + tuition_fees);

                            break;
                        case 4://regist assignment

                            System.out.println("lets make an assignment!");
                            System.out.println("insert title");
                            Scanner ttl = new Scanner(System.in);
                            String titl = ttl.nextLine();

                            System.out.println("insert description");
                            Scanner dscr = new Scanner(System.in);
                            String description = dscr.nextLine();

                            System.out.println("to insert sub date time insert year");
                            Scanner sbty = new Scanner(System.in);
                            int year = sbty.nextInt();

                            System.out.println("to insert a month chose a number");
                            System.out.println("0. jan\n1. feb\n2.mar\n3. apr\n4.may\n5. jun\n6. jul\n7. aug\n8. sep\n9. oct \n10. nov\n11.dec");

                            Scanner sbtm = new Scanner(System.in);
                            int month = sbty.nextInt();

                            System.out.println("to insert date chose a number from 1 to 30");
                            Scanner sbtd = new Scanner(System.in);
                            int date = sbtd.nextInt();

                            Calendar subDateTime = Calendar.getInstance();
                            subDateTime.set(year, month, date);

                            System.out.println("insert oral mark");
                            Scanner om = new Scanner(System.in);
                            String oralMark = om.nextLine();

                            System.out.println("insert total mark");
                            Scanner tm = new Scanner(System.in);
                            String totalMark = tm.nextLine();

                            Assignment ass = new Assignment(titl, description, subDateTime, oralMark, totalMark);
                            listOfAssignments.add(ass);

                            System.out.println("for which course is this assignment");
                            System.out.println("for each course press the given number");

                            for (Course co : listOfCourses) {
                                System.out.println(co.getTitle() + " " + co.getId());

                            }

                            Scanner chco = new Scanner(System.in);
                            int chose_Course = chco.nextInt();
                            if (chose_Course >= 0 && chose_Course < listOfCourses.size()) {
                                apc.set(listOfCourses.get(chose_Course), ass);
                                
                                ArrayList<Student> studentsInTheCourse=new ArrayList<>();
                                studentsInTheCourse=stpc.getStudentsInAcourse(chose_Course);
                                if(studentsInTheCourse==null){
                                    System.out.println("no student has to do this assignment");
                                }
                                else{
                                    for(int thesi=0;thesi<studentsInTheCourse.size();thesi++){
                                        aps.set(studentsInTheCourse.get(thesi), ass);
                                    }
                                }
                                
                                System.out.println("ok!");
                            } else {
                                System.out.println("not valid course");
                                System.out.println("the assignment is not associate to a course yet");
                            }

                            System.out.println("You have register an assignment!");
                            System.out.println(titl + " " + description + " " + subDateTime.getTime() + " " + oralMark + " " + totalMark);

                            break;

                        default:
                            System.out.println("Nothing to register :(");
                            break;
                    }

                    break;
                case 2://print

                    System.out.println("to print all trainers press 1");
                    System.out.println("to print all courses press 2");
                    System.out.println("to print all trainers per course press 3");
                    System.out.println("to print all students press 4");
                    System.out.println("to print all students per course press 5");
                    System.out.println("to print all assignments press 6");
                    System.out.println("to print all assignments per course press 7");
                    System.out.println("to print all assignments per student press 8");
                    System.out.println("to print all students to submit assignments press 9");
                    System.out.println("to print all students assignmed to more than one course press 10");
                    Scanner p = new Scanner(System.in);

                    int print = p.nextInt();
                    switch (print) {
                        case 1://print trainers

                            for (Trainer t : listOfTrainers) {
                                System.out.println(t.getLastName() + " " + t.getFirstName());
                            }
                            break;
                        case 2://print courses

                            for (Course c : listOfCourses) {
                                System.out.println(c.getTitle());
                            }

                            break;
                        case 3:
                            tpc.printAll();
                            break;
                        case 4:
                            for (Student stud : listOfStudents) {
                                System.out.println(stud.getLastName() + " " + stud.getFirstName());
                            }
                            break;
                        case 5:
                            stpc.printAll();
                            break;
                        case 6:
                            for (Assignment a : listOfAssignments) {
                                System.out.println(a.getTitle());
                            }
                            break;
                        case 7:
                            apc.printAll();
                            break;
                        case 8:
                            aps.printAll();
                            break;
                        case 9:

                            Calendar subDateTime = Calendar.getInstance();
                            subDateTime = doseOdigiesGiaDate();
                            aps.printStudentsToSubAssignement(subDateTime);

                            break;
                        case 10:
                            stpc.printStudentsAssignedToMoreThanOneCourse(listOfStudents);
                            break;

                        default:
                            System.out.println("Nothing to print :(");
                            break;

                    }
                    break;
                default:
                    System.out.println("Have a nice day!");
                    break;
            }
            System.out.println("to continue type start");
            System.out.println("press anything else to leave");
            Scanner kw = new Scanner(System.in);
            keyWord = kw.nextLine();
        }

        System.out.println("nice to work with you! Goodbye");

    }

    public static Calendar doseOdigiesGiaDate() {
        System.out.println("insert year");
        Scanner y = new Scanner(System.in);
        int year = y.nextInt();

        System.out.println("to insert a month chose a number");
        System.out.println("0. jan\n1. feb\n2.mar\n3. apr\n4.may\n5. jun\n6. jul\n7. aug\n8. sep\n9. oct \n10. nov\n11.dec");
        Scanner m = new Scanner(System.in);
        int month = m.nextInt();

        System.out.println("to insert date chose a number from 1 to 30");
        Scanner d = new Scanner(System.in);
        int date = d.nextInt();

        Calendar dt = Calendar.getInstance();
        dt.set(year, month, date);
        return dt;

    }

}
