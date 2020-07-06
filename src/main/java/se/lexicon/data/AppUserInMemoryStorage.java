package se.lexicon.data;

import org.springframework.stereotype.Component;
import se.lexicon.model.AppUser;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Component
public class AppUserInMemoryStorage implements AppUserDAO {

    private Set<AppUser> appUsers = new HashSet<>();

    @Override
    public AppUser save(AppUser user) {
        if(user.getId() == null){
            appUsers.add(user);
        }else {
            Optional<AppUser> appUserOptional = findById(user.getId());
            AppUser original = appUserOptional.orElseThrow(IllegalArgumentException::new);
            original.setName(user.getName());
            original.setAddress(user.getAddress());
            original.setPassword(user.getPassword());
            original.setEmail(user.getEmail());
        }
        return user;
    }

    @Override
    public Optional<AppUser> findById(Integer id) {
        if(id == null) throw  new IllegalArgumentException();
        return appUsers.stream()
                .filter(appUser -> appUser.getId().equals(id))
                .findFirst();
    }

    @Override
    public boolean delete(Integer id) {
        AppUser appUser = findById(id).orElseThrow(IllegalArgumentException::new);
        return appUsers.remove(appUser);
    }
}
