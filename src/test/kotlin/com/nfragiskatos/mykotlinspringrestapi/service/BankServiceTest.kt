package com.nfragiskatos.mykotlinspringrestapi.service

import com.nfragiskatos.mykotlinspringrestapi.datasource.BankDataSource
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class BankServiceTest {

    private val bankDataSource: BankDataSource = mockk(relaxed = true)
    private val bankService = BankService(bankDataSource)

    @Test
    fun `should call its data source to retrieve banks`() {
        // when
        bankService.getBanks()

        // then
        verify (exactly = 1) { bankDataSource.retrieveBanks() }
    }

    @Test
    fun `should call its data soruce to retrieve bank given an account number`() {

        // given
        val accountNumber = "1234"

        // when
        bankService.getBank(accountNumber)

        // then
        verify { bankDataSource.retrieveBank(accountNumber) }

    }
}