package com.example.loginservice.service;

import com.example.loginservice.dto.UserDTO;
import okhttp3.Response;

import java.io.IOException;

public interface RequestService {
    public Response createUserProfile(UserDTO user) throws IOException;
}
