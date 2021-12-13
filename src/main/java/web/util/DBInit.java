//package web.util;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import web.model.Role;
//import web.model.User;
//import web.service.RoleService;
//import web.service.UserService;
//
//import javax.annotation.PostConstruct;
//import java.util.HashSet;
//import java.util.Set;
//
//@Component
//public class DBInit {
//    private final UserService userService;
//    private final RoleService roleService;
//
//    @Autowired
//    public DBInit(UserService userService, RoleService roleService) {
//        this.userService = userService;
//        this.roleService = roleService;
//    }
//
//    @PostConstruct
//    private void dataBaseInit() {
//        Role roleAdmin = new Role("ADMIN");
//        Role roleUser = new Role("USER");
//        Set<Role> adminSet = new HashSet<>();
//        Set<Role> userSet = new HashSet<>();
//
//        roleService.addRole(roleAdmin);
//        roleService.addRole(roleUser);
//
//        adminSet.add(roleAdmin);
//        adminSet.add(roleUser);
//        userSet.add(roleUser);
//
//        User newUser = new User("Ivan", "Ivanov", 23, "ivan@mail.com", "ivan",
//                "100", userSet);
//        User admin = new User("Petr", "Petrov", 30, "petr@gmail.com", "petr",
//                "100", adminSet);
//
//        userService.saveUser(newUser);
//        userService.saveUser(admin);
//    }
//}
