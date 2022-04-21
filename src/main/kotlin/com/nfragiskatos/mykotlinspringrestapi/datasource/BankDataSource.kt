package com.nfragiskatos.mykotlinspringrestapi.datasource

import com.nfragiskatos.mykotlinspringrestapi.model.Bank

interface BankDataSource {

    fun retrieveBanks() : Collection<Bank>
}