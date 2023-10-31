package com.thinkconstructive.thinkconstructiveWithMysqldbandJpa.service.impl;

import com.thinkconstructive.thinkconstructiveWithMysqldbandJpa.model.Vendor;
import com.thinkconstructive.thinkconstructiveWithMysqldbandJpa.repository.VendorRepository;
import com.thinkconstructive.thinkconstructiveWithMysqldbandJpa.service.VendorService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class VendorServiceImpl implements VendorService {
     VendorRepository vendorRepository;
     Vendor originalVendor;

    public VendorServiceImpl(VendorRepository vendorRepository) {
        this.vendorRepository = vendorRepository;
    }

    @Override
    public String createVendor(Vendor vendor) {
        vendorRepository.save(vendor);
        return "vendor saved";
    }
@Transactional
    @Override
    public String updateVendor(Vendor vendor,Long vendorId) {
        String msg;
            try{
                Vendor dbVendor=vendorRepository.findById(vendorId).orElseThrow( ()->new IllegalArgumentException(
                        "Something went wrong"
                ));
                dbVendor.setVendorName(vendor.getVendorName());
                //dbVendor.setVendorId(vendor.getVendorId());
                dbVendor.setVendorAddress(vendor.getVendorAddress());
                dbVendor.setVendorPhoneNumber(vendor.getVendorPhoneNumber());
                // vendorRepository.save(vendor);
               msg= "Record updated";
            }catch (IllegalArgumentException e){
                //System.out.println("vendor not found"+ e);
                msg="vendor not found: ";
            }
            return msg;



    }

    @Override
    public Vendor getVendor(Long vendorId) {

        return (Vendor) vendorRepository.findById(vendorId).get();
    }

    @Override
    public String deleteVendor(Long vendorId) {
        vendorRepository.deleteById(vendorId);
        return "Deleted!!!";
    }

    @Override
    public List<Vendor> getAllVendors() {
        return vendorRepository.findAll();
    }
}
