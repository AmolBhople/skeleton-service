package ab.techstack.spring.skeletonservice.controller;

import io.micrometer.core.annotation.Timed;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
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

    private final Counter helloCounter;

    public HelloSpringboot(MeterRegistry registry) {

        this.helloCounter = Counter.builder("api.hello").register(registry);
    }



    @GetMapping
    @ResponseBody
    public String helloSpringboot(){
        logger.info("Hello Springboot");
        helloCounter.increment();
        return "Hello Springboot";
    }

    @GetMapping("/name")
    @ResponseBody
    @Timed(value = "nameAPI")
    public String getColor(@RequestParam("name") String name){
        logger.info("Hello "+name);
        return "Hello "+name;
    }
}
