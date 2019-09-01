package io.ochentaytres.core.persistence.repository;

import org.springframework.data.repository.NoRepositoryBean;
import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;

/**
 * 
 * @author agonriv
 * @param <T>
 * @param <ID>
 * 
 */
@NoRepositoryBean
public interface CustomRepository<T, ID extends Serializable> extends CrudRepository<T, ID> {
    

}