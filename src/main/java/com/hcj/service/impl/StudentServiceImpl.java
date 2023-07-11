package com.hcj.service.impl;

import com.hcj.entity.Student;
import com.hcj.mapper.StudentMapper;
import com.hcj.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * StudentServiceImpl
 *
 * @author hcj
 * @date 2023-06-08
 */
@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> findStudentList() {
        return studentMapper.queryStudentList();
    }

    @Override
    public int addStudent(Student s) {
        return studentMapper.insertStudent(s);
    }

    @Override
    public Student findStudentById(Integer id) {
        return studentMapper.queryStudentById(id);
    }

    @Override
    public int updateStudent(Student s) {
        return studentMapper.editStudent(s);
    }

    @Override
    public int deleteStudentById(Integer id) {
        return studentMapper.deleteStudentById(id);
    }

}
