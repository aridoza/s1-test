package com.example.shipment.shipmentservice.service;

import com.example.shipment.shipmentservice.model.Shipment;
import com.example.shipment.shipmentservice.repository.ShipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShipmentServiceImpl implements ShipmentService {

    @Autowired
    ShipmentRepository shipmentRepository;

    @Override
    public Shipment createShipment(Shipment shipment) {
        return shipmentRepository.save(shipment);
    }

    @Override
    public Shipment getShipment(Long trackingNumber) {
        return null;
    }
}
