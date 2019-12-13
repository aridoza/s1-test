package com.example.shipment.shipmentservice.repository;

import com.example.shipment.shipmentservice.model.Shipment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShippingRepository extends CrudRepository<Shipment, Long> {
}
