package csm.doty
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val firstday = ""
        val currentDay = Calendar.getInstance().get(Calendar.DAY_OF_YEAR)
        textDate.text = currentDay.toString()
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        textYear.text = currentYear.toString()
    }
}
