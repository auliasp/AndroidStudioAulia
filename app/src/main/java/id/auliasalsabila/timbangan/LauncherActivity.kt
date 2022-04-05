package id.auliasalsabila.timbangan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class LauncherActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launcher)

        val btnStart: Button = findViewById(R.id.button_Start)
        btnStart.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
       when (p0?.id){
           R.id.button_Start -> {
               val moveIntent = Intent(this@LauncherActivity, HalamanUtamaActivity::class.java)
               startActivity(moveIntent)
           }
       }
    }
}