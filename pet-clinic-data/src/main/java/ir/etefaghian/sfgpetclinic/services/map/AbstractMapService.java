package ir.etefaghian.sfgpetclinic.services.map;

import ir.etefaghian.sfgpetclinic.model.BaseEntity;

import java.util.*;

public  abstract class AbstractMapService<T extends BaseEntity,ID extends Long>{
    protected Map<Long,T> map = new HashMap<>();

    Set<T> findAll()
    {
        return new HashSet<>(map.values());
    }

    T findById(ID id)
    {
        return map.get(id);
    }




}
