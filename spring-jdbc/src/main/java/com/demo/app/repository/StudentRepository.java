package com.demo.app.repository;

import com.demo.app.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Student s){
        String sql_query = "insert into student (roll_no,name, age) values (?,?,?);";
        int rows = jdbcTemplate.update(sql_query, s.getRoll_no(), s.getName(), s.getAge());
        System.out.println(rows + " rows effected");
        System.out.println("student saved!");
    }

    public List<Student> findAll(){
        String sql_query = "select * from student;";
        RowMapper<Student> mapper = new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student s = new Student();
                s.setRoll_no(rs.getInt("roll_no"));
                s.setName(rs.getString("name"));
                s.setAge(rs.getInt("age"));
                return s;
            }
        };
        return jdbcTemplate.query(sql_query, mapper);
    }
}
