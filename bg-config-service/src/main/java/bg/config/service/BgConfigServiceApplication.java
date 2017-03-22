package bg.config.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/*

keytool -genkeypair -alias config-server-key -keyalg RSA \
  -dname "CN=Config Server,OU=BG,O=BG" \
  -keypass changeme -keystore config-server.jks -storepass bg-poc
*/


@EnableConfigServer
@SpringBootApplication
public class BgConfigServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BgConfigServiceApplication.class, args);
    }
}
