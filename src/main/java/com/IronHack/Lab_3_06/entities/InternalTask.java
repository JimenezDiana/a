package com.IronHack.Lab_3_06.entities;

import javax.persistence.Entity;

@Entity
public class InternalTask extends Task {


    public InternalTask() {
    }

    public InternalTask(int id, String title, String dueData, boolean status) {
        super(id, title, dueData, status);
    }
}
