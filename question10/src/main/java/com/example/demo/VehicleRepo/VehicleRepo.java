package com.example.demo.VehicleRepo;

import org.springframework.stereotype.Repository;

import com.example.demo.VehicleEntity.VehicleEntity;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
@Repository

public interface VehicleRepo extends JpaRepository<VehicleEntity, Integer>
{
@Query("select a from VehicleEntity a where a.make = :make")
Optional<VehicleEntity> findBymake(String make);

}