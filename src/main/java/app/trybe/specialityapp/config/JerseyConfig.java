package app.trybe.specialityapp.config;

import app.trybe.specialityapp.SpecialityAppApplication;
import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;

import org.springframework.context.annotation.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.ApplicationPath;



@Configuration
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig {

    private Logger logger = LoggerFactory.getLogger(JerseyConfig.class);


    /**
     * Construtor para o JerseyConfig.
     *
     */
    public JerseyConfig() {
        packages(SpecialityAppApplication.class.getPackageName());
        register(new AbstractBinder() {

            @Override
            protected void configure() {
                logger.info("Configurando binder");
            }
        });
    }
}
