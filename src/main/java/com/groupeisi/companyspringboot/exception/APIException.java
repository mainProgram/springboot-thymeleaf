package com.groupeisi.companyspringboot.exception;

import lombok.*;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class APIException extends RuntimeException {

    String message;
    HttpStatus status;
    LocalDateTime timestamp;
}
