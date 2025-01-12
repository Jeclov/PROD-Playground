package com.example.solution.data.sources.local

import com.example.prod_playground.core.api.data.sources.local.UserInfoLocalDataSource
import com.example.prod_playground.core.api.domain.models.UserInfo

/**
 * Задача 2 | Виджет пользователя – получение данных
 */
class UserInfoLocalDataSourceImpl : UserInfoLocalDataSource {

    override fun getUserInfo(): UserInfo? {
        return null
    }
    // Необходимо реализовать UserInfoLocalDataSourceImpl,
    // который сохраняет во внутреннюю переменную данные,
    // переданные в метод cacheUserInfo и возвращает их при вызове getUserInfo()
    //
    // При отсутствии закешированных данных метод UserInfoLocalDataSource.getUserInfo() возвращает null.
    //
    // UserInfoLocalDataSourceImpl должен реализовывать интерфейс UserInfoLocalDataSource
    override fun cacheUserInfo(userInfo: UserInfo) = Unit
}