package com.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hms.model.Doctor;
import com.hms.model.Patient;


public interface PatientRepository extends JpaRepository<Patient, Long> {

	@Query(value = "select * from #{#entityName} p where p.pid=?1", nativeQuery = true)
	public Patient getById(long pid);
	
	@Query(value = "select * from #{#entityName} p where p.pmobile=?1", nativeQuery = true)
	public Patient existsPatientByPMobileNo(long pMobileNo);
}
