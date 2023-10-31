package com.thinkconstructive.thinkconstructiveWithMysqldbandJpa.repository;

import com.thinkconstructive.thinkconstructiveWithMysqldbandJpa.model.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepository extends JpaRepository<Vendor,Long> {
}
