package com.aaa.ribbon;

import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RibbonRule {
    @Bean
    public RandomRule randomRule() {
        return new RandomRule();
    }
}
