package com.mateus_lima.service.notification.controller;

import lombok.Builder;

@Builder
public record NotificationRequestDTO(String message, String email){}
