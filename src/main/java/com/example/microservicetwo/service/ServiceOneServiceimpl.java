package com.example.microservicetwo.service;


import com.example.microservicetwo.entity.ServiceOneEntity;
import com.example.microservicetwo.repo.ServiceTwoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceOneServiceimpl implements ServiceOneService {

    @Autowired
    private ServiceTwoRepo serviceTwoRepo;

    @Override
    public ServiceOneEntity saveEntity(ServiceOneEntity serviceTwoEntity) {
        return serviceTwoRepo.save(serviceTwoEntity);
    }
}
