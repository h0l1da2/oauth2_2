package com.example.oauth2_2.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;

/**
 * 갱신 토큰 그랜트 유형
 */
@Configuration
@EnableAuthorizationServer
public class AuthServerConfigD extends AuthorizationServerConfigurerAdapter {

    // WebSecurityConfig 에서 빈으로 등록한 AuthenticationManager
    @Autowired
    private AuthenticationManager authenticationManager;

    // AuthenticationManager 설정하기
    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        endpoints.authenticationManager(authenticationManager);
    }

    /**
     * 갱신 토큰 그랜트 유형
     * - password 또는 Authorization_code 에서 같이 사용
     * 액세스 토큰과 함께 갱신 토큰도 발급해준다
     */
    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory()
                .withClient("client")
                .secret("secret")
                // 클라이언트의 승인된 그랜트 유형에서 refresh_token 추가
                .authorizedGrantTypes("password", "refresh_token")
                .scopes("read")
                ;
    }


}
