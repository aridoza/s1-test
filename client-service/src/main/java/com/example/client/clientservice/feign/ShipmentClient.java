package com.example.client.clientservice.feign;

import com.example.client.clientservice.model.Shipment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "ShipmentClient", url="http://localhost:9001")
public interface ShipmentClient {
    @GetMapping(value = "/shipment/{trackingnumber}")
    public Shipment getShipment(@PathVariable Long trackingnumber);

    @PostMapping(value = "/shipment/addshipment")
    public Shipment addShipment(@RequestBody Shipment shipment);
}