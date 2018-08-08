package demo.dao.impl;

import demo.dao.BookDao;
import demo.model.Book;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl extends GenericDaoImpl<Book, Long> implements BookDao {
}
