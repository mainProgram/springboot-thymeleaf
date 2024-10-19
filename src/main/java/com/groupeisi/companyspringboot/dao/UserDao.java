package com.groupeisi.companyspringboot.dao;

import com.groupeisi.companyspringboot.entity.UserEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@AllArgsConstructor
public class UserDao {

    EntityManager em;

    public Optional<UserEntity> login(String email, String password) {

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<UserEntity> cr = cb.createQuery(UserEntity.class);
        Root<UserEntity> user = cr.from(UserEntity.class);
        //Predicate pour la clause where
        Predicate predicateEmail = cb.equal(user.get("email"), email);
        Predicate predicatePwd = cb.equal(user.get("password"), password);
        Predicate finalPredicate = cb.and(predicateEmail, predicatePwd);

        cr.select(user);
        cr.where(finalPredicate);

        return Optional.ofNullable(em.createQuery(cr).getSingleResult());
    }
}
