package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.services.OwnerService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {


    @Override
    public Owner findByLastName(String lastName) {
        Owner found = null;

        Set<Owner> owners = super.findAll();
        for (Owner owner : owners) {
            if (owner.getLastName().equals(lastName)) {
                found = owner;
                break;
            }
        }

        return found;
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    //////////////////////

    /*@Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }*/
}
