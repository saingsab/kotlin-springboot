package com.learnspring.samplebank.model

data class Bank(
    val accountNumber: String,
    val trusted: Double,
    val transactionFee: Int
)