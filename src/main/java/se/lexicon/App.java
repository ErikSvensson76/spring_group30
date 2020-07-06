package se.lexicon;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import se.lexicon.data.AppUserDAO;
import se.lexicon.model.AppUser;

public class App
{
    public static void main( String[] args )
    {
        //1: Explain how to create bean with XML
        //2: Try fetching the bean
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        AppUserDAO appUserDAO = context.getBean(AppUserDAO.class);

        System.out.println(appUserDAO.save(new AppUser(null, "test@test.com", "1234", "Testy", "Test address")));

        context.close();
    }
}
