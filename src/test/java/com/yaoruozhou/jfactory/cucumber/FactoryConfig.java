package com.yaoruozhou.jfactory.cucumber;

import com.github.leeonky.jfactory.JFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactoryConfig {

    @Bean
    public JFactory factorySet() {
        return new EntityFactory();
    }

}
