package br.com.map.appbanco.banco

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.map.appbanco.R

class MainActivity : AppCompatActivity() {


    private lateinit var rvList : RecyclerView
    private var adapter = MenuItemAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        iniciaViews()
        setItemLista()
    }

    private fun iniciaViews() {
        rvList = findViewById(R.id.rv_list)
        rvList.adapter = adapter
        rvList.layoutManager = GridLayoutManager(this,2)

    }
    private fun setItemLista(){

        adapter.setItensList(
            arrayListOf(
               MenuItemModel(
                   "Cartões"


                ),MenuItemModel(
                    "Meus Comprovantes"


                ),MenuItemModel(
                    "Investimentos"


                ),MenuItemModel(
                    "Portabilidade de Salarios"


                ),
                MenuItemModel(
                    "Cartões"


                ),MenuItemModel(
                    "Meus Comprovantes"


                ),MenuItemModel(
                    "Investimentos"


                ),MenuItemModel(
                    "Portabilidade de Salarios"


                ),

            )

        )

    }

}