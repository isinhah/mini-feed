package com.api.springsecurity.dto;

public record LoginResponse(String accessToken, Long expiresIn) {
}