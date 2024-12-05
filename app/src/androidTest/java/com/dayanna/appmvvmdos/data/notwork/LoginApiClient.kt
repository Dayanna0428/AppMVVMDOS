package com.dayanna.appmvvmdos.data.notwork

import com.dayanna.appmvvmdos.data.model.DataResponse
import com.dayanna.appmvvmdos.data.model.LoginDTO
import com.dayanna.appmvvmdos.data.model.UserModel
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface LoginApiClient {
    @POST("sign_in")
    suspend fun login(
        @Body loginDTO: LoginDTO
    ): Response<DataResponse<UserModel>>
}