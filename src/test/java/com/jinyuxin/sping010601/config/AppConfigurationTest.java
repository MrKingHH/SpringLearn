package com.jinyuxin.sping010601.config;


import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.web.client.RestTemplate;

/**
 * @author 金余新
 * @date 2021/1/6 14:54
 */
//@ExtendWith(SpringExtension.class)
//@ContextConfiguration(classes = AppConfiguration.class)
@SpringJUnitConfig(AppConfiguration.class)
public class AppConfigurationTest {

    @Autowired
    private RestTemplate restTemplate;

    @org.junit.jupiter.api.Test
    public void restTemplate() {
        System.out.println(">>>>>>>>>"+restTemplate);
        ResponseEntity<String> res = restTemplate.getForEntity("https://www.jd.com", String.class);
        System.out.println(res.getBody());
    }
}