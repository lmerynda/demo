package com.example.demo.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/")
    ResponseEntity<String> home()
    {
        log.info("logging Hello World!");
        return ResponseEntity.ok("Hello World!");
    }

    // @PostMapping("/login")
    // public AuthResponseDto AuthenticateAndGetToken(@RequestBody AuthRequestDto authRequestDTO){
    //     Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequestDTO.username, authRequestDTO.password));
    //     if(authentication.isAuthenticated()){
    //         RefreshTokenDto refreshToken = refreshTokenService.createRefreshToken(authRequestDTO.username);
    //         return new AuthResponseDto(jwtService.GenerateToken(authRequestDTO.username), refreshToken.token);
    //     } else {
    //         throw new UsernameNotFoundException("invalid user request..!!");
    //     }
    // }
}
