package se.lexicon.data;

import se.lexicon.model.AppUser;

import java.util.Optional;

public interface AppUserDAO {
    AppUser save(AppUser user);
    Optional<AppUser> findById(Integer id);
    boolean delete(Integer id);
}
