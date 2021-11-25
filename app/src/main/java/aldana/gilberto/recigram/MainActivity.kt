package aldana.gilberto.recigram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_CrearCuenta : Button = findViewById(R.id.btn_CrearCuenta)
        val tv_iniciaSesion : TextView = findViewById(R.id.tv_iniciaSesion)

        btn_CrearCuenta.setOnClickListener(){
            var intent : Intent = Intent(this, crear_cuenta::class.java)
            startActivity(intent)
        }

        tv_iniciaSesion.setOnClickListener(){
            var intent : Intent = Intent(this, iniciar_sesion::class.java)
            startActivity(intent)
        }

    }

}