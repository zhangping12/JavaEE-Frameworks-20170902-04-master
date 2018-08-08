package demo.controller;

import demo.model.User;
import demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("user")
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    private static final String AVATAR_PATH = "/avatars";

    @RequestMapping("signUp")
    private String signUp(User user, @RequestParam MultipartFile avatarFile) throws IOException {

        // get upload avatar file
        String avatarPath = application.getRealPath(AVATAR_PATH);
        avatarFile.transferTo(new File(avatarPath, avatarFile.getOriginalFilename()));

        user.setAvatar(avatarFile.getOriginalFilename());

        if (userService.signUp(user)) {
            return "redirect:/index.jsp";
        } else {
            request.setAttribute("message", "Username is existed.");
            return "/signUp.jsp";
        }
    }

    @RequestMapping("signIn")
    private String signIn(User user) {
        user = userService.signIn(user);
        if (user != null) {
            session.setAttribute("user", user);
            return "redirect:/book/queryAll";
        }
        request.setAttribute("message", "Invalid username or password.");
        return "/index.jsp";
    }

    @RequestMapping("signOut")
    private String signOut() {
        session.invalidate();
        return "redirect:/index.jsp";
    }

    @RequestMapping("queryAllUsers")
    private String queryAllUsers() {
        session.setAttribute("users", userService.queryList("queryAllUsers", null));
        return "redirect:/userBooks.jsp";
    }

    @RequestMapping("toCreateAddress")
    private String toCreateAddress() {
        session.setAttribute("users", userService.queryAll());
        return "redirect:/createAddress.jsp";
    }

    @RequestMapping("queryAll")
    private String queryAll() {
        session.setAttribute("users", userService.queryAll());
        return "redirect:/users.jsp";
    }

    @RequestMapping("userAddress/{id}")
    private String userAddress(@PathVariable int id) {
        session.setAttribute("user", userService.queryOne("userAddress", id));
        return "redirect:/userAddress.jsp";
    }
}
