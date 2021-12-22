package com.team1.spring_hibernate.dao;

import com.team1.spring_hibernate.entity.BookAuthor;
import com.team1.spring_hibernate.entity.BookCopies;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;


@Repository
public class BookCopiesDAOImpl implements BookCopiesDAO{


    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<BookCopies> getAllBookCopy() {
        Session session = sessionFactory.getCurrentSession();
        List<BookCopies> list = session.createQuery("from BookCopies", BookCopies.class).getResultList();
        return list;
    }
}
