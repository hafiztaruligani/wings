package com.hafiztaruligani.wings.data.local.room.entity

import androidx.room.Embedded
import androidx.room.Relation

data class TransactionHeaderWithDetail(
    @Embedded
    val transactionHeaderEntity: TransactionHeaderEntity,
    @Relation(
        parentColumn = "document_number",
        entityColumn = "document_number"
    )
    val detailEntity: List<TransactionDetailEntity>
)
