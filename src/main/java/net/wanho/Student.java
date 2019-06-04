package net.wanho;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import java.util.Date;

/**
 * Created by Jerk on 2019/6/3.
 */
public class Student {

    private String name;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;

    @NumberFormat(style = NumberFormat.Style.PERCENT)
    private double percent;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }
}
