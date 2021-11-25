package aldana.gilberto.recigram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class crear_cuenta : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crear_cuenta)

        val btn_Crear : Button = findViewById(R.id.btn_Crear)
        val tv_aceptermss : TextView = findViewById(R.id.tv_aceptermss)

        btn_Crear.setOnClickListener(){
            var intent : Intent = Intent(this, casa::class.java)
            startActivity(intent)
        }

        tv_aceptermss.setOnClickListener(){
            var intent : Intent = Intent(this, terminos_condiciones::class.java)
            startActivity(intent)
        }

    }

}