package com.zakia.motors.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zakia.motors.entities.Motor;
import com.zakia.motors.entities.Type;
import com.zakia.motors.repos.MotorRepository;
@Service
public class MotorServiceImpl implements MotorService{

	@Autowired
	MotorRepository motorRepository ;
	
	
	
	@Override
	public Motor saveMotor(Motor m) {
		return motorRepository.save(m) ;
	}

	@Override
	public Motor updateMotor(Motor m) {
		return motorRepository.save(m) ;
	}

	@Override
	public void deleteMotor(Motor m) {
		motorRepository.delete(m);
		}

	@Override
	public void deleteMotorById(Long id) {
		motorRepository.deleteById(id);
		
	}

	@Override
	public Motor getMotor(Long id) {
		return motorRepository.findById(id).get();
	}

	@Override
	public List<Motor> getAllMotors() {
		return motorRepository.findAll();
	}

	@Override
	public List<Motor> findByNomMotor(String nom) {
		
		return motorRepository.findByNomMotors(nom);
	}

	@Override
	public List<Motor> findByNomMotorContains(String nom) {
		
		return motorRepository.findByNomMotorsContains(nom);
	}

	@Override
	public List<Motor> findByNomPrix(String nom, Double prix) {

		return motorRepository.findByNomPrix(nom, prix);
	}

	@Override
	public List<Motor> findByType(Type type) {
		
		return motorRepository.findByType(type);
	}

	@Override
	public List<Motor> findByTypeIdTyp(Long id) {
		
		return motorRepository.findByTypeIdTyp(id);
	}

	@Override
	public List<Motor> findByOrderByNomMotorAsc() {
		
		return motorRepository.findByOrderByNomMotorsAsc();
	}

	@Override
	public List<Motor> trierMotorsNomsPrix() {
		
		return motorRepository.trierMotorsNomsPrix();
	}

}
