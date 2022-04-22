package com.nfragiskatos.mykotlinspringrestapi.datasource.mock

import com.nfragiskatos.mykotlinspringrestapi.datasource.BankDataSource
import com.nfragiskatos.mykotlinspringrestapi.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource {
    private val banks = mutableListOf<Bank>(
        Bank("1234", 3.14, 17),
        Bank("1010", 17.0, 0),
        Bank("15726", 0.0, 100)
    )

    override fun retrieveBanks(): Collection<Bank> = banks
    override fun retrieveBank(accountNumber: String): Bank = banks.firstOrNull { it.accountNumber == accountNumber } ?: throw NoSuchElementException("Could not find bank with account number $accountNumber")
    override fun createBank(bank: Bank): Bank {
        if (banks.any { it.accountNumber == bank.accountNumber }) {
            throw IllegalArgumentException("Bank with account number ${bank.accountNumber} already exists.")
        }
        banks.add(bank)
        return bank
    }
}