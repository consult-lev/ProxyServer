package ru.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private CustomAuthenticationProvider customAuthenticationProvider;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.httpBasic().disable();
		http.authorizeRequests() //
				.antMatchers("/resources/**").permitAll()//
				.anyRequest().authenticated() // .permitAll()//
				// login
				.and().formLogin().loginPage("/login").permitAll();
		http.authenticationProvider(customAuthenticationProvider);
		http.csrf().disable();
	}

}
