package com.learnspring.samplebank.datasource

import com.learnspring.samplebank.model.Bank

interface BankDataSource {

    fun getBanks(): Collection<Bank>
}