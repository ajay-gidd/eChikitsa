package com.example.eChikitsaAPIGateway.filter;

import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.function.Predicate;

@Component
public class RouteValidator {

    public static final List<String> openApiEndpoints = List.of(
            "/auth/login",
            "/auth/registerPatient",
            "/auth/welcome",
            "/eureka",
            "/user-handle/api/signUp",
            "/user-handle/hospital/add-hospital",
            "/user-handle/auth/login","/user-handle/auth/login-using-otp","/user-handle/patient/registerPatient","/user-handle/admin/registerDoctor", "/user-handle/auth/reset-password-otp","/user-handle/auth/reset-password","/user-handle/email/sendEmail","/user-handle/email/valOtp"
    );

    public Predicate<ServerHttpRequest> isSecured =
            request -> openApiEndpoints
                    .stream()
                    .noneMatch(uri -> request.getURI().getPath().contains(uri));

}