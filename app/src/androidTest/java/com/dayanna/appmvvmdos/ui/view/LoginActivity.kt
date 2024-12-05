package com.dayanna.appmvvmdos.ui.view


import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.dayanna.appmvvmdos.data.model.LoginDTO
import com.dayanna.appmvvmdos.data.ActivityLoginBinding
import com.dayanna.appmvvmdos.ui.viewmodel.LoginViewModel

private val Any.btnIniciarSesion: Any
    get() {}

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    private val loginViewModel: LoginViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnIniciarSesion.setOnClickListener{
            if(validateFields()){
                val username:String = binding.etUsername.text.toString()
                val password:String = binding.etPassword.text.toString()
                val loginDTO:LoginDTO = LoginDTO(username, password)
                loginViewModel.onCreate(loginDTO)
            }
        }

        loginViewModel.message.observe(this, Observer{
            if(it != null){
                showToastDialog(it)
            }
        })

        loginViewModel.userModel.observe(this, Observer{
            if(it != null){
                showMenu()
            }
        })
    }

    fun validateFields(): Boolean {
        var isValid = true
        with(binding){
            if(etUsername.text.toString().isBlank()){
                isValid = false
                user.error = "Campo requerido"
            }
            if(etPassword.text.toString().isBlank()){
                isValid = false
                password.error = "Campo requerido"
            }
        }
        return isValid
    }

    fun showToastDialog(message: String){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    fun showMenu(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}