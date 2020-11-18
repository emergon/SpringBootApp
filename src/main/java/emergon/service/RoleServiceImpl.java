package emergon.service;

import emergon.dao.RoleDao;
import emergon.entity.Role;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author user
 */
@Service
@Transactional
public class RoleServiceImpl implements RoleService{

    @Autowired
    RoleDao rdao;
    
    @Override
    public List<Role> getRoles() {
        return rdao.findAll();
    }
    
}
