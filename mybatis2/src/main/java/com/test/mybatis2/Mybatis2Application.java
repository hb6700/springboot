package com.test.mybatis2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//패키지 스캔 작업 > 메인클래스 

@SpringBootApplication
//@ComponentScan(basePackages = "com.test.controller")
@MapperScan(basePackages="com.test.mybatis.mapper")
public class Mybatis2Application {

	public static void main(String[] args) {
		SpringApplication.run(Mybatis2Application.class, args);
	}

}
