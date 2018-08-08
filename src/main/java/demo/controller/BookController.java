package demo.controller;

import demo.model.Book;
import demo.model.User;
import demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("book")
public class BookController extends BaseController {

    @Autowired
    private BookService bookService;

    @RequestMapping("create")
    private String create(Book book) {
        bookService.create(book);
        return queryAll();
    }

    @RequestMapping("queryAll")
    private String queryAll() {
        User user = (User) session.getAttribute("user");
        session.setAttribute("books", bookService.queryList("queryBooksByUserId", user.getId()));
        return "redirect:/home.jsp";
    }

    @RequestMapping("queryById/{id}")
    private String queryById(@PathVariable long id) {
        session.setAttribute("book", bookService.queryById(id));
        return "redirect:/edit.jsp";
    }

    @RequestMapping("update")
    private String update(Book book) {
        bookService.update(book);
        return queryAll();
    }

    @RequestMapping("remove/{id}")
    private String remove(@PathVariable long id) {
        bookService.remove(id);
        return queryAll();
    }

    @RequestMapping("queryAllBooks")
    private String queryAllBooks() {
        session.setAttribute("books", bookService.queryAll());
        return "redirect:/books.jsp";
    }

    @RequestMapping("queryUserByBookId/{id}")
    private String queryUserByBookId(@PathVariable long id) {
        session.setAttribute("book", bookService.queryOne("queryUserByBookId", id));
        return "redirect:/book.jsp";
    }
}
