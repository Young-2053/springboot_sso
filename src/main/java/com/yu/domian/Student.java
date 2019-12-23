package com.yu.domian;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity(name="student")
public class Student {
    @Id
    private Integer snumber;
    @Column
    private String  sname;
    @Column
    private String  ssex;
    @Column
    private Integer sage;
}
