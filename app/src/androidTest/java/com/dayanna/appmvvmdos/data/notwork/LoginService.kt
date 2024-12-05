package com.dayanna.appmvvmdos.data.notwork

import com.dayanna.appmvvmdos.core.RetrofitHelper
import com.dayanna.appmvvmdos.data.model.DataResponse
import com.dayanna.appmvvmdos.data.model.LoginDTO
import com.dayanna.appmvvmdos.data.model.UserModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class LoginService {
    private val retrofitTwo = RetrofitHelper.getRetrofitTwo()
    suspend fun login(loginDTO: LoginDTO): DataResponse<UserModel>{
        return withContext(Dispatchers.IO){
            // Llamada al API
            val response = retrofitTwo.create(LoginApiClient::class.java).login(loginDTO)
            response.body() ?:
            DataResponse(UserModel("",""), "error", "error")
        }
    }
}