package aldana.gilberto.recigram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class iniciar_sesion : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iniciar_sesion)

        val btn_iniciarSesion : Button = findViewById(R.id.btn_CrearCuenta)
        val et_registrate : TextView = findViewById(R.id.et_registrate)

        btn_iniciarSesion.setOnClickListener(){
            var intent : Intent = Intent(this, casa::class.java)
            startActivity(intent)
        }

        et_registrate.setOnClickListener(){
            var intent : Intent = Intent(this, crear_cuenta::class.java)
            startActivity(intent)
        }

    }

}