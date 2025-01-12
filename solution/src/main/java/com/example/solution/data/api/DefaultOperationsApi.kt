package com.example.solution.data.api

import com.example.prod_playground.core.api.data.api.OperationsApi
import com.example.prod_playground.core.api.data.json.JsonProvider
import com.example.prod_playground.core.api.domain.models.OperationInfo

/**
 * Задача 2 | Виджет пользователя – получение данных
 */
class DefaultOperationsApi(private val jsonProvider: JsonProvider) : OperationsApi {

    override fun getOperations(userId: String): List<OperationInfo> {
        return emptyList()
    }
    // Необходимо реализовать DefaultOperationsApi,
    // который получает JSON из jsonProvider и парсит его в список объектов типа OperationInfo.
}