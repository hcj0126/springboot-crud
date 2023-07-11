package com.hcj.service;

import com.hcj.entity.Student;

import java.util.List;

/**
 * IStudentService
 *
 * @author hcj
 * @date 2023-06-08
 */
public interface IStudentService {
    /**
     * 查询所有学生列表
     */
    List<Student> findStudentList();
    /**
     * 新增学生
     */
    int addStudent(Student s);

    /**
     * 先根据id查询student信息
    */
    Student findStudentById(Integer id);
    /**
     * 更新学生
     */
    int updateStudent(Student s);
    /**
     * 根据id删除student信息
     */
    int deleteStudentById(Integer id);
}
