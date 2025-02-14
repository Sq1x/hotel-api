package com.example.hotelapi.repository;

import com.example.hotelapi.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
    List<Hotel> findByCityOrBrand(String city, String brand);
}