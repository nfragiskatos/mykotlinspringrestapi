package com.nfragiskatos.mykotlinspringrestapi.service

import com.nfragiskatos.mykotlinspringrestapi.datasource.BankDataSource
import com.nfragiskatos.mykotlinspringrestapi.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService(private val dataSource: BankDataSource) {


    fun getBanks(): Collection<Bank> = dataSource.retrieveBanks()


}