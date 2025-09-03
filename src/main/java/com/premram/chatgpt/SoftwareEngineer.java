package com.premram.chatgpt;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
public class SoftwareEngineer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private List<String> techStack;
    @Column(columnDefinition = "TEXT")
    private String learningRecommendation;

    public SoftwareEngineer(Long id, String name, List<String> techStack, String learningRecommendation) {
        this.id = id;
        this.name = name;
        this.techStack = techStack;
        this.learningRecommendation = learningRecommendation;
    }

    public SoftwareEngineer() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTechStack() {
        return techStack;
    }

    public void setTechStack(List<String> techStack) {
        this.techStack = techStack;
    }

    public String getLearningRecommendation() {
        return learningRecommendation;
    }

    public void setLearningRecommendation(String learningRecommendation) {
        this.learningRecommendation = learningRecommendation;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SoftwareEngineer that = (SoftwareEngineer) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(techStack, that.techStack) && Objects.equals(learningRecommendation, that.learningRecommendation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, techStack, learningRecommendation);
    }
}
