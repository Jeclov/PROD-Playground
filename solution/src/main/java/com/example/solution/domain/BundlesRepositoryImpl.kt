package com.example.solution.domain

import com.example.prod_playground.core.api.data.sources.local.BundlesLocalDataSource
import com.example.prod_playground.core.api.data.sources.remote.BundlesRemoteDataSource
import com.example.prod_playground.core.api.domain.models.BundleInfo
import com.example.prod_playground.core.api.domain.repositories.BundlesRepository

/**
 * Задача 4 | Список спецпредложений – получение данных
 */
class BundlesRepositoryImpl(
    private val localDataSource: BundlesLocalDataSource,
    private val remoteDataSource: BundlesRemoteDataSource
) : BundlesRepository {

    // Необходимо реализовать BundlesRepositoryImpl для данных о подписках и
    // выбора между данными из кеша BundlesLocalDataSource или
    // BundlesRemoteDataSource в зависимости от наличия данных.
    //
    // BundlesRepositoryImpl должен реализовывать интерфейс BundlesRepository

    override fun getBundles(): List<BundleInfo> {
        return emptyList()
    }
}