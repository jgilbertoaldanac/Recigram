package aldana.gilberto.recigram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.firebase.firestore.FirebaseFirestore

class recetas : AppCompatActivity() {

    private val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recetas)

        val btn_ver: Button = findViewById(R.id.btn_ver)
        val btn_ver2: Button = findViewById(R.id.btn_ver2)
        val btn_ver3: Button = findViewById(R.id.btn_ver3)

        btn_ver.setOnClickListener(){
            var intent : Intent = Intent(this, receta::class.java)
            intent.putExtra("platillo", "chilaquilesrojos")
            startActivity(intent)
        }

        btn_ver2.setOnClickListener(){
            var intent : Intent = Intent(this, receta::class.java)
            intent.putExtra("platillo", "arrozleche")
            startActivity(intent)
        }

        btn_ver3.setOnClickListener(){
            var intent : Intent = Intent(this, receta::class.java)
            intent.putExtra("platillo", "chilaquilesrojos")
            startActivity(intent)
        }

    }
}