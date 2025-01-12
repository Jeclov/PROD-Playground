package com.example.solution.data.api

import com.example.prod_playground.core.api.data.api.BannersApi
import com.example.prod_playground.core.api.data.json.JsonProvider
import com.example.prod_playground.core.api.domain.models.BannerItem
import com.example.prod_playground.core.api.domain.repositories.BannerRepository
import com.example.prod_playground.core.impl.domain.BannerRepositoryImpl
import com.example.solution.data.sources.remote.BannerRemoteDataSourceImpl

/**
 * Задача 1 | Рекламный баннер – получение данных
 */
class DefaultBannersApi(private val jsonProvider: JsonProvider) : BannersApi {

    override fun getBanner(): BannerItem? {

        val strJSON = jsonProvider.bannerInfoJson // String
        // Необходимо реализовать DefaultBannersApi,
        // который получает JSON jsonProvider.bannerInfoJson и преобразует его в объект типа BannerItem.
        // DefaultBannersApi должен реализовывать интерфейс BannersApi.
        //

        // strJSON -> BannerItem

        val bannerItem: BannerItem? = null

        return bannerItem

    }


}