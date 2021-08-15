package com.mycompany.mymicrosewrviceapp.cucumber;

import com.mycompany.mymicrosewrviceapp.JhipsterSampleMicroserviceApplicationApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = JhipsterSampleMicroserviceApplicationApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
