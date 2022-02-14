package net.setlog.stock.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TradingEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TradingEurekaServerApplication.class, args);
    }

}
