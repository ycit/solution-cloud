//package com.ycit.openfeign.feign;
//
//
//import com.ycit.openfeign.dto.ResponseResult;
//import com.ycit.openfeign.dto.UserDep;
//import com.ycit.openfeign.feign.config.RbacFeignConfiguration;
//import org.springframework.cloud.netflix.feign.FeignClient;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//@FeignClient(name = "user", url = "${commons.oauth2.client.serverUri}", configuration = RbacFeignConfiguration.class)
//public interface UserFeign {
//
//    @GetMapping(value = "/user")
//    ResponseResult<UserDep> getUserByDeptId(@RequestParam("f_eq_department.id") String deptId);
//
//    @GetMapping(value = "/user")
//    ResponseResult<UserDep> getUserByUsername(@RequestParam("f_like_username") String userName);
//
//}
