package com.thehoistory.learn.course;

import com.thehoistory.learn.core.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Course extends BaseEntity{


    private String title;
    private String url;


    public Course(){
        super();

    }
    public Course(String title, String url) {
        this();
        this.title = title;
        this.url = url;
    }
}
