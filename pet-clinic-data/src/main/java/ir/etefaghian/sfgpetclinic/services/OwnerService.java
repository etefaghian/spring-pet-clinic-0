package ir.etefaghian.sfgpetclinic.services;

import ir.etefaghian.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long> {


    Owner findByLastName(String lastName);








}
