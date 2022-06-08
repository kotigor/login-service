package com.example.loginservice.service;

import com.example.loginservice.dto.UserDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class RequestServiceImplementation implements RequestService {
    @Value("${USER_SERVICE_URL}")
    private String userServiceUrl;
    private final OkHttpClient httpClient = new OkHttpClient();
    public Response createUserProfile(UserDTO user) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(user);
        RequestBody body = RequestBody.create(MediaType.parse("application/json"), json);
        Request request = new Request.Builder()
                .url(userServiceUrl + "/s/create")
                        .addHeader("Content-Type", "application/json")
                        .post(body)
                        .build();
        Call call = httpClient.newCall(request);
        return call.execute();
    }
}
