package com.nfragiskatos.mykotlinspringrestapi.datasource.mock

import com.nfragiskatos.mykotlinspringrestapi.datasource.BankDataSource
import com.nfragiskatos.mykotlinspringrestapi.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource {
    private val banks = listOf(
        Bank("1234", 3.0, 17),
        Bank("1010", 17.0, 0),
        Bank("15726", 0.0, 100)
    )

    override fun retrieveBanks(): Collection<Bank> = banks
}