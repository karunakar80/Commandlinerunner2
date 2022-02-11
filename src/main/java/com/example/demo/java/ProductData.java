package com.example.demo.java;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component("pob")
@ConfigurationProperties(prefix="my.app")

@Setter
@Getter
@ToString
public class ProductData {


private Integer pid;
private String pcode;
private Double pcost;
private List<String> models;
//private Set<String> models;
private Map<String,String> info;
@Autowired
private Vendor vob;
}

