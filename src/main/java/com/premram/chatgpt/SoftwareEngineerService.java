package com.premram.chatgpt;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoftwareEngineerService {

    private final SoftwareEngineerRepository softwareEngineerRepository;
    private final AIService aiService;

    public SoftwareEngineerService(SoftwareEngineerRepository softwareEngineerRepository, AIService aiService) {
        this.softwareEngineerRepository = softwareEngineerRepository;
        this.aiService = aiService;
    }

    public List<SoftwareEngineer> getAllSoftwareEngineers() {
        return softwareEngineerRepository.findAll();
    }

    public SoftwareEngineer addSoftwareEngineer(SoftwareEngineer softwareEngineer) {
        String prompt = """
                Based on the tech stack %s that %s person has given ,
                provide a full learning path and recommendation for this person.
                """.formatted(
                softwareEngineer.getTechStack(),
                softwareEngineer.getName()
        );
        String chatResponse = aiService.chat(prompt);
        softwareEngineer.setLearningRecommendation(chatResponse);
        return softwareEngineerRepository.save(softwareEngineer);
    }
}
