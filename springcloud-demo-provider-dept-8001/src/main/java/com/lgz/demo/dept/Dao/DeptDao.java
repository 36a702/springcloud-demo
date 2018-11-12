package com.lgz.demo.dept.Dao;

import com.lgz.springcloud.demo.entitis.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by lgz on 2018/11/12.
 */
@Mapper
public interface DeptDao {
    boolean addDept(Dept dept);
    Dept findById(Long id);
    List<Dept> findAll();

}
