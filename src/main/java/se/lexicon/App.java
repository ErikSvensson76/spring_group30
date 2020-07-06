package se.lexicon;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.lexicon.config.AppConfig;
import se.lexicon.data.AppUserDAO;
import se.lexicon.model.AppUser;

public class App
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        AppUserDAO appUserDAO = context.getBean(AppUserDAO.class);

        System.out.println(appUserDAO.save(new AppUser("test@test.com", "1234", "Testy", "Test street")));

        context.close();
    }
}
