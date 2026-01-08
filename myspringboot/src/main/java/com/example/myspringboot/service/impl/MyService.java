package com.example.myspringboot.service.impl;

import com.example.myspringboot.dao.MyMapper;
import com.example.myspringboot.service.MyInterface;
import com.example.myspringboot.vo.CeJobVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MyService implements MyInterface {

    private final MyMapper myMapper;

    @Override
    public void saveInfo(int id, String name) {
        System.out.println("已保存用户" + name + "的信息");
    }

    @Override
    public void deleteInfoById(int id) {
        System.out.println("已删除用户信息" + id);
    }

    @Override
    public List<CeJobVo> selectAll() {
        return myMapper.selectAll();
    }

}
