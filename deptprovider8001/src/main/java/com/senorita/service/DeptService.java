package com.senorita.service;

import com.senorita.model.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
public interface DeptService {
    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
