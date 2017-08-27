package config;

import model.CDNumOne;
import model.CompacDisc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDConfig {
    @Bean
    public CompacDisc compacDisc() {
        return new CDNumOne();
    }

}
