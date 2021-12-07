package aldana.gilberto.recigram

import aldana.gilberto.recigram.databinding.ActivityIniciarSesionBinding
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class iniciar_sesion : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    private lateinit var binding: ActivityIniciarSesionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_iniciar_sesion)
        binding = ActivityIniciarSesionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Initialize Firebase Auth
        auth = Firebase.auth

        //val btn_iniciarSesion : Button = findViewById(R.id.btn_iniciarSesion)
        //val et_registrate : TextView = findViewById(R.id.et_registrate)

        //btn_iniciarSesion.setOnClickListener(){
        //    var intent : Intent = Intent(this, casa::class.java)
        //    startActivity(intent)
        //}

        //et_registrate.setOnClickListener(){
        //    var intent : Intent = Intent(this, crear_cuenta::class.java)
        //    startActivity(intent)
        //}

        binding.btnIniciarSesion.setOnClickListener{
            val et_mail = binding.etMail.text.toString()
            val et_contra = binding.etContra.text.toString()

            when{
                et_mail.isEmpty() || et_contra.isEmpty()->{
                    Toast.makeText(baseContext, "Correo o Contraseña incorretas", Toast.LENGTH_SHORT).show()
                }else->{
                    iniciarSesion(et_mail, et_contra)
                }
            }
        }

        binding.etRegistrate.setOnClickListener{
            val intent = Intent(this, crear_cuenta::class.java)
            startActivity(intent)
        }

    }

    private fun iniciarSesion(email: String, password: String){
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    Log.d("TAG", "signInWithEmail:success")
                    //val user = auth.currentUser
                    //updateUI(user)
                    reaload()
                } else {
                    // If sign in fails, display a message to the user.
                    Log.w("TAG", "signInWithEmail:failure", task.exception)
                    Toast.makeText(baseContext, "Authentication failed.",
                        Toast.LENGTH_SHORT).show()
                    //updateUI(null)
                }
            }
    }

    private fun reaload(){
        val intent = Intent(this, casa::class.java)
        this.startActivity(intent)
    }

}