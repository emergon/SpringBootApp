package emergon.dao;

import emergon.entity.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<MyUser, Integer> {
    
    @Query(value="SELECT u FROM MyUser u WHERE u.username = ?1")
    MyUser findByUsername(String username);
}
