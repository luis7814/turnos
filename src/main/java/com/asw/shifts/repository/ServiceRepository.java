package com.asw.shifts.repository;

import com.asw.shifts.data.entities.Service;
import com.asw.shifts.data.entities.Trade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, Long> {


}
