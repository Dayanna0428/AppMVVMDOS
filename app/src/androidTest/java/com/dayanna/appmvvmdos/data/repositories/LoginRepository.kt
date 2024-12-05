package com.dayanna.appmvvmdos.data.repositories


import com.dayanna.appmvvmdos.data.model.DataResponse
import com.dayanna.appmvvmdos.data.model.LoginDTO
import com.dayanna.appmvvmdos.data.model.UserModel
import com.dayanna.appmvvmdos.data.model.UserProvider
import com.dayanna.appmvvmdos.data.notwork.LoginService
class LoginRepository {
    private val loginService = LoginService()
    suspend fun login(loginDTO: LoginDTO): DataResponse<UserModel>{
        val response = loginService.login(loginDTO)
        if (response.status == "success"){
            UserProvider.user = response.data
        }
        return response
    }

}