package com.xpf.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.xpf.mbg.mapper","com.xpf.dao"})
public class MyBatisConfig {
}
