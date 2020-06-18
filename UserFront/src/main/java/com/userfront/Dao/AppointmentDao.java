package com.userfront.Dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.userfront.Domain.Appointment;

public interface AppointmentDao extends CrudRepository<Appointment, Long> {

    List<Appointment> findAll();
}
