package config;

import model.Author;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig_Bean {
    @Bean
    public Author author(){
        return new Author("Nguyen");
    }
}
