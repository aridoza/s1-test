package com.example.shipment.shipmentservice.service;

import com.example.shipment.shipmentservice.model.Shipment;

public interface ShipmentService {
    public Shipment createShipment(Shipment shipment);
    public Shipment getShipment(Long trackingNumber);
}
