package com.korea.test.Config;


import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@RequiredArgsConstructor
@Configuration
@EnableWebSecurity
@EnableMethodSecurity(prePostEnabled = true)
public class SecurityConfig {

    @Bean
    SecurityFilterChain chain (HttpSecurity http) throws Exception {

        http .authorizeHttpRequests(authorize -> authorize.requestMatchers("/**").permitAll())

                .csrf(csrf -> csrf.ignoringRequestMatchers(new AntPathRequestMatcher("/**")));

        return http.build();
    }

}
