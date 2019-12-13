package com.example.client.clientservice.service;

import com.example.client.clientservice.model.Shipment;

public interface ClientFEService {
    public Shipment getShipment(Long trackingNumber);
    public Shipment addShipment(Shipment shipment);

}
