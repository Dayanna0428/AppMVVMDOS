package com.dayanna.appmvvmdos.domain

import com.dayanna.appmvvmdos.data.model.DataResponse
import com.dayanna.appmvvmdos.data.model.LoginDTO
import com.dayanna.appmvvmdos.data.model.UserModel
import com.dayanna.appmvvmdos.data.repositories.LoginRepository

class PostLoginUseCase {
    private val loginRepository = LoginRepository()
    suspend operator fun invoke(loginDTO: LoginDTO): DataResponse<UserModel> {
        return loginRepository.login(loginDTO)
    }

}