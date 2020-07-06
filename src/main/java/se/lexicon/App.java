package se.lexicon;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.lexicon.config.AppConfig;
import se.lexicon.data.AppUserDAO;
import se.lexicon.model.AppUser;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        AppUserDAO appUserDAO = context.getBean(AppUserDAO.class);
        Scanner scanner = context.getBean(Scanner.class);
        System.out.println("Enter something: ");
        System.out.println(scanner.nextLine());

        System.out.println(appUserDAO.save(new AppUser("test@test.com", "1234", "Testy", "Test avenue")));

        context.close();
    }
}
