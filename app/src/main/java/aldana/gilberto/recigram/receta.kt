package aldana.gilberto.recigram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class receta : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receta)

        val btn_irProcedimiento : Button = findViewById(R.id.btn_irProcedimiento)

        btn_irProcedimiento.setOnClickListener(){
            var intent : Intent = Intent(this, procedimiento::class.java)
            startActivity(intent)
        }

    }

}