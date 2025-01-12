package com.example.solution.data.sources.remote

import com.example.prod_playground.core.api.data.api.UsersApi
import com.example.prod_playground.core.api.data.sources.remote.UserInfoRemoteDataSource
import com.example.prod_playground.core.api.domain.models.UserInfo

/**
 * Задача 2 | Виджет пользователя – получение данных
 */
class UserInfoRemoteDataSourceImpl(private val api: UsersApi) : UserInfoRemoteDataSource {

    override fun getUserInfo(): UserInfo {
        return UserInfo("","","","")
        // TODO()
    }

    // Необходимо реализовать UserInfoRemoteDataSourceImpl,
    // который вызывает UsersApi и получает от него объект.
    //
    //UserInfoRemoteDataSourceImpl должен реализовывать интерфейс UserInfoRemoteDataSource
}