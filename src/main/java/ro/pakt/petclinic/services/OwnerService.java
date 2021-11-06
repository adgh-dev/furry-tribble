package ro.pakt.petclinic.services;

import java.util.Set;

import ro.pakt.petclinic.model.Owner;

public interface OwnerService {
    Owner findbByLastName(String lastName);
    Owner findByID(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
