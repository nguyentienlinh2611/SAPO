package com.restful.sales.repository;

import com.restful.sales.entities.Sanpham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SanphamRepository extends JpaRepository<Sanpham, Integer> {


}
