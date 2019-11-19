package sohag.example.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import sohag.example.coderswag.Model.Category
import sohag.example.coderswag.R
import sohag.example.coderswag.Services.DataService

class MainActivity : AppCompatActivity() {
    lateinit var adapter : ArrayAdapter<Category>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       adapter = ArrayAdapter(this,
           android.R.layout.simple_list_item_1,
           DataService.categories)
      categoryListView.adapter= adapter

    }
}
