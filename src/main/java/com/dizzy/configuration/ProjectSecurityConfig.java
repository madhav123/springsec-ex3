package com.dizzy.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {

        /**
         *  Below is the custom security configurations
         */

        http.authorizeHttpRequests()
                        .requestMatchers("/myAccount").authenticated()
                        .requestMatchers("/myBalance").permitAll()
                .and().formLogin()
                .and().httpBasic();
        return http.build();
    }
    

	
	 @SuppressWarnings("deprecation") 
	 @Bean 
	 public NoOpPasswordEncoder passwordEncoder() { 
		 return  (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
	 
	 }
	 



}
