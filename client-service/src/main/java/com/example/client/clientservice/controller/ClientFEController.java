package com.example.client.clientservice.controller;

import com.example.client.clientservice.model.Shipment;
import com.example.client.clientservice.service.ClientFEService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class ClientFEController {
    @Autowired
    ClientFEService clientFEService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello world";
    }

    @GetMapping("/clientfe/shipment/{trackingnumber}")
    public Shipment getShipment(@PathVariable Long trackingnumber) {
        return clientFEService.getShipment(trackingnumber);
    }

    @PostMapping("/clientfe/addshipment")
    public Shipment addShipment(@RequestBody Shipment shipment) {
        return clientFEService.addShipment(shipment);
    }
}
