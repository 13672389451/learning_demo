package com.kuang.dao;
import com.kuang.pojo.Student;
import com.kuang.pojo.Teacher;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.logging.Logger;

public class UserMapperTest {

    static Logger logger = Logger.getLogger(String.valueOf(UserMapperTest.class));

    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
         TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);
        sqlSession.close();

    }


    @Test
    public void test02(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

        System.out.println(mapper);
       List<Student> studentList = mapper.getStudent();
        System.out.println(mapper);
        for (Student student : studentList) {
            System.out.println(student);
        }

        sqlSession.close();

    }

    @Test
    public void test03(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

        System.out.println(mapper);
        List<Student> studentList = mapper.getStudent2();
        System.out.println(mapper);
        for (Student student : studentList) {
            System.out.println(student);
        }

        sqlSession.close();

    }

    @Test
    public void test04(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);

        System.out.println(mapper);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);
        sqlSession.close();

    }


}
