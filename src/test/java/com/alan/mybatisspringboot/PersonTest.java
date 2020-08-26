package com.alan.mybatisspringboot;

import com.alan.mybatisspringboot.mapper.PersonMapper;
import com.alan.mybatisspringboot.model.Person;
import com.alan.mybatisspringboot.model.PersonExample;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @description:
 * @author: xiaolin35
 * @date: 2020/8/25 10:59
 */
//@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonTest {

    @Autowired
    private PersonMapper personMapper;

    @Test
    public void testSelectList() {
        PersonExample example = new PersonExample();
        List<Person> list = personMapper.selectByExample(example);
        System.out.println(list.size());
    }
}
