import model.CdNumOne;
import model.CompacDisc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import service.CDPlayer;
import service.MediaPlayer;

@Configuration
public class CDPlayerConfig {

    @Bean                               //相当于在xml中添加<bean id="CdNumOne" class="model.CdNumOne"/>
    public CompacDisc compacDisc() {    //如果要指定类名,@Bean后面加上类似(name="MyName")这样的属性即可。
        return new CdNumOne();
    }

    @Bean
    public MediaPlayer mediaPlayer(CompacDisc compacDisc) {
        return new CDPlayer(compacDisc);
    }
}
