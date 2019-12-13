package com.example.client.clientservice.service;

import com.example.client.clientservice.feign.ShipmentClient;
import com.example.client.clientservice.model.Shipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientFEServiceImpl implements ClientFEService {

    @Autowired
    ShipmentClient shipmentClient;

    @Override
    public Shipment getShipment(Long trackingnumber) {
        return shipmentClient.getShipment(trackingnumber);
    }

    @Override
    public Shipment addShipment(Shipment shipment) {
        return shipmentClient.addShipment(shipment);
    }
}
