package com.mapperint;

import com.pojo.Student;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;



public class StufentInfoTest {
    private StufentInfo stufentInfo;
    private SqlSession sqlSession;


    @Before
    public void setUp() throws Exception {
        SqlSessionFactory sqlSessionFactory = MybatisUtil.getSqlSessionFactory();
        sqlSession = sqlSessionFactory.openSession();
        stufentInfo = sqlSession.getMapper(StufentInfo.class);
    }

    @After
    public void tearDown() throws Exception {
        sqlSession.close();
    }

    @Test
    public void selectStudent() {
        List<Student> studentList = stufentInfo.selectStudent();
        System.out.println(studentList);
    }
}