package com.dao;

import com.model.UsersEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

    private EntityManager entityManager = Persistence.createEntityManagerFactory("NewPersistenceUnit").createEntityManager();

    public List<UsersEntity> addUser(UsersEntity newUser) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.merge(newUser);
        transaction.commit();
        return getAllUsers();
    }

    public List<UsersEntity> getAllUsers() {
        Query nativeQuery = entityManager.createNativeQuery("SELECT * FROM users", UsersEntity.class);
        return nativeQuery.getResultList();
    }
}
