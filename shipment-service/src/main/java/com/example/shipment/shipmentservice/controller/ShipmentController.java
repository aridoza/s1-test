package com.example.shipment.shipmentservice.controller;

import com.example.shipment.shipmentservice.model.Shipment;
import com.example.shipment.shipmentservice.service.ShipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ShipmentController {

    @Autowired
    ShipmentService shipmentService;

    @GetMapping("/shipment/{trackingNumber}")
    public Shipment getShipment(@PathVariable Long trackingNumber) {
        return shipmentService.getShipment(trackingNumber);
    }

    @PostMapping("/shipment/addshipment")
    public Shipment addShipment(@RequestBody Shipment shipment) {
        return shipmentService.createShipment(shipment);
    }
}
