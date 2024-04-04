package com.example.demo.VehicleService;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.VehicleEntity.VehicleEntity;
import com.example.demo.VehicleRepo.VehicleRepo;
@Service
public class VehicleService {

		@Autowired
		private VehicleRepo vr;
		public List<VehicleEntity> getVehicle()
		{
		return vr.findAll();
		}
		public VehicleEntity getVehiclebyMake(String make)

		{
		Optional<VehicleEntity> optionalUser = vr.findBymake(make);
		return optionalUser.orElse(null);
		}
		public List<VehicleEntity> post(List<VehicleEntity> us)
		{
		return vr.saveAll(us);
		}

		public void update(int id, VehicleEntity updatedVehicle)
		{
		Optional<VehicleEntity> optionalVehicle = vr.findById(id);
		VehicleEntity existingVehicle = optionalVehicle.get();
		existingVehicle.setMake(updatedVehicle.getMake());
		existingVehicle.setModel(updatedVehicle.getModel());
		existingVehicle.setVin(updatedVehicle.getVin());
		existingVehicle.setYearOfManufacture(updatedVehicle.getYearOfManufacture());
		existingVehicle.setColor(updatedVehicle.getColor());
		existingVehicle.setPrice(updatedVehicle.getPrice());
		vr.save(existingVehicle);
		}
		public void deletedata(int id)
		{
		vr.deleteById(id);
		}

		}



