package com.registration.api;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class CarController {
	
	CarRepository repository;
	@GetMapping("/carro")
	public List<Car> getAllCars(){
		return repository.findAll();	
	}
	@GetMapping("/carro/{id}")
	public Optional<Car> getCarByid(@PathVariable Long id) {
		return repository.findById(id);
	}
	
	@PostMapping ("/carro")
	public Car saveCar(@RequestBody Car cars) {
		return repository.save(cars);
	}
	@DeleteMapping("/carro/{id}")
	public void deleteCar(@PathVariable Long id) {
		repository.deleteById(id);
	}
	
}
