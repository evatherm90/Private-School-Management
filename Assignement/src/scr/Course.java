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
public class Course {

    private String title;
    private String stream;
    private String type;
    private Calendar start_date;
    private Calendar end_date;
    private static AtomicInteger uniqueId = new AtomicInteger();
    private int id;

    public Course(String title, String stream, String type, Calendar start_date, Calendar end_date) {
        this.title = title;
        this.stream = stream;
        this.type = type;
        this.start_date = start_date;
        this.end_date = end_date;
        id = uniqueId.getAndIncrement();
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getStream() {
        return stream;
    }

    public String getType() {
        return type;
    }

    public Calendar getStart_date() {
        return start_date;
    }

    public Calendar getEnd_date() {
        return end_date;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setStart_date(Calendar start_date) {
        this.start_date = start_date;
    }

    public void setEnd_date(Calendar end_date) {
        this.end_date = end_date;
    }

}
