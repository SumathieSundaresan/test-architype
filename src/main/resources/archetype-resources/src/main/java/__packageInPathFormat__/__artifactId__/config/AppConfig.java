package ${package}.${artifactId}.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import ${package}.${artifactId}.controllers.VersionController;

@Configuration
@EnableSwagger2
public class AppConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(basePackage(VersionController.class.getPackage().getName()))
                .paths(PathSelectors.any())
                .build();
    }

    @Bean
    public VersionController versionController(@Value("${build.version}") String buildVersion,
                                               @Value("${build.timestamp}") String buildTimestamp) {
        return new VersionController(buildVersion, buildTimestamp);
    }


}

