package com.learnspring.samplebank.datasource.mock

import com.learnspring.samplebank.datasource.BankDataSource
import com.learnspring.samplebank.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource: BankDataSource {
    val banks = listOf(Bank("123", 100.00, 1))
    override fun getBanks(): Collection<Bank> = banks
}