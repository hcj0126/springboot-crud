package com.hcj.controller;

import com.hcj.entity.Student;
import com.hcj.service.IStudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * StudentController
 *
 * @author hcj
 * @date 2023-06-08
 */
@RestController
@Slf4j
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    /*@GetMapping("/findStudentAll")
    public Map<String,Object> findStudentAll(){
        // 创建一个map集合
        Map<String,Object> map = new HashMap<>();
        try{
            // 调用StudentServiceImpl查询所有的方法
            List<Student> list = studentService.findStudentList();
            // 存入map集合
            map.put("data",list);
            map.put("code",200); // 成功的状态码都是200
            map.put("msg","查询学生列表成功");
        }catch(Exception e){
            log.error("error",e);
            map.put("code",500);
            map.put("msg","查询学生列表失败:"+e.getMessage());
        }
        return map;
    }*/

    @GetMapping("/findStudentAll")
    public ModelAndView findStudentAll(){
        // 调用StudentServiceImpl查询所有的方法
        List<Student> list = studentService.findStudentList();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("studentList",list);
        modelAndView.setViewName("list");
        return modelAndView;
    }

    @GetMapping("/addFindStudent")
    public ModelAndView addStudent(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("add");
        return modelAndView;
    }

    @RequestMapping("/saveStudent")
    public void saveStudent(Student s, HttpServletResponse response){
        System.out.println(s);
        // 调用StudentServiceImpl查询所有的方法
        int i = studentService.addStudent(s);
        if(i!=-1){
            log.info("新增成功！");
        }else{
            log.error("新增失败！");
        }
        try {
            // 重定向
            response.sendRedirect("findStudentAll");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /*@PutMapping("/addStudent")
    public Map<String,Object> addStudent(){
        // 创建Student对象
        Student s = new Student();
        // "约老师","男",28,"塞维利亚","287644","28@qq.com"
        s.setName("约老师");
        s.setGender("男");
        s.setAddress("塞维利亚");
        s.setAge(28);
        s.setQq("287644");
        s.setEmail("28@qq.com");
        // 创建一个map集合
        Map<String,Object> map = new HashMap<>();
        try{
            // 调用StudentServiceImpl查询所有的方法
            int i = studentService.addStudent(s);
            // 存入map集合
            map.put("data",i);
            map.put("code",200); // 成功的状态码都是200
            map.put("msg","新增学生信息成功");
        }catch(Exception e){
            log.error("error",e);
            map.put("code",500);
            map.put("msg","新增学生信息失败:"+e.getMessage());
        }
        return map;
    }*/

    @RequestMapping("/findStudentById")
    public Map<String,Object> findStudentById(HttpServletRequest request){
        // 获取请求的参数id
        String idStr = request.getParameter("id");
        Integer id = Integer.parseInt(idStr);
        // 创建一个map集合
        Map<String,Object> map = new HashMap<>();
        try{
            // 先根据id把这条student信息查询出来
            Student s = studentService.findStudentById(id);
            // 存入map集合
            map.put("data",s);
            map.put("code",200); // 成功的状态码都是200
            map.put("msg","根据"+id+"查询学生信息成功");
        }catch(Exception e){
            log.error("error",e);
            map.put("code",500);
            map.put("msg","根据"+id+"查询学生信息失败:"+e.getMessage());
        }
        return map;
    }

    @RequestMapping("/updateStudentById")
    public ModelAndView updateStudent(HttpServletRequest request){
        // 获取请求的参数id
        String idStr = request.getParameter("id");
        Integer id = Integer.parseInt(idStr);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("id",id);
        // 先根据id把这条student信息查询出来
        Student s = studentService.findStudentById(id);
        modelAndView.addObject("student",s);
        modelAndView.setViewName("update");
        return modelAndView;
    }

    @RequestMapping("/saveUpdateStudent")
    public void saveUpdateStudent(Student s, HttpServletResponse response){
        System.out.println(s);
        // 调用StudentServiceImpl查询所有的方法
        int i = studentService.updateStudent(s);
        if(i!=-1){
            log.info("更新成功！");
        }else{
            log.error("更新失败！");
        }
        try {
            // 重定向
            response.sendRedirect("findStudentAll");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   /*@RequestMapping("/updateStudent")
   public Map<String,Object> updateStudent(HttpServletRequest request){
        // 获取请求的参数id
        String idStr = request.getParameter("id");
        Integer id = Integer.parseInt(idStr);
        // 创建一个map集合
        Map<String,Object> map = new HashMap<>();
        // 先根据id把这条student信息查询出来
        Student s = studentService.findStudentById(id);
        s.setId(id);
        s.setName("约老师22");
        s.setGender("女");
        s.setAddress("塞维利亚22");
        s.setAge(22);
        s.setQq("22222");
        s.setEmail("22222@qq.com");
        try{
            // 根据id修改学生信息
            int i = studentService.updateStudent(s);
            // 存入map集合
            map.put("data",i);
            map.put("code",200); // 成功的状态码都是200
            map.put("msg","更新学生信息成功");
        }catch(Exception e){
            log.error("error",e);
            map.put("code",500);
            map.put("msg","更新学生信息失败:"+e.getMessage());
        }
        return map;
    }*/

    /*@DeleteMapping("/deleteStudentById")
    public Map<String,Object> deleteStudentById(HttpServletRequest request){
        // 获取请求的参数id
        String idStr = request.getParameter("id");
        Integer id = Integer.parseInt(idStr);
        // 创建一个map集合
        Map<String,Object> map = new HashMap<>();
        try{
            // 根据id修改学生信息
            int i = studentService.deleteStudentById(id);
            // 存入map集合
            map.put("data",i);
            map.put("code",200); // 成功的状态码都是200
            map.put("msg","删除学生信息成功");
        }catch(Exception e){
            log.error("error",e);
            map.put("code",500);
            map.put("msg","删除学生信息失败:"+e.getMessage());
        }
        return map;
    }*/
    @GetMapping("/deleteStudentById")
    public void deleteStudentById(HttpServletRequest request,HttpServletResponse response){
        // 获取请求的参数id
        String idStr = request.getParameter("id");
        Integer id = Integer.parseInt(idStr);
        // 根据id修改学生信息
        int i = studentService.deleteStudentById(id);
        if(i!=-1){
            log.info("删除成功！");
        }else{
            log.error("删除失败！");
        }
        try {
            // 重定向
            response.sendRedirect("findStudentAll");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
