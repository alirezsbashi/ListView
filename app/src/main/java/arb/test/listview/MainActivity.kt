package arb.test.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val list = listOf("Kotlin","java","php","node js","js","py")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var adapterTest = ArrayAdapter(this,android.R.layout.simple_list_item_1,list)

        listview.adapter = adapterTest

        listview.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(applicationContext,"${list[position]}",Toast.LENGTH_SHORT).show()
        }
    }
}
