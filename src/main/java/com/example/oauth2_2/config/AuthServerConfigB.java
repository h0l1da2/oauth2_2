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
// * 암호 코드 그랜트 유형
// */
//@Configuration
//@EnableAuthorizationServer
//public class AuthServerConfigB extends AuthorizationServerConfigurerAdapter {
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
//     * 암호 코드 그랜트 유형 설정
//     * redirectUri 를 설정해줘야 함
//     */
////    @Override
////    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
////        clients.inMemory()
////                .withClient("client")
////                .secret("secret")
////                .authorizedGrantTypes("authorization_code")
////                .scopes("read")
////                .redirectUris("http://localhost:8080/home");
////    }
//
//    /**
//     * 클라이언트마다 그랜트 유형이 다르다면 ?
//     */
//    @Override
//    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
//        clients.inMemory()
//                .withClient("client1")
//                .secret("secret1")
//                .authorizedGrantTypes("authorization_code")
//                .scopes("read")
//                .redirectUris("http://localhost:8080/home")
//
//                .and()
//                .withClient("client2")
//                .secret("secret2")
//                // 승인 코드, 암호, 갱신 토큰 허가 모두 이용 가능
//                .authorizedGrantTypes("authorization_code", "password", "refresh_token")
//                .scopes("read")
//                .redirectUris("http://localhost:8080/home");
//    }
//
//
//}
