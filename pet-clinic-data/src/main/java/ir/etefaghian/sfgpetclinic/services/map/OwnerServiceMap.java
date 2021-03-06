package ir.etefaghian.sfgpetclinic.services.map;

import ir.etefaghian.sfgpetclinic.model.Owner;
import ir.etefaghian.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements OwnerService {

    @Override
    public Set<Owner> findAll() {

        return super.findAll();
    }


    @Override
    public Owner findById(Long id) {
        return  super.findById(id);
    }

    @Override
    public long save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Owner object) {
        super.deleteByObject(object) ;

    }

    @Override
    public void deleteById(Long id) {

        super.deleteById(id);

    }


    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
