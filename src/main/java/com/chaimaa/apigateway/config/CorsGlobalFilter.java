//package com.chaimaa.apigateway.config;
//
//import org.springframework.cloud.gateway.filter.GatewayFilterChain;
//import org.springframework.cloud.gateway.filter.GlobalFilter;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.Ordered;
//import org.springframework.stereotype.Component;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.CorsConfigurationSource;
//import org.springframework.web.cors.reactive.CorsWebFilter;
//import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
//import org.springframework.web.filter.CorsFilter;
//import org.springframework.web.server.ServerWebExchange;
//import org.springframework.web.util.pattern.PathPatternParser;
//import reactor.core.publisher.Mono;
//
//import java.util.Arrays;
//import java.util.Collections;
//
////@Component
////public class CorsGlobalFilter {
////
//////    @Override
//////    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
//////        exchange.getResponse().getHeaders().add("Access-Control-Allow-Origin", "*");
//////        exchange.getResponse().getHeaders().add("Access-Control-Allow-Methods", "GET, PUT, POST, DELETE, OPTIONS");
//////        exchange.getResponse().getHeaders().add("Access-Control-Allow-Headers", "Origin, Content-Type, Accept");
//////        return chain.filter(exchange);
//////    }
//////
//////    @Override
//////    public int getOrder() {
//////        return Ordered.HIGHEST_PRECEDENCE;
//////    }
////@Bean
////public CorsFilter corsFilter() {
////    final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
////    final CorsConfiguration config = new CorsConfiguration();
////    config.setAllowedOrigins(Collections.singletonList("http://localhost:4200")); // Provide list of origins if you want multiple origins
////    config.setAllowedHeaders(Arrays.asList("Origin", "Content-Type", "Accept"));
////    config.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "OPTIONS", "DELETE", "PATCH"));
////    config.setAllowCredentials(true);
////    source.registerCorsConfiguration("/**", config);
////    return new CorsFilter((CorsConfigurationSource) source);
////}
////}
//@Configuration
//public class CorsGlobalFilter {
//
//    @Bean
//    public CorsWebFilter corsFilter() {
//        CorsConfiguration config = new CorsConfiguration();
//        config.setAllowCredentials(true);
//        config.addAllowedOrigin("http://localhost:4200");
//        config.addAllowedHeader("*");
//        config.addAllowedMethod("*");
//
//        org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource source =
//                new org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource(new PathPatternParser());
//        source.registerCorsConfiguration("/**", config);
//
//        return new CorsWebFilter(source);
//    }
//}
