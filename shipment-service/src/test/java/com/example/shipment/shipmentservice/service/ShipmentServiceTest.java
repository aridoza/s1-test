package com.example.shipment.shipmentservice.service;

import com.example.shipment.shipmentservice.model.Shipment;
import com.example.shipment.shipmentservice.repository.ShipmentRepository;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ShipmentServiceTest {

    @InjectMocks
    ShipmentServiceImpl shipmentService;

    @Mock
    private Shipment shipment;

    @Mock
    ShipmentRepository shipmentRepository;
}
