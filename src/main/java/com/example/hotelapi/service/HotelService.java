package com.example.hotelapi.service;

import com.example.hotelapi.model.Hotel;
import com.example.hotelapi.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService {
    @Autowired
    private HotelRepository hotelRepository;

    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    public Hotel getHotelById(Long id) {
        return hotelRepository.findById(id).orElse(null);
    }

    public Hotel createHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    public void addAmenities(Long id, List<String> amenities) {
        Hotel hotel = getHotelById(id);
        if(hotel != null) {
            hotel.getAmenities().addAll(amenities);
            hotelRepository.save(hotel);
        }
    }
}