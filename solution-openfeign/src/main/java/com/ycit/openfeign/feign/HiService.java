package com.ycit.openfeign.feign;

import com.ycit.openfeign.feign.config.FeignConfig;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chenxiaolei
 * @date 2019/9/24
 */
@FeignClient(name = "hi", url = "localhost:7070", decode404 = true, configuration = {FeignConfig.class})
public interface HiService {

    @RequestMapping("/hi/{name}")
    void hi(@PathVariable("name")String name);

    @RequestMapping("/hi")
    void sayHi();

}
