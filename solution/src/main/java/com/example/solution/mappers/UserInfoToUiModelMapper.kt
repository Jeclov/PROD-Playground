package com.example.solution.mappers

import com.example.prod_playground.core.api.domain.models.OperationInfo
import com.example.prod_playground.core.api.domain.models.UserInfo
import com.example.solution.entities.UserInfoUiModel

/**
 * Задача 3 | Компонент "Полная информация о пользователе" – логика и подготовка отображения
 */
class UserInfoToUiModelMapper : (List<OperationInfo>, UserInfo) -> UserInfoUiModel {

    override fun invoke(operations: List<OperationInfo>, userInfo: UserInfo): UserInfoUiModel {

        //TODO add logic
        /*
        Сначала нужно получить полную информацию о пользователе и список его операций.

        Далее полученные операции нужно просуммировать/вычесть (в зависимости от значения поля direction у OperationInfo),
        чтобы вычислить текущий баланс и кол-во баллов.

        Получив все данные нужно вернуть объект класса UserInfoUiModel.

        Имя и Фамилия (userName) в формате "Имя Фамилия" (имя и фамилия разделены пробелом)

        Текущие количество баллов (specialPoints) ожидаются в формате "1 000 000 баллов"
        (по 3 цифры. разделитель – пробел)

        Текущий баланс (balance) рублей ожидается в формате "1 000,00 ₽"
        (по 3 цифры. разделитель – пробел. в конце символ рубля. у числа два символа после запятой)
         */

        return UserInfoUiModel(
            userName = "",
            balance = "",
            specialPoints = "",
        )
    }
}
