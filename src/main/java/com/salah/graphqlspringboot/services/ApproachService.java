package com.salah.graphqlspringboot.services;

import com.salah.graphqlspringboot.model.Approach;
import com.salah.graphqlspringboot.repository.ApproachRepository;
import org.springframework.stereotype.Service;
@Service
public class ApproachService {

    private final ApproachRepository approachRepository;

    public ApproachService(ApproachRepository approachRepository) {
        this.approachRepository = approachRepository;
    }

    public Approach getApproach(Long id){
        return approachRepository.findById(id).orElse(null);
    }
}
