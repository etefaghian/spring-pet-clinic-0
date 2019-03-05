package ir.etefaghian.sfgpetclinic.repositories;

import ir.etefaghian.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
