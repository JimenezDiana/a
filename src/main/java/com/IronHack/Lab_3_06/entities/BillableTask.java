package com.IronHack.Lab_3_06.entities;

import javax.persistence.Entity;

@Entity
public class BillableTask extends Task {

    private double hourlyRate;

    public BillableTask() {

    }

    public BillableTask(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public BillableTask(int id, String title, String dueData, boolean status, double hourlyRate) {
        super(id, title, dueData, status);
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
