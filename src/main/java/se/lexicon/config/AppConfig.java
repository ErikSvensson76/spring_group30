package se.lexicon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import se.lexicon.data.AppUserInMemoryStorage;

@Configuration
public class AppConfig {

    @Bean
    public AppUserInMemoryStorage appUserInMemoryStorage(){
        return new AppUserInMemoryStorage();
    }

}
