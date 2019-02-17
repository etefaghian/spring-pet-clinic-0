
package ir.etefaghian.sfgpetclinic.services.map;

import ir.etefaghian.sfgpetclinic.model.Pet;
import ir.etefaghian.sfgpetclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet,Long> implements PetService {


    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(Pet object) {
        super.deleteByObject(object);
    }

    @Override
    public void deleteById(Long id) {
         super.deleteById(id);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }



}
