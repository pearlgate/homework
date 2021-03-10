package com.mybatis.dao;

import com.mybatis.entity.Employee;
import com.mybatis.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeMapper {
    public List<Employee> getAllEmployees(){

        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();

        List<Employee> employeeList = session.selectList("getAllEmployees");

        session.commit();
        session.close();
        return employeeList;
    }

    public void saveEmployee(Employee employee){

        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        session.insert("insertEmployee", employee);
        session.commit();
        session.close();

    }

    public void deleteEmployee(int employeeId){
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        session.delete("deleteEmployee", employeeId);
        session.commit();
        session.close();
    }

    public Employee findById(int employeeId){
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        Employee employee = session.selectOne("findById",employeeId);
//        System.out.println(employee);
        session.commit();
        session.close();
        return employee;
    }
}
















