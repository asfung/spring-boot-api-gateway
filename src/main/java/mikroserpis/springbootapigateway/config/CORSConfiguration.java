package mikroserpis.springbootapigateway.config;

import java.util.Arrays;
import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

@Configuration
public class CORSConfiguration {

    @Bean
    public CorsWebFilter corsWebFilter(){
        final UrlBasedCorsConfigurationSource srcConfigurationSource = new UrlBasedCorsConfigurationSource();
        CorsConfiguration corsconfig = new CorsConfiguration();
        corsconfig.setAllowedOrigins(Collections.singletonList("*"));
        corsconfig.setMaxAge(7200l);
        corsconfig.setAllowedMethods(Arrays.asList("POST", "GET"));
        corsconfig.addAllowedHeader("*");
        srcConfigurationSource.registerCorsConfiguration("/**", corsconfig);
        return new CorsWebFilter(srcConfigurationSource);
    }
 
}
