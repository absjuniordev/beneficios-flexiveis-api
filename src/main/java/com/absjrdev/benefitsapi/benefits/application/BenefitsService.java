package com.absjrdev.benefitsapi.benefits.application;

import com.absjrdev.benefitsapi.benefits.dto.BenefitsRequestDTO;
import com.absjrdev.benefitsapi.benefits.dto.BenefitsResponseDTO;
import com.absjrdev.benefitsapi.benefits.domain.Benefits;
import com.absjrdev.benefitsapi.benefits.domain.excepiton.BenefitsExistException;
import com.absjrdev.benefitsapi.benefits.domain.excepiton.BenefitsNotExistException;
import com.absjrdev.benefitsapi.benefits.repository.BenefitsRepository;
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

    public BenefitsResponseDTO getBenefitsByNameOrThrow(String name) {
        return BenefitsResponseDTO.from(
                benefitsRepository.findByName(name)
                        .orElseThrow(() -> new BenefitsNotExistException(name))
        );
    }

    public List<BenefitsResponseDTO> getAllBenefits() {
        List<Benefits> list = benefitsRepository.findAll();
        return list.stream().
                map(BenefitsResponseDTO::from).
                toList();
    }

    public void deleteBenefitsById(Long id) {

        if (!benefitsRepository.existsById(id)) {
            throw new BenefitsNotExistException(id);
        }
        benefitsRepository.deleteById(id);
    }
}
