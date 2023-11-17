package com.example.advice;

import com.example.exception.UnauthorizedUser;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<String> invalidHandler(MethodArgumentNotValidException e) {
        return new ResponseEntity<>("User name or password is empty", HttpStatus.BAD_REQUEST);
    }

//    @ExceptionHandler(InvalidCredentials.class)
//    public ResponseEntity<String> unauthorizedHandler(InvalidCredentials e) {
//        System.out.println("Unknown user");
//        return new ResponseEntity<>("Unknown user", HttpStatus.UNAUTHORIZED);
//    }


    @ExceptionHandler(UnauthorizedUser.class)
    public ResponseEntity<String> unauthorizedHandler(UnauthorizedUser e) {
        System.out.println("Unknown user");
        return new ResponseEntity<>("Unknown user", HttpStatus.UNAUTHORIZED);
    }


}
