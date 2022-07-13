package com.thiagoprojects.salesgoal.repositories;

import com.thiagoprojects.salesgoal.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
