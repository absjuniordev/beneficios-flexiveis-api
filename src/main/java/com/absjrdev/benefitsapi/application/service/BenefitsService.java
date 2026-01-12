package com.absjrdev.benefitsapi.application.service;

import com.absjrdev.benefitsapi.api.dto.benefits.BenefitsRequestDTO;
import com.absjrdev.benefitsapi.api.dto.benefits.BenefitsResponseDTO;
import com.absjrdev.benefitsapi.domain.benefits.Benefits;
import com.absjrdev.benefitsapi.domain.benefits.excepiton.BenefitsExistException;
import com.absjrdev.benefitsapi.domain.benefits.excepiton.BenefitsNotExistException;
import com.absjrdev.benefitsapi.repository.BenefitsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BenefitsService {


    private final BenefitsRepository benefitsRepository;

    public BenefitsResponseDTO createBenefits(BenefitsRequestDTO request) {

        if (!benefitsRepository.existsByName(request.nome())) {
            throw new BenefitsExistException(request.nome());
        }
        Benefits benefits = Benefits.create(
                request.nome(),
                request.description(),
                request.limitMonthly()
        );
        return BenefitsResponseDTO.from(benefitsRepository.save(benefits));
    }

    public BenefitsResponseDTO findByName(String name) {
        return BenefitsResponseDTO.from(
                benefitsRepository.findByName(name)
                        .orElseThrow(() -> new BenefitsNotExistException(name))
        );
    }

    public List<BenefitsResponseDTO> findAll() {
        List<Benefits> list = benefitsRepository.findAll();
        return list.stream().
                map(BenefitsResponseDTO::from).
                toList();
    }

    public void deleteById(Long id) {

        if (!benefitsRepository.existsById(id)) {
            throw new BenefitsNotExistException(id);
        }
        benefitsRepository.deleteById(id);
    }
}
