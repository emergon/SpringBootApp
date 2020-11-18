package emergon.service;

import emergon.entity.MyUser;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface MyUserService extends UserDetailsService{

    public void create(MyUser user);
    
}
