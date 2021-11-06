package ro.pakt.petclinic.services;

import java.util.Set;

import ro.pakt.petclinic.model.Pet;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
