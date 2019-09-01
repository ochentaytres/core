package io.ochentaytres.core.adapter;

import io.ochentaytres.core.RestMappings;
import io.ochentaytres.core.persistence.entity.Parameter;
import io.ochentaytres.core.persistence.repository.ParameterDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class ParameterService {

    @Autowired
    private transient ParameterDao parameterDao;

    @PostMapping(value = RestMappings.CORE_PARAMETER_ADD)
    public void addParameter(@RequestBody Parameter parameter){
        parameterDao.save(parameter);
    }

    @GetMapping(value = RestMappings.CORE_PARAMETER_UPDATE)
    public void updateParameter(Parameter parameter){
        parameterDao.save(parameter);
    }

    @GetMapping(value = RestMappings.CORE_PARAMETER_LIST)
    public List<Parameter> listParameters(){
        List<Parameter> pList = new ArrayList<Parameter>();

        pList.addAll(parameterDao.getPrameters());

        return pList;
    }

    @GetMapping(value = RestMappings.CORE_PARAMETER_DELETE)
    public String deleteParameter(Parameter parameter){
        return "Delete parameter " + parameter;
    }

}
