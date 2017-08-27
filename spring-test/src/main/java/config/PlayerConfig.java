package config;

import model.CompacDisc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import service.CDPlayer;
import service.MediaPlayer;

@Import(CDConfig.class)
//@ImportResource("classpath:cd.xml")   //引入xml配置的CD类
@Configuration
public class PlayerConfig {


    @Bean
    public MediaPlayer mediaPlayer(CompacDisc compacDisc) {
        return new CDPlayer(compacDisc);
    }

}
