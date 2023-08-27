
package demospring.spring.core.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import demospring.spring.core.model.CloudVendor;

/**
 * CloudAPIService
 */
@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService  {

    CloudVendor cloudVendor;

    @GetMapping("{vendorId}") 
    public CloudVendor getCloudVendorDetails(String vendorId){
        if (cloudVendor == null) {
            return new CloudVendor(); // Return an empty CloudVendor instance
        } else {
            return cloudVendor;
        }        // return new CloudVendor("C1", "CV PUTRA", "Address One","xxxxx");
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Created";
    }
     
    @PutMapping("/update")
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Updated";
    }
    
    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(String vendorId){
        this.cloudVendor = null;
        return "Cloud Vendor Delete";
    }
}