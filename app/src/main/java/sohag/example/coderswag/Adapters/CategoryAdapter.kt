package sohag.example.coderswag.Adapters
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import sohag.example.coderswag.Model.Category
import sohag.example.coderswag.R

//class CategoryAdapter(context: Context,categories:List<Category>): BaseAdapter(){
//   val context = context
//    val categories = categories
//
//    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
//
//
//     val categoryView: View
//       categoryView= LayoutInflater.from(context).inflate(R.layout.category_list_item,null)
//       val categoryImage : ImageView = categoryView.findViewById(R.id.categoryImage)
//       val categoryName : TextView = categoryView.findViewById(R.id.categoryName)
//       return categoryView
//    }
//
//    override fun getItem(position: Int): Any {
//        return categories [position]
//    }
//
//    override fun getItemId(position: Int): Long {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }
//
//    override fun getCount(): Int {
//        return categories.count()
//
//    }
//}