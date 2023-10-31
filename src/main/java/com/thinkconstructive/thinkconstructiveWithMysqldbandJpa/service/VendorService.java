package com.thinkconstructive.thinkconstructiveWithMysqldbandJpa.service;

import com.thinkconstructive.thinkconstructiveWithMysqldbandJpa.model.Vendor;

import java.util.List;

public interface VendorService {
    public String createVendor(Vendor vendor);
    public String updateVendor(Vendor vendor,Long vendorId);
    public Vendor getVendor(Long vendorId);
    public String deleteVendor(Long vendorId);
    public List<Vendor> getAllVendors();

}
