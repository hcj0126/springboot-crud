package com.hcj.mapper;

import com.hcj.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * StudentMapper
 *
 * @author hcj
 * @date 2023-06-08
 */
@Mapper
@Repository
public interface StudentMapper {

    /**
     * 查询所有学生列表
    */
    List<Student> queryStudentList();
    /**
     * 新增学生
     */
    int insertStudent(Student s);
    /**
     * 先根据id查询student信息
     */
    Student queryStudentById(Integer id);
    /**
     * 修改学生
     */
    int editStudent(Student s);
    /**
     * 根据id删除student信息
     */
    int deleteStudentById(Integer id);
    /**
     * 跟新保存student信息
     */
    int saveUpdateStudent(Student s);
}
