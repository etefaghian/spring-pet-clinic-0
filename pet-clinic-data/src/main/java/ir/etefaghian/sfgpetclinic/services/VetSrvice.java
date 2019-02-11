package ir.etefaghian.sfgpetclinic.services;

import ir.etefaghian.sfgpetclinic.model.Vet;

import java.util.Set;

public interface  VetSrvice extends CrudService<Vet,Long> {


    Vet findByLastId(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
