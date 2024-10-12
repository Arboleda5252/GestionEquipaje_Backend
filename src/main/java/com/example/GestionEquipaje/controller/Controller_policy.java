package com.example.GestionEquipaje.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.GestionEquipaje.model.ChargePolicy;
import com.example.GestionEquipaje.service.Service_policy;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/politica")
public class Controller_policy {
    @Autowired
    private Service_policy service_policy;
    
    @GetMapping
    private ResponseEntity<List<ChargePolicy>> getAllPolicy () {
        return ResponseEntity.ok(service_policy.findAll());
    }
    
}