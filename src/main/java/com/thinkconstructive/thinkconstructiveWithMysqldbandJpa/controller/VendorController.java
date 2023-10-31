package com.thinkconstructive.thinkconstructiveWithMysqldbandJpa.controller;

import com.thinkconstructive.thinkconstructiveWithMysqldbandJpa.model.Vendor;
import com.thinkconstructive.thinkconstructiveWithMysqldbandJpa.service.VendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vendor")
public class VendorController {
     VendorService vendorService;


    public VendorController(VendorService vendorService) {
        this.vendorService = vendorService;
    }

    @GetMapping("{id}")
    public Vendor getVendor(@PathVariable("id") Long id){
        return vendorService.getVendor(id);
    }

    @GetMapping()
    public List<Vendor> getAllVendors(){
        return vendorService.getAllVendors();
    }

    @PostMapping
    public String createVendor(@RequestBody Vendor vendor){
        return vendorService.createVendor(vendor);
    }

    @PutMapping("{id}")
    public String updateVendor(@RequestBody Vendor vendor, @PathVariable("id") Long id){
        return vendorService.updateVendor(vendor,id);
    }

    @DeleteMapping("{id}")
    public String deleteVendor(@PathVariable("id") Long id){

        return vendorService.deleteVendor(id);
    }

}
