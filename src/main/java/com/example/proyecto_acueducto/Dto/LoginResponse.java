package com.example.proyecto_acueducto.Dto;

public class LoginResponse {
    private String role;
    private String redirectUrl;
    private String message;
    private String token;

    public LoginResponse() {
    }

    public LoginResponse(String role, String redirectUrl, String message) {
        this.role = role;
        this.redirectUrl = redirectUrl;
        this.message = message;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
