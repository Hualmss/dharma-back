package com.dharmaclient.dharmaclient.FeignClient;


import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "http://localhost:8081", path = "/book")
public class BackEndFiegnClient {
}
