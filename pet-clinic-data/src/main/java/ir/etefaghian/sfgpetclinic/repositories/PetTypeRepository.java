package ir.etefaghian.sfgpetclinic.repositories;

import ir.etefaghian.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType,Long> {
}
