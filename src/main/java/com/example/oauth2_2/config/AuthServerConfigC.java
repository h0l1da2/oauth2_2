//package com.example.oauth2_2.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
//import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
//import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
//
///**
// * 클라이언트 자격 증명 그랜트 유형
// */
//@Configuration
//@EnableAuthorizationServer
//public class AuthServerConfigC extends AuthorizationServerConfigurerAdapter {
//
//    // WebSecurityConfig 에서 빈으로 등록한 AuthenticationManager
//    @Autowired
//    private AuthenticationManager authenticationManager;
//
//    // AuthenticationManager 설정하기
//    @Override
//    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
//        endpoints.authenticationManager(authenticationManager);
//    }
//
//    /**
//     * 클라이언트 자격 증명 그랜트 유형
//     */
//    @Override
//    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
//        clients.inMemory()
//                .withClient("client")
//                .secret("secret")
//                .authorizedGrantTypes("client_credentials")
//                .scopes("info")
//                ;
//    }
//
//
//}
