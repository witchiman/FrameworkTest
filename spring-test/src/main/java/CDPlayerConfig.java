import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"model","service"})  //默认是扫描与配置类在相同包下面的类，当然，你也可以自定义扫描一个或多个包路径
//@ComponentScan(basePackageClasses = {CdNumOne.class}) //或者可以直接指定扫描特定类或接口
public class CDPlayerConfig {

}
