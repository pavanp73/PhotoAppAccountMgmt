package com.pavan.apps.photoapp.api.accountsmgmt.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountMgmtController {

    @GetMapping("/health/check")
    public String status(){
        return "Account Management Microservice is working";
    }
}
