package com.krg.system.springboilerplate.repository;

import com.krg.system.springboilerplate.model.MyModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MyRepository extends CrudRepository<MyModel, String> {
    List<MyModel> findAllByName(final String name);
}
