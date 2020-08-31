package ab.techstack.spring.skeletonservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloSpringboot {

    Logger logger = LoggerFactory.getLogger(HelloSpringboot.class);
    @GetMapping
    @ResponseBody
    public String helloSpringboot(){
        logger.info("Hello Springboot");
        return "Hello Springboot";
    }

    @GetMapping("/name")
    @ResponseBody
    public String getColor(@RequestParam("name") String name){
        logger.info("Hello "+name);
        return "Hello "+name;
    }
}
