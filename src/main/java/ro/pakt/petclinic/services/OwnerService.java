package ro.pakt.petclinic.services;

import ro.pakt.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findbByLastName(String lastName);
}
