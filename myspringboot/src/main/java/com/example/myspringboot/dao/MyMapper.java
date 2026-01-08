package com.example.myspringboot.dao;

import com.example.myspringboot.vo.CeJobVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MyMapper {
    List<CeJobVo> selectAll();
}
