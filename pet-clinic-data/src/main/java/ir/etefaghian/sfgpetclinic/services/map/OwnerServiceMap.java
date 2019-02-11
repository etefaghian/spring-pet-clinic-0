package ir.etefaghian.sfgpetclinic.services.map;

import ir.etefaghian.sfgpetclinic.model.Owner;
import ir.etefaghian.sfgpetclinic.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements CrudService<Owner,Long> {

    @Override
    public Set<Owner> findAll() {

        return super.findAll();
    }


    @Override
    public Owner findById(Long id) {
        return  super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Owner object) {
        super.deleteByObject(object) ;

    }

    @Override
    public void deleteById(Long id) {

        super.deletebyId(id);

    }


}
