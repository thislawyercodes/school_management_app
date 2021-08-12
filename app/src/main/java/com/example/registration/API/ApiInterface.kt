package com.example.registration.API

import com.example.registration.models.LoginRequest
import com.example.registration.models.LoginResponse
import com.example.registration.models.RegistrationRequest
import com.example.registration.models.RegistrationResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiInterface {
@POST("/students/register")

fun registerStudent(@Body registrationRequest: RegistrationRequest):Call<RegistrationResponse>

@POST("/students/register")
fun logInStudent(@Body loginRequest: LoginRequest):Call<LoginResponse>

}