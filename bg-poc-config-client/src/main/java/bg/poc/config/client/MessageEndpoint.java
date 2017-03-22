package bg.poc.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Alex Belikov
 */
@RestController
@RefreshScope
public class MessageEndpoint {

    @Value("${message:BG Conifg POC default value}")
    private String message;

    @Value("${password}")
    private String password;

    @GetMapping
    public String message() {
        return message;
    }

    @GetMapping("/password")
    public String password() {
        return password;
    }

}
