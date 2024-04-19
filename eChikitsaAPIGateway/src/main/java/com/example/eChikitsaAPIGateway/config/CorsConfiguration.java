//package com.example.eChikitsaAPIGateway.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.cors.CorsConfigurationSource;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//
//import java.util.List;
//@Configuration
//public class CorsConfiguration {
//    @Bean
//    public static CorsConfigurationSource getConfigurationSource(){
//        var corsConfiguration = new org.springframework.web.cors.CorsConfiguration();
//        corsConfiguration.addAllowedMethod("OPTIONS");
//        corsConfiguration.setAllowedMethods(List.of("*"));
//        corsConfiguration.addAllowedHeader("*");
//
//        corsConfiguration.setAllowedOrigins(List.of("http://localhost:3000", "http://localhost:8080"));
//        corsConfiguration.setAllowedHeaders(List.of("Content-Type","text/plain","Authorization"));
//
//        var source = new UrlBasedCorsConfigurationSource();
//        source.registerCorsConfiguration("/**", corsConfiguration);
//
//        return  source;
//    }
//}
