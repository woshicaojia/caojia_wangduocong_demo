package com.caojiawangduocongdemo.service.student;

import com.caojiawangduocongdemo.common.Page;
import com.caojiawangduocongdemo.entity.Student;

/**
 * @author DC
 * @time 16：00
 */
public interface StudentService {
    //学生登录验证
    public boolean allowLogin(String studentId,String password);
    //根据学生用户名查询
    Student findByStudentId(String studentId);
    //根据班级查询
    Student findBysclass(String sclass);
    //根据姓名查询
    Student findByName(String studentName);
    //学生分页
    Page<Student> sPage(int page, int pageSize, String q);
    //添加学生
    void insert(Student student);
    //根据sysId修改
    void updateBySysid(String sysid,String studentname,String scalss,int result);
    //根据sysId删除
    void delete(String sysid);



}
