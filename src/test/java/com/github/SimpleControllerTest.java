package com.github;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * Created by jianghang on 2018/4/19.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class SimpleControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testHello() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/hello")).andExpect(MockMvcResultMatchers.status().isOk());
    }
}
