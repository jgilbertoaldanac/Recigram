package aldana.gilberto.recigram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class casa : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_casa)

        val btn_ver : Button = findViewById(R.id.btn_ver)
        val btn_mostrarRecetas : Button = findViewById(R.id.btn_mostrarRecetas)
        val btn_buscarIngrediente : Button = findViewById(R.id.btn_buscarIngrediente)

        btn_ver.setOnClickListener(){
            var intent : Intent = Intent(this, receta::class.java)
            startActivity(intent)
        }

        btn_mostrarRecetas.setOnClickListener(){
            var intent : Intent = Intent(this, recetas::class.java)
            startActivity(intent)
        }

        btn_buscarIngrediente.setOnClickListener(){
            var intent : Intent = Intent(this, busqueda::class.java)
            startActivity(intent)
        }

    }

}