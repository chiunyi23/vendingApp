import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.samples.apps.vendingApp.R
import com.google.samples.apps.vendingApp.StoreItem2
import kotlinx.android.synthetic.main.store_item.view.image_view
import kotlinx.android.synthetic.main.store_item.view.text_view1
import kotlinx.android.synthetic.main.store_item.view.text_view2
import kotlinx.android.synthetic.main.store_item2.view.*

class ItemAdapter2(private val itemList: List<StoreItem2>): RecyclerView.Adapter<ItemAdapter2.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.store_item2,
                parent, false)

        return ItemViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val currentItem = itemList[position]

        holder.imageView.setImageResource(currentItem.imageResource)
        holder.textView1.text = currentItem.text1
        holder.textView2.text = currentItem.text2
        holder.textView3.text = currentItem.text3
    }

    override fun getItemCount() = itemList.size

    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.image_view
        val textView1: TextView = itemView.text_view1
        val textView2: TextView = itemView.text_view2
        val textView3: TextView = itemView.text_view3

    }
}
