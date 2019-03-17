package guru.springframework.sfgpetclinic.services;

import java.util.Set;

interface CrudService<T, ID> {

    Set<T> findAll();

    T findByID(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
