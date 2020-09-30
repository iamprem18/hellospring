package com.prem.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.spi.AbstractLogger;
import org.slf4j.ILoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

    private static Logger logger = LogManager.getLogger(DemoController.class);
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("Hey Prem !!");
        logger.info("This is your log");
        logger.error("It is error message");
        logger.warn("It is warn message");

    }

}
@RestController
@RequestMapping(path = "/")
class DemoController {

    @RequestMapping(value="print/{msg}", method = RequestMethod.GET)
    public String print(@PathVariable (value= "") String msg) {
        return "Prem "+msg;
    }
}
