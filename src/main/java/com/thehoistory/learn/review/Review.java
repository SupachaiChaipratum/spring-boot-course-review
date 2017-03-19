package com.thehoistory.learn.review;


import com.thehoistory.learn.core.BaseEntity;
import com.thehoistory.learn.course.Course;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Review extends BaseEntity{


    private int rating;
    private String description;

    @ManyToOne
    private Course course;

    public Review(){
        super();
    }

    public Review(int rating, String description) {
        this.rating = rating;
        this.description = description;
    }
}
