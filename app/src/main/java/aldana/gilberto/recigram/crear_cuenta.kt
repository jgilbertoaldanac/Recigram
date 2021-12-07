package aldana.gilberto.recigram

import aldana.gilberto.recigram.databinding.ActivityCrearCuentaBinding
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import java.util.regex.Pattern

class crear_cuenta : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    private lateinit var binding: ActivityCrearCuentaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityCrearCuentaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Initialize Firebase Auth
        auth = Firebase.auth

        binding.btnCrear.setOnClickListener {
            val mEmail=binding.etMail.text.toString()
            val mPassword=binding.etContra.text.toString()
            val mRepeatPassword = binding.etReContra.text.toString()
            val passwordRegex = Pattern.compile("^" +
                    "(?=.*[-@#$%^&+=])" +     // Al menos 1 carácter especial
                    ".{6,}" +                // Al menos 4 caracteres
                    "$")

            if(mEmail.isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(mEmail).matches()) {
                Toast.makeText(this, "Ingrese un email valido.",
                    Toast.LENGTH_SHORT).show()
            } else if (mPassword.isEmpty() || !passwordRegex.matcher(mPassword).matches()){
                Toast.makeText(this, "La contraseña es debil.",
                    Toast.LENGTH_SHORT).show()
            } else if (mPassword != mRepeatPassword){
                Toast.makeText(this, "Confirma la contraseña.",
                    Toast.LENGTH_SHORT).show()
            } else {
                createAccount(mEmail, mPassword)
            }
        }

    }

    private fun createAccount(email: String,password:String){
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    Toast.makeText(this, "NSe ha registrado con exito",
                        Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "No se pudo crear la cuenta. Vuelva a intertarlo",
                        Toast.LENGTH_SHORT).show()

                }
            }
    }

}