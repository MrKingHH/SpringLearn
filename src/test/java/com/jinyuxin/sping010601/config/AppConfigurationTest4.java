package com.jinyuxin.sping010601.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

/**
 * @author 金余新
 * @date 2021/1/6 15:49
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfiguration.class)
public class AppConfigurationTest4 {

    @Autowired
    private RestTemplate restTemplate;

    @Test
    public void restTemplate() {
        System.out.println(">>>>>>>>>"+restTemplate);
        ResponseEntity<String> res = restTemplate.getForEntity("https://www.jd.com", String.class);
        System.out.println(res.getBody());
    }
}
