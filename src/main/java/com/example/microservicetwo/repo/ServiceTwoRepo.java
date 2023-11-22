package com.example.microservicetwo.repo;

import com.example.microservicetwo.entity.ServiceOneEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceTwoRepo extends JpaRepository<ServiceOneEntity,Long> {
}
