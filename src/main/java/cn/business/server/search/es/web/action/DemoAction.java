package cn.business.server.search.es.web.action;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/demo")
public class DemoAction {

    @RequestMapping("/hello")
    public String helloworld(){
        return "hello world";
    }
}
