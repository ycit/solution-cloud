//package com.ycit.openfeign.feign.config;
//
//import com.kedacom.ctsp.authz.oauth2.client.service.OAuth2AccessTokenService;
//import com.kedacom.ctsp.authz.oauth2.core.vo.AccessToken;
//import com.kedacom.ctsp.web.controller.message.ResponseMessage;
//import feign.RequestInterceptor;
//import feign.RequestTemplate;
//import org.springframework.beans.factory.annotation.Value;
//
//import javax.annotation.Resource;
//
///**
// * rbac 认证拦截器
// *
// * @author chenxiaolei
// * @date 2019/7/12
// */
//public class RbacAuthInterceptor implements RequestInterceptor {
//
//    @Value("${commons.oauth2.client.serverUri}")
//    private String serverUrl;
//
//    @Value("${commons.oauth2.client.client_id}")
//    private String clientId;
//
//    @Value("${commons.oauth2.client.clientSecret}")
//    private String clientSecret;
//
//    @Value("${commons.oauth2.client.grantType}")
//    private String grantType;
//
//    @Value("${commons.oauth2.client.username}")
//    private String username;
//
//    @Value("${commons.oauth2.client.password}")
//    private String password;
//
//    private long lastRefreshTime;
//
//    private String jwtToken;
//
//    @Resource
//    OAuth2AccessTokenService accessTokenService;
//
//    @Override
//    public void apply(RequestTemplate requestTemplate) {
//        if (System.currentTimeMillis() - this.lastRefreshTime > 1800000L) {
//            ResponseMessage<AccessToken> response = this.accessTokenService.requestToken(this.grantType, this.clientId, this.clientSecret, (String)null, (String)null, this.username, this.password, (String)null);
//            this.jwtToken = response.getResult().getJwtToken();
//            this.lastRefreshTime = System.currentTimeMillis();
//        }
//        String[] token = {this.jwtToken};
//        requestTemplate.header("jwt-token", token);
//    }
//}
