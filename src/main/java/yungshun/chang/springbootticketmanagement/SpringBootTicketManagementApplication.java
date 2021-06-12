package yungshun.chang.springbootticketmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("yungshun.chang")
@SpringBootApplication
public class SpringBootTicketManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTicketManagementApplication.class, args);
    }

}
