package com.sample.seungdols;

import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
    scanBasePackages = {"com.sample.seungdols"},
    exclude = {
        MybatisAutoConfiguration.class
    }
)
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
