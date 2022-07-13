package com.thiagoprojects.salesgoal.services;

import com.thiagoprojects.salesgoal.entities.Sale;
import com.thiagoprojects.salesgoal.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;

    public List<Sale> findSales() {
        return repository.findAll();
    }
}
