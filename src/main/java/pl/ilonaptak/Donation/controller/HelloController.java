package pl.ilonaptak.Donation.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.ilonaptak.Donation.user.CurrentUser;
import pl.ilonaptak.Donation.user.User;
import pl.ilonaptak.Donation.user.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class HelloController {

    private final UserService userService;

    @RequestMapping("/")
    public String homeAction(Model model){
        return "home/index";
    }

    @GetMapping("/register")
    public String add(Model model) {
        model.addAttribute("user", new User());
        return "home/form";

    }

    @PostMapping("/register")
    public String add(@Valid User user, BindingResult bindingResult, HttpServletRequest request, @AuthenticationPrincipal CurrentUser currentUser) {
        List<User> emailValidation = userService.findAllByEmail(user.getEmail());
        if(!emailValidation.isEmpty()) {
            request.setAttribute("alreadyExist", "Podany adres email już istnieje");
            return "home/form";
        }

        userService.save(user);
        return "redirect:/";
    }


}
