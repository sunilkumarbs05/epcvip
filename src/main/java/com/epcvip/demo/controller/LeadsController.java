package com.epcvip.demo.controller;

import com.epcvip.demo.dto.LeadResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class LeadsController {

    @GetMapping(value = "/welcome")
    public String getHelloMessage() {
        return "Hello epcvip";
    }

    @GetMapping(value = "/leads")
    public ResponseEntity getLeads(@RequestParam String aid, @RequestParam(name = "site_url") String siteUrl, @RequestParam(name = "first_name") String firstName, @RequestParam(name = "last_name") String lastName, @RequestParam(name = "email") String email, @RequestParam Long dob, @RequestParam Long phone) {
        LeadResponseDto leadResponseDto = new LeadResponseDto();
        leadResponseDto.setMessage("Approved");
        return ResponseEntity.ok(leadResponseDto);
    }
}
