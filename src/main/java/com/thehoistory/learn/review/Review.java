package com.thehoistory.learn.review;


import com.thehoistory.learn.core.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Review extends BaseEntity{


    private int rating;
    private String description;

    public Review(){
        super();
    }

}
