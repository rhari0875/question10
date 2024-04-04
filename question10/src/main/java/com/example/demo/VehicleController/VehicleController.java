package com.example.demo.VehicleController;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.VehicleEntity.VehicleEntity;
import com.example.demo.VehicleService.VehicleService;
@RestController

public class VehicleController {
	@Autowired
	private VehicleService vs;
	@GetMapping("/get")
	public List<VehicleEntity> usereduda()
	{
	return vs.getVehicle();
	}
	@GetMapping("/get/{make}")
	public VehicleEntity getdatabyid(@PathVariable String make)
	{
	return vs.getVehiclebyMake(make);
	}
	@PostMapping("/post")

	public List<VehicleEntity> post(@RequestBody List<VehicleEntity> us)
	{
	return vs.post(us);
	}
	@PutMapping("/update/{id}")
	public String update(@PathVariable int id, @RequestBody VehicleEntity

	userEntity)
	{
	vs.update(id, userEntity);
	return "User Update";
	}

	@DeleteMapping("/delete/{id}")
	public String deletedata(@PathVariable int id)
	{
	vs.deletedata(id);
	return "deleted Successfully";
	}

	}

