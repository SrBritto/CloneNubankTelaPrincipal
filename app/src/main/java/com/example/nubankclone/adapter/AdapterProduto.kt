package com.example.nubankclone.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.nubankclone.databinding.ProdutoItemBinding
import com.example.nubankclone.model.Produto

class AdapterProduto(private var context: Context,private var listaProdutos: MutableList<Produto>):
    RecyclerView.Adapter<AdapterProduto.ProdutoViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdutoViewHolder {
        var itemLista = ProdutoItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return ProdutoViewHolder(itemLista)
    }

    override fun onBindViewHolder(holder: ProdutoViewHolder, position: Int) {
        holder.txtTextoInformativo.text = listaProdutos[position].texto
    }

    override fun getItemCount() = listaProdutos.size


    inner class ProdutoViewHolder(binding: ProdutoItemBinding):RecyclerView.ViewHolder(binding.root) {
        var txtTextoInformativo=binding.txtTextoInformativo
    }

}
