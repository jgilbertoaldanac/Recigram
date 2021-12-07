package aldana.gilberto.recigram

import aldana.gilberto.recigram.databinding.ActivityCasaBinding
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class casa : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    private lateinit var binding: ActivityCasaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCasaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = Firebase.auth
        //setContentView(R.layout.activity_casa)

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