package aldana.gilberto.recigram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.firebase.firestore.FirebaseFirestore

class procedimiento : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_procedimiento)

        val tv_listaProcedimiento: TextView = findViewById(R.id.tv_listaProcedimiento)

        val procedimiento = getIntent().getExtras()?.getString("procedimiento")

        tv_listaProcedimiento.text = procedimiento.toString()

    }
}