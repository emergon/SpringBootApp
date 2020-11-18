package emergon.dao;

import emergon.entity.MyUser;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<MyUser, Integer> {
    
    //@Query("SELECT u FROM MyUser u WHERE u.username = ?1")
    MyUser findByUsername(String username);
}
