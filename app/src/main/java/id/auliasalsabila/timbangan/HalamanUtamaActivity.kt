package id.auliasalsabila.timbangan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class HalamanUtamaActivity : AppCompatActivity() {
    var edbb: EditText? = null
    var edtinggi: EditText? = null
    var edimt: EditText? = null
    var edket: EditText? = null
    var bthitung: Button? = null
    var vbb: Double? = null
    var vtinggi: Double? = null
    var vimt: Double? = null
    var vket: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_utama)
        edbb = findViewById<View>(R.id.edbb) as EditText
        edtinggi = findViewById<View>(R.id.edtinggi) as EditText
        edimt = findViewById<View>(R.id.edimt) as EditText
        edket = findViewById<View>(R.id.edket) as EditText
        bthitung = findViewById<View>(R.id.bthitung) as Button
    }

    fun hitung(view: View?) {
        vbb = edbb!!.text.toString().toDouble()
        vtinggi = edtinggi!!.text.toString().toDouble()
        vimt = vbb!! / (vtinggi!! / 100 * (vtinggi!! / 100))
        vket = if (vimt!! < 18.5) {
            "Berat Badan Kurang"
        } else if (vimt!! >= 18.5 && vimt!! < 25) {
            "Berat Badan Ideal"
        } else if (vimt!! >= 25 && vimt!! < 30) {
            "Berat Badan Berlebih"
        } else {
            "Sangat Gemuk, Anda Harus Diet"
        }
        edimt!!.setText("" + vimt)
        edket!!.setText("" + vket)
    }
}