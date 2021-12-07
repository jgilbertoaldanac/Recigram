package aldana.gilberto.recigram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.firebase.firestore.FirebaseFirestore

class receta : AppCompatActivity() {

    private val db = FirebaseFirestore.getInstance()
    lateinit var txtprocedimiento: String
    lateinit var platillo: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receta)

        var intent : Intent = Intent(this, recetas::class.java)
        platillo = getIntent().getExtras()?.getString("platillo").toString()

        val tv_numPorciones: TextView = findViewById(R.id.tv_numPorciones)
        val tv_numDificultad: TextView = findViewById(R.id.tv_numDificultad)
        val tv_numTiempo: TextView = findViewById(R.id.tv_numTiempo)
        val tv_listaIngredientes: TextView = findViewById(R.id.tv_listaIngredientes)

        val chilaquilesrojos: String = "chilaquilesrojos"


        db.collection("recetas").document(platillo.toString()).get().addOnSuccessListener {
            tv_numPorciones.text = (it.get("porciones" as String)).toString()
            tv_numDificultad.text = (it.get("dificultad" as String)).toString()
            tv_numTiempo.text = (it.get("tiempo" as String)).toString()
            tv_listaIngredientes.text = (it.get("ingredientes" as String)).toString()
            txtprocedimiento = (it.get("procedimiento" as String)).toString()
        }

        val btn_irProcedimiento : Button = findViewById(R.id.btn_irProcedimiento)

        btn_irProcedimiento.setOnClickListener(){
            var intent : Intent = Intent(this, procedimiento::class.java)
            intent.putExtra("procedimiento", txtprocedimiento.toString())
            startActivity(intent)
        }

    }

}