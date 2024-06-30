package com.learnspring.samplebank.datasource.mock

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MockBankDataSourceTest {

    private val mockDataSource: MockBankDataSource = MockBankDataSource()

    @Test
    fun `should provide a collection of banks`() {

//        When
        val banks = mockDataSource.getBanks()

//        Then
       assertThat(banks).isNotEmpty
    }
    @Test
    fun `should provide some mock data`() {
        val banks = mockDataSource.getBanks()

        assertThat(banks).allSatisfy { it.accountNumber.isNotBlank() }
    }
}