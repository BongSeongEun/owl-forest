package com.cbu.backend.studyPlan.service;

import com.cbu.backend.studyPlan.dto.request.StudyPlanRequestDTO;
import com.cbu.backend.studyPlan.dto.response.StudyPlanResponseDTO;
import com.cbu.backend.studyPlan.entity.StudyPlan;
import com.cbu.backend.studyPlan.mapper.StudyPlanMapper;
import com.cbu.backend.studyPlan.repository.StudyPlanRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityExistsException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StudyPlanService {

    private final StudyPlanRepository studyPlanRepository;
    private final StudyPlanMapper studyPlanMapper;

    // 스터디 계획서 생성
    public StudyPlanResponseDTO create(StudyPlanRequestDTO requestDto, Long studyGroupId) {
        StudyPlan studyPlan = studyPlanMapper.mapToEntity(requestDto);
        studyPlanRepository.save(studyPlan);

        return null;
    }

    // 스터디 계획서 수정 (미완)
    public StudyPlanResponseDTO update(StudyPlanRequestDTO requestDto, Long studyPlanId){
        Optional<StudyPlan> update = studyPlanRepository.findById(studyPlanId);
        StudyPlan studyPlan = studyPlanMapper.mapToEntity(requestDto);
        if(update.isPresent()){
            if(studyPlan != null){
                if(studyPlan.getTitle() != null){
                    update.get().setTitle(studyPlan.getTitle());
                }
                if(studyPlan.getRule() != null){
                    update.get().setRule(studyPlan.getRule());
                }
                if(studyPlan.getTeamMember() != null){
                    update.get().setTeamMember(studyPlan.getTeamMember());
                }
                if(studyPlan.getBook() != null){
                    update.get().setBook(studyPlan.getBook());
                }
                studyPlan = studyPlanRepository.save(update.get());
            }
        }
        return studyPlanMapper.mapToDTO(studyPlan);
    }

    public List<StudyPlanResponseDTO> getAll(){
        return studyPlanRepository.findAll()
                .stream()
                .map(studyPlanMapper::mapToDTO)
                .collect(Collectors.toList());

    }

    public void delete(StudyPlanRequestDTO dto){
        //studyPlanRepository.delete(dto.toEntity());
    }
}