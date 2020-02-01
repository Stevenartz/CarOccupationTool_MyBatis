package com.uls.caroccupationtool;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

//@Configuration
@MapperScan("com.uls.caroccupationtool.jdbc.mapper")
@SpringBootApplication
public class CarOccupationToolApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(CarOccupationToolApplication.class, args);
	}
	
}
