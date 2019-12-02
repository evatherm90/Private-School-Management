/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scr;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author antonis
 */
public class Trainer {

    private String firstName;
    private String lastName;
    private String subject;
    private static AtomicInteger uniqueId = new AtomicInteger();
    private int id;

    public Trainer(String lastName, String firstName, String subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        id = uniqueId.getAndIncrement();
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSubject() {
        return subject;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

}
