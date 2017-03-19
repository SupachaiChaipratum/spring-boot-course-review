package com.thehoistory.learn.course;

import com.thehoistory.learn.core.BaseEntity;
import com.thehoistory.learn.review.Review;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;


@Entity
@Getter
@Setter
public class Course extends BaseEntity{


    private String title;
    private String url;

    @OneToMany(mappedBy = "course" , cascade = CascadeType.ALL)
    private List<Review> reviews;


    public Course(){
        super();
        reviews = new  ArrayList<>();

    }
    public Course(String title, String url) {
        this();
        this.title = title;
        this.url = url;
    }

    public void addReview(Review review){
        review.setCourse(this);
        reviews.add(review);
    }
}
