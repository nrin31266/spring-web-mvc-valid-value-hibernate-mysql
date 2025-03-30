package com.rin.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rin.app.entity.User;

import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

@Repository
public class UserDao {
	@Autowired
    private SessionFactory sessionFactory;


	public void saveUser(User user) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.persist(user);
    }
	
	public List<User> getAllUser() {
		Session currentSection = sessionFactory.getCurrentSession();
		CriteriaBuilder cb = currentSection.getCriteriaBuilder();
		CriteriaQuery<User> cq = cb.createQuery(User.class);
		Root<User> root= cq.from(User.class);
		cq.select(root);
		Query query = currentSection.createQuery(cq);
		return query.getResultList();
	}
}
