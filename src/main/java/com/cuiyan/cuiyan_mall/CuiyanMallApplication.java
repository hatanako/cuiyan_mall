package com.cuiyan.cuiyan_mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cuiyan.cuiyan_mall.mapper")
public class CuiyanMallApplication {

	public static void main(String[] args) {
		SpringApplication.run(CuiyanMallApplication.class, args);
	}

}
