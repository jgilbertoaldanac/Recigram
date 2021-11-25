package aldana.gilberto.recigram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class busqueda : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_busqueda)

        val btn_buscar : Button = findViewById(R.id.btn_buscar)

        btn_buscar.setOnClickListener(){
            var intent : Intent = Intent(this, resultados::class.java)
            startActivity(intent)
        }

    }

}