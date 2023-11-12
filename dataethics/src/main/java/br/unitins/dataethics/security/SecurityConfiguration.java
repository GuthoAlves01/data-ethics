package br.unitins.dataethics.security;

//@Configuration
//@EnableWebSecurity
public class SecurityConfiguration {

//    @Bean
//    public WebSecurityCustomizer webSecurityCustomizer() {
//        return (web) -> web.ignoring()
//                // Spring Security should completely ignore URLs starting with /resources/
//                .requestMatchers("/resources/**");
//    }
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http.authorizeHttpRequests().requestMatchers("/list").hasRole("ADMIN, USER")
//                .and()
//                .authorizeHttpRequests().requestMatchers("/public/**").permitAll();
//        return http.build();
//    }
//
//    @Bean
//    public UserDetailsService userDetailsService() {
//        UserDetails user = User.withDefaultPasswordEncoder()
//                .username("user")
//                .password("password")
//                .roles("USER")
//                .build();
//        UserDetails admin = User.withDefaultPasswordEncoder()
//                .username("admin")
//                .password("password")
//                .roles("ADMIN", "USER")
//                .build();
//        return new InMemoryUserDetailsManager(user, admin);
//    }

}
