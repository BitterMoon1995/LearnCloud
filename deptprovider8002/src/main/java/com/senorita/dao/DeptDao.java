package com.senorita.dao;

import com.senorita.model.Dept;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//@Mapper 启动类用@MapperScan全自动扫描
public interface DeptDao {
    boolean addDept(Dept dept);

    Dept findById(Long id);

    List<Dept> findAll();
}
