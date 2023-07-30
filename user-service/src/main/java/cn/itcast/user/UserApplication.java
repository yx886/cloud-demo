package cn.itcast.user;







import cn.itcast.feign.clients.UserClient;
import cn.itcast.feign.config.DefaultFeignConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@MapperScan("cn.itcast.user.mapper")
@SpringBootApplication
@EnableFeignClients(clients = UserClient.class,defaultConfiguration = DefaultFeignConfiguration.class)
public class UserApplication {
    public static void main(String[] args) {
      SpringApplication.run(UserApplication.class,args);
    }
}
