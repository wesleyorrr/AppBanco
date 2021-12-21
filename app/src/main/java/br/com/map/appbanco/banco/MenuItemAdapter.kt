package br.com.map.appbanco.banco

import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.map.appbanco.R

class MenuItemAdapter : RecyclerView.Adapter<MenuItemAdapter.MenuItemAdapterViewHolder>() {
private val list = mutableListOf<MenuItemModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuItemAdapterViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_menu, parent,false)
        return MenuItemAdapterViewHolder(view)
    }
    override fun getItemCount(): Int {
       return list.size

    }

    override fun onBindViewHolder(holder: MenuItemAdapterViewHolder, position: Int) {
        holder.iniciaViews(list[position])

    }
     fun setItensList(list:List<MenuItemModel>){
         this.list.clear()
         this.list.addAll(list)

     }
    class MenuItemAdapterViewHolder(val itemview:View):RecyclerView.ViewHolder(itemview){

        private val tvTitle by lazy{
            itemView.findViewById<TextView>(R.id.tv_title)
        }




fun iniciaViews(item:MenuItemModel){
tvTitle.text = item.titulo


}
    }


}