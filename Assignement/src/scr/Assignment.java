/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scr;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author antonis
 */
public class Assignment {
    private String title;
    private String description;
    private Calendar subDateTime;
    private String oralMark;
    private String totalMark;
    private static AtomicInteger uniqueId=new AtomicInteger();
    private int id;

    public Assignment(String title, String description, Calendar subDateTime, String oralMark, String totalMark) {
        this.title = title;
        this.description = description;
        this.subDateTime = subDateTime;
        this.subDateTime.setFirstDayOfWeek(Calendar.MONDAY);
        this.oralMark = oralMark;
        this.totalMark = totalMark;
        id=uniqueId.getAndIncrement();
    }

    public int getId() {
        return id;
    }
    

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Calendar getSubDateTime() {
        return subDateTime;
    }

    public String getOralMark() {
        return oralMark;
    }

    public String getTotalMark() {
        return totalMark;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSubDateTime(Calendar subDateTime) {
        this.subDateTime = subDateTime;
    }

    public void setOralMark(String oralMark) {
        this.oralMark = oralMark;
    }

    public void setTotalMark(String totalMark) {
        this.totalMark = totalMark;
    }
    
    
    
}
