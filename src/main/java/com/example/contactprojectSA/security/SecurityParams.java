package com.example.contactprojectSA.security;

public interface SecurityParams {
    String JWT_HEADER_NAME="Authorization";

    String SECRET="IT";
    long EXPIRATION=10000*24*3600;
    String HEADER_PREFIX="Bearer ";


}
