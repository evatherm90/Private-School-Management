/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scr;

import java.util.Calendar;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author antonis
 */
public class Student {
    private String FirstName;
    private String lastName;
    private Calendar dateOfBirth;
    private boolean tuitionFees;
    private static AtomicInteger uniqueId=new AtomicInteger();
    private int id;

    public Student(String lastName,String FirstName,  Calendar dateOfBirth, boolean tuitionFees) {
        this.FirstName = FirstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.tuitionFees = tuitionFees;
        id=uniqueId.getAndIncrement();
    }

    public int getId() {
        return id;
    }
    

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Calendar getDateOfBirth() {
        return dateOfBirth;
    }

    public boolean isTuitionFees() {
        return tuitionFees;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(Calendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setTuitionFees(boolean tuitionFees) {
        this.tuitionFees = tuitionFees;
    }
    
    
}
