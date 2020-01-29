package com.postgreexample.springbootpostgresample.repository;

import com.postgreexample.springbootpostgresample.entity.Kisi;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KisiRepository extends JpaRepository<Kisi,Long> {
}
