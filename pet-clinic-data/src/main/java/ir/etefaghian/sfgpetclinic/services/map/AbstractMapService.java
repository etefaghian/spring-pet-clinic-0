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

    T save(T object)
    {
      if(object != null)
      {
          if(object.getId() == null){

      }


        return  map.put(id,object );
    }

    void deleteById(ID id)
    {
         map.remove(id);
    }

    void deleteByObject(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));



    }


private Long getNextId()
{
    return Collections.max(map.keySet())+1;
}


}
