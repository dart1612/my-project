/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.repository;

import com.example.entity.Hotel;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;





/**
 *
 * @author jithin123
 */
@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer>{
    
    public Optional<Hotel> findByHotelId(int id);
    
    @Query("SELECT h FROM Hotel h WHERE h.region LIKE CONCAT('%', :region, '%')")
    public List<Hotel> findByRegion(String region);
    
}
