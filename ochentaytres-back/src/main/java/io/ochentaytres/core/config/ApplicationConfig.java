package io.ochentaytres.core.config;

import java.util.Properties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration(value="applicationConfig")
@DependsOn("jpaConfig")
/**
 * @author agonriv
 */
public class ApplicationConfig extends Properties{
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
    
    public ApplicationConfig() {
        super();
    }

    /*
    https://docs.spring.io/spring-boot/docs/current/reference/html/howto-logging.html
    
    If you look at base.xml in the spring-boot jar, you can see that it uses some useful System properties that the LoggingSystem takes care of creating for you:
    ${PID}: The current process ID.
    ${LOG_FILE}: Whether logging.file was set in Boot’s external configuration.
    ${LOG_PATH}: Whether logging.path (representing a directory for log files to live in) was set in Boot’s external configuration.
    ${LOG_EXCEPTION_CONVERSION_WORD}
    
    */
}
