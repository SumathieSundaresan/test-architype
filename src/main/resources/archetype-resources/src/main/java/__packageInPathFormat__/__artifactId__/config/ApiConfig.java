package ${package}.${artifactId}.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class ApiConfig {


    @Bean
    public VersionController versionController(@Value("${build.version}") String buildVersion,
                                               @Value("${build.timestamp}") String buildTimestamp) {
        return new VersionController(buildVersion, buildTimestamp);
    }


}

