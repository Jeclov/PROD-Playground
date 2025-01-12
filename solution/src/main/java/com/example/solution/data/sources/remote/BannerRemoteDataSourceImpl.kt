package com.example.solution.data.sources.remote

import com.example.prod_playground.core.api.data.api.BannersApi
import com.example.prod_playground.core.api.data.sources.remote.BannerRemoteDataSource
import com.example.prod_playground.core.api.domain.models.BannerItem

/**
 * Задача 1 | Рекламный баннер – получение данных
 */
class BannerRemoteDataSourceImpl(private val api: BannersApi) : BannerRemoteDataSource {

    override fun getBanner(): BannerItem? {
        //AppSe
        // Необходимо реализовать BannerRemoteDataSourceImpl,
        // который производит запрос на получение данных из сети
        // BannerRemoteDataSourceImpl должен реализовывать интерфейс BannerRemoteDataSource
        val BannerInf = api.getBanner()
        // Что содержит баннер
        // public final data class BannerItem(
        //    val id: String,
        //    val title: String,
        //    val description: String,
        //    val imageId: String,
        //    val backgroundColor: String
        //)

        return BannerInf
    }
}