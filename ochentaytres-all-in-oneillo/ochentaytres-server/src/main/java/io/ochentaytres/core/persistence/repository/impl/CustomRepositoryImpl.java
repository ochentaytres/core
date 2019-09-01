package io.ochentaytres.core.persistence.repository.impl;

import io.ochentaytres.core.persistence.repository.CustomRepository;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import javax.persistence.EntityManager;
import java.io.Serializable;

/**
 * 
 * @author agonriv
 * 
 */
public class CustomRepositoryImpl<T, ID extends Serializable>
        extends SimpleJpaRepository<T, ID>
        implements CustomRepository<T, ID> {

    private final EntityManager entityManager;

    @SuppressWarnings("unchecked")
	public CustomRepositoryImpl(JpaEntityInformation<?, ?> entityInformation, EntityManager entityManager) {
        super((JpaEntityInformation<T, ?>) entityInformation, entityManager);
        this.entityManager = entityManager;
    }

	public EntityManager getEntityManager() {
		return entityManager;
	}

}
