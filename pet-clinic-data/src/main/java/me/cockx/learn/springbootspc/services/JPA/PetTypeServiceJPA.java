package me.cockx.learn.springbootspc.services.JPA;

import me.cockx.learn.springbootspc.model.PetType;
import me.cockx.learn.springbootspc.repositories.PetTypeRepository;
import me.cockx.learn.springbootspc.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile("springdatajpa")
public class PetTypeServiceJPA implements PetTypeService {
    private final PetTypeRepository petTypeRepository;

    public PetTypeServiceJPA(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }


    @Override
    public Set<PetType> findAll() {
        return petTypeRepository.findAll();
    }

    @Override
    public PetType findById(Long id) {
        return petTypeRepository.findById(id).orElse(null);
    }

    @Override
    public PetType save(PetType petType) {
        return petTypeRepository.save(petType);
    }

    @Override
    public void delete(PetType petType) {
        petTypeRepository.delete(petType);
    }

    @Override
    public void deleteById(Long id) {
        petTypeRepository.deleteById(id);
    }
}
