package ro.pakt.petclinic.services.map;

import java.util.Set;

import ro.pakt.petclinic.model.Owner;
import ro.pakt.petclinic.services.CrudService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long>{

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Long id, Owner object) {
        return this.save(id, object);
    }

    @Override
    public Owner save(Owner object) {
        return this.save(object);
    }

}
