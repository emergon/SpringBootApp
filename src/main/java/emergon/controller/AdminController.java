package emergon.controller;

import emergon.entity.MyUser;
import emergon.entity.Role;
import emergon.service.MyUserService;
import emergon.service.RoleService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")//We write here the URL that we want our methods to inherit
public class AdminController {

    @Autowired
    MyUserService myUserService;
    @Autowired
    RoleService roleService;

    @ModelAttribute("roloi")
    public List<Role> getRoles(){
        return roleService.getRoles();
    }
    
    @GetMapping
    public String showAdminPage() {
        return "admin/adminHome";//WEB-INF/view/admin/adminHome.jsp
    }

    @GetMapping("/create")
    public String showCreateUserPage(Model model) {
        model.addAttribute("user", new MyUser());
        return "admin/userForm";//WEB-INF/view/admin/adminHome.jsp
    }

    @PostMapping("/create")
    public String createUser(@ModelAttribute("user") MyUser user) {
        myUserService.create(user);
        return "admin/adminHome";
    }

}
