package wn.lizzy.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wn.lizzy.springboot.entity.Demo;
import wn.lizzy.springboot.mapper.DemoMapper;

@Service
public class DemoService {
	@Autowired
    private DemoMapper demoMapper;
   
    public List<Demo> likeName(String name){
        return demoMapper.likeName(name);
    }
}
