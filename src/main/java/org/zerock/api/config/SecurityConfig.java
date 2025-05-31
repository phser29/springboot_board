package org.zerock.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
	
	 @Bean
	    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
	        http
	            .csrf(csrf -> csrf.disable()) // 필요시 활성화
	            .authorizeHttpRequests(auth -> auth
	                .requestMatchers(
	                    "/css/**", "/js/**", "/images/**", "/webjars/**"
	                ).permitAll()
	                .requestMatchers("/", "/login", "/signup", "/error").permitAll()
	                .anyRequest().authenticated()
	            )
	            .formLogin(form -> form
	                .loginPage("/login")
	                .defaultSuccessUrl("/")
	                .permitAll()
	            )
	            .logout(logout -> logout
	                .logoutUrl("/logout")
	                .logoutSuccessUrl("/")
	                .permitAll()
	            );
	        return http.build();
	    }
}
