package com.example.solution.data.sources.local

import com.example.prod_playground.core.api.data.sources.local.OperationsLocalDataSource
import com.example.prod_playground.core.api.domain.models.OperationInfo

/**
 * Задача 2 | Виджет пользователя – получение данных
 */
class OperationsLocalDataSourceImpl : OperationsLocalDataSource {

    override fun getOperations(): List<OperationInfo> {
        return emptyList()
    }
    // Необходимо реализовать OperationsLocalDataSourceImpl,
    // который сохраняет во внутреннюю переменную данные,
    // переданные в метод cacheOperations и возвращает их при вызове getOperations()
    //
    // При отсутствии закешированных данных метод
    // OperationsLocalDataSourceImpl.getOperations() возвращает пустой список.
    //
    // OperationsLocalDataSourceImpl должен реализовывать интерфейс OperationsLocalDataSource
    //
    //

    override fun cacheOperations(operations: List<OperationInfo>) = Unit
}