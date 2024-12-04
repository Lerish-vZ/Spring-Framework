package tacos.security;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.
                                              UserDetailsService;
import org.springframework.security.core.userdetails.
                                       UsernameNotFoundException;
import org.springframework.stereotype.Service;

import tacos.User;
import tacos.data.UserRepository;

@Service
public class UserRepositoryUserDetailsService 
        implements UserDetailsService {

  private UserRepository userRepo;

  @Autowired
  public UserRepositoryUserDetailsService(UserRepository userRepo) {
    this.userRepo = userRepo;
  }
  
  @Override
  public UserDetails loadUserByUsername(String username) //accepts a username and uses it to look up a UserDetails object
      throws UsernameNotFoundException {
    User user = userRepo.findByUsername(username);
    if (user != null) {
      return user;
    }
    throw new UsernameNotFoundException(
                    "User '" + username + "' not found");
  }

}

/*
The userDetailsService() method is given a UserRepository as a parameter. To
create the bean, it returns a lambda that takes a username parameter and uses it to call
findByUsername() on the given UserRepository.
The loadByUsername() method has one simple rule: it must never return null.
Therefore, if the call to findByUsername() returns null, the lambda will throw a
UsernameNotFoundException (which is defined by Spring Security). Otherwise, the
User that was found will be returned.
 */
