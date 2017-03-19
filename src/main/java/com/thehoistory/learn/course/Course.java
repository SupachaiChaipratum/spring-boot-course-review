package com.thehoistory.learn.course;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Course {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final Long id;
    private String title;
    private String url;

    protected Course(){
        this.id = null;
    }
    public Course(String title, String url) {
        this();
        this.title = title;
        this.url = url;
    }
}
