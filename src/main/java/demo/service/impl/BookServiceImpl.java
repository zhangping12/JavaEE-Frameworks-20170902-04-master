package demo.service.impl;

import demo.dao.GenericDao;
import demo.model.Book;
import demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl extends GenericServiceImpl<Book, Long> implements BookService {
    @Override
    @Autowired
    @Qualifier("bookDaoImpl")
    public void setGenericDao(GenericDao<Book, Long> genericDao) {
        super.genericDao = genericDao;
    }
}
