package life.majiang.community.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class DruidConfig extends WebMvcAutoConfiguration {
    @ConfigurationProperties("spring.datasource")
    @Bean
    public DataSource dataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        return druidDataSource;
    }
}
