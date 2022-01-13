//package com.yeelo.cloud.gateway.filter;
//
//import org.springframework.cloud.gateway.filter.GatewayFilterChain;
//import org.springframework.cloud.gateway.filter.GlobalFilter;
//import org.springframework.core.Ordered;
//import org.springframework.stereotype.Component;
//import org.springframework.web.server.ServerWebExchange;
//import reactor.core.publisher.Mono;
//
//@Component
//public class CustomFilter implements GlobalFilter, Ordered {
//    @Override
//    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
//        return chain.filter(exchange);
//    }
//
//    /**
//     * 提高优先级
//     * @return -1
//     */
//    @Override
//    public int getOrder() {
//        return -1;
//    }
//}
