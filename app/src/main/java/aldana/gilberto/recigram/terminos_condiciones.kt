package aldana.gilberto.recigram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class terminos_condiciones : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terminos_condiciones)

        val btn_aceptarVolver : Button = findViewById(R.id.btn_aceptarVolver)

        btn_aceptarVolver.setOnClickListener(){
            var intent : Intent = Intent(this, crear_cuenta::class.java)
            startActivity(intent)
        }

    }
}