package demo.controller;

import demo.model.Address;
import demo.model.User;
import demo.service.AddressService;
import demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("address")
public class AddressController extends BaseController {

    @Autowired
    private AddressService addressService;

    @Autowired
    private UserService userService;

    @RequestMapping("create")
    private String create(Address address) {
        // TODO: 2018-05-25 service
        User user = userService.queryById(address.getUserId());
        if (user.getAddressId() > 0) {
            request.setAttribute("message", "User has address.");
            return "/createAddress.jsp";
        }
        addressService.create(address);
        user.setAddressId(address.getId());
        userService.update(user);
        return "redirect:/createAddress.jsp";
    }

    @RequestMapping("queryAll")
    private String queryAll() {
        session.setAttribute("addresses", addressService.queryAll());
        return "redirect:/addresses.jsp";
    }

    @RequestMapping("addressUser/{id}")
    private String addressUser(@PathVariable int id) {
        session.setAttribute("address", addressService.queryOne("addressUser", id));
        return "redirect:/addressUser.jsp";
    }
}
 