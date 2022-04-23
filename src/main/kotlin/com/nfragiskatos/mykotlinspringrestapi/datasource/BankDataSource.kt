package com.nfragiskatos.mykotlinspringrestapi.datasource

import com.nfragiskatos.mykotlinspringrestapi.model.Bank

interface BankDataSource {

    fun retrieveBanks() : Collection<Bank>
    fun retrieveBank(accountNumber: String): Bank
    fun createBank(bank: Bank): Bank
    fun updateBank(bank: Bank): Bank
}