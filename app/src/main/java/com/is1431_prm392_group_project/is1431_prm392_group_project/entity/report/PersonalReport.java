package com.is1431_prm392_group_project.is1431_prm392_group_project.entity.report;

import com.is1431_prm392_group_project.is1431_prm392_group_project.dao.Repo;
import com.j256.ormlite.field.DatabaseField;

import java.sql.Date;

public class PersonalReport {
    public int getId() {
        return id;
    }

    @DatabaseField(id = true, generatedId = true)
    int id;
    @DatabaseField
    double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @DatabaseField
    double height;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @DatabaseField
    Date date;
    public PersonalReport() {
    }


    private int save(Repo repo) {
        if (repo.personalReport.getByID(id) == null) {
            return repo.personalReport.create(this);
        } else {
            return repo.personalReport.update(this);
        }
    }

    public int update(Repo repo) throws Exception {
        if (repo.personalReport.getByID(id) == null) {
            return repo.personalReport.create(this);
        } else {
            return repo.personalReport.update(this);
        }
    }

    public int delete(Repo repo) {
        return repo.personalReport.delete(this);
    }

}
