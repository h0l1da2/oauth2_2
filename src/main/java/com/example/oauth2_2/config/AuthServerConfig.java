//package com.example.oauth2_2.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
//import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
//import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
//import org.springframework.security.oauth2.provider.ClientDetails;
//import org.springframework.security.oauth2.provider.ClientDetailsService;
//import org.springframework.security.oauth2.provider.client.BaseClientDetails;
//import org.springframework.security.oauth2.provider.client.InMemoryClientDetailsService;
//
//import java.util.List;
//import java.util.Map;
//
//@Configuration
//@EnableAuthorizationServer
//public class AuthServerConfig extends AuthorizationServerConfigurerAdapter {
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
//     * ClientDetailsService 인스턴스 설정
//     * 긴 버전
//     * - DB에 클라이언트 세부 정보 저장할 때 쓰기
//     */
////    @Override
////    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
////        InMemoryClientDetailsService clientDetailsService = new InMemoryClientDetailsService();
////
////        // ClientDetails 만들고 클라이언트 세부 정보 설정
////        BaseClientDetails clientDetails = new BaseClientDetails();
////        clientDetails.setClientId("client");
////        clientDetails.setClientSecret("secret");
////        clientDetails.setScope(List.of("read"));
////        clientDetails.setAuthorizedGrantTypes(List.of("password"));
////
////        // InMemoryClientDetailsService 에 ClientDetails 객체 추가
////        clientDetailsService.setClientDetailsStore(
////                Map.of("client", clientDetails)
////        );
////
////        // 권한 부여 서버에서 이용할 수 있게 ClientDetailsService 구성
////        clients.withClientDetails(clientDetailsService);
////    }
//
//    /**
//     * ClientDetailsService 인스턴스 설정
//     * 간단 버전
//     * - DB가 아닌 메모리에 세부 정보 관리
//     */
//    @Override
//    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
//        clients.inMemory()
//                .withClient("client")
//                .secret("secret")
//                .authorizedGrantTypes("password")
//                .scopes("read");
//    }
//}
