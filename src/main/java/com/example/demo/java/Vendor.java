package com.example.demo.java;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component("vob")
@Setter
@Getter
@ToString
public class Vendor {
	
	private Integer vid;
	private String vcode;

}
