package com.example.backend.config;

import com.example.backend.model.User;
import com.fasterxml.classmate.TypeResolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;;

@Configuration
@EnableSwagger2WebMvc
public class Swagger2Config {

    @Autowired
    private TypeResolver resolver;

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
            .select()                                  
            .apis(RequestHandlerSelectors.basePackage("com.example.backend"))
            .build()
            /**
             * Reference:
             * https://springfox.github.io/springfox/docs/snapshot/#q27
             */
            .groupName("featureService")
            .useDefaultResponseMessages(false)
            .additionalModels(resolver.resolve(User.class))
        ;
    }

}
