package io.ochentaytres.core.persistence.repository;

import io.ochentaytres.core.persistence.entity.Parameter;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ParameterDao extends CustomRepository<Parameter, Long>{
    public final String JPQL_GET_PARAMETERS = "SELECT p FROM Parameter p WHERE p.active = true ";

    @Query(JPQL_GET_PARAMETERS)
    List<Parameter> getPrameters();
}