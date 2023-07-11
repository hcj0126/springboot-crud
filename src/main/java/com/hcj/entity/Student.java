package com.hcj.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Table;

/**
 * Student
 *
 * @author hcj
 * @date 2023-06-08
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="student")
public class Student {

    private Integer id;
    private String name;
    private String gender;
    private Integer age;
    private String address;
    private String qq;
    private String email;
}
