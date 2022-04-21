package com.nfragiskatos.mykotlinspringrestapi.controller

import com.nfragiskatos.mykotlinspringrestapi.model.Bank
import com.nfragiskatos.mykotlinspringrestapi.service.BankService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/banks")
class BankController(private val service: BankService) {

    @GetMapping
    fun getBanks() : Collection<Bank> = service.getBanks()
}