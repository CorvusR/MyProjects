package com.example.myspringboot.service;

import com.example.myspringboot.vo.CeJobVo;

import java.util.List;

public interface MyInterface {
     void saveInfo(int id, String name);
     void deleteInfoById(int id);
     List<CeJobVo> selectAll();
}
