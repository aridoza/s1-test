package com.example.shipment.shipmentservice.service;

import com.example.shipment.shipmentservice.model.Shipment;
import com.example.shipment.shipmentservice.repository.ShipmentRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.util.ReflectionTestUtils;

import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class ShipmentServiceTest {

    @InjectMocks
    ShipmentServiceImpl shipmentService;

    @InjectMocks
    private Shipment shipment;

    @Mock
    ShipmentRepository shipmentRepository;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
        //ReflectionTestUtils.setField(shipmentService, "shipmentRepository", shipmentRepository);
        shipment.setName("shipment_name");
        shipment.setTrackingNumber(123456789L);
    }

    @Test
    public void createShipment_Shipment_Success() {
        when(shipmentRepository.save(any())).thenReturn(shipment);

        Shipment createdShipment = shipmentService.createShipment(shipment);

        assertEquals(shipment.getName(), createdShipment.getName());
        assertEquals(shipment.getTrackingNumber(), createdShipment.getTrackingNumber());
    }
}
