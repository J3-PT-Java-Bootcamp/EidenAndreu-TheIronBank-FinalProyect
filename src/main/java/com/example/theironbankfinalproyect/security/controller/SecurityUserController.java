package com.example.theironbankfinalproyect.security.controller;


import com.example.theironbankfinalproyect.security.config.KeycloakProvider;
import com.example.theironbankfinalproyect.security.http.requests.CreateUserRequest;
import com.example.theironbankfinalproyect.security.http.requests.LoginRequest;
import com.example.theironbankfinalproyect.security.service.KeycloakAdminClientService;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.representations.AccessTokenResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import javax.ws.rs.BadRequestException;
import javax.ws.rs.core.Response;

@RestController
@RequestMapping("/user")
public class SecurityUserController {
    private final KeycloakAdminClientService kcAdminClient;

    private final KeycloakProvider kcProvider;


    public SecurityUserController(KeycloakAdminClientService kcAdminClient, KeycloakProvider kcProvider) {
        this.kcProvider = kcProvider;
        this.kcAdminClient = kcAdminClient;
    }


    @PostMapping(value = "/create")
    public ResponseEntity<?> createUser(@RequestBody CreateUserRequest user) {
        Response createdResponse = kcAdminClient.createKeycloakUser(user);
        return ResponseEntity.status(createdResponse.getStatus()).build();

    }

    @PostMapping("/get-token")
    public ResponseEntity<AccessTokenResponse> login(@NotNull @RequestBody LoginRequest loginRequest) {
        Keycloak keycloak = kcProvider.newKeycloakBuilderWithPasswordCredentials(loginRequest.getUsername(), loginRequest.getPassword()).build();

        AccessTokenResponse accessTokenResponse = null;
        try {
            accessTokenResponse = keycloak.tokenManager().getAccessToken();
            return ResponseEntity.status(HttpStatus.OK).body(accessTokenResponse);
        } catch (BadRequestException ex) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body(accessTokenResponse);
        }

    }


}
