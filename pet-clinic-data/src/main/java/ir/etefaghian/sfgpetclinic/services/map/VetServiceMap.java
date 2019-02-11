package ir.etefaghian.sfgpetclinic.services.map;

import ir.etefaghian.sfgpetclinic.model.Vet;
import ir.etefaghian.sfgpetclinic.services.CrudService;

import java.util.Set;

public class VetServiceMap extends  AbstractMapService<Vet,Long> implements CrudService<Vet,Long> {


    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(Vet object) {
        super.deleteByObject(object);

    }

    @Override
    public void deleteById(Long id) {
        super.deletebyId(id);

    }

    @Override
    public Vet findById(Long id) {
        return  findById(id);

    }
}
