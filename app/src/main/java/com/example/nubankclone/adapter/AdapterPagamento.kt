package com.example.nubankclone.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.nubankclone.databinding.PagamentoItemBinding
import com.example.nubankclone.databinding.ProdutoItemBinding
import com.example.nubankclone.model.Pagamento
import com.example.nubankclone.model.Produto

class AdapterPagamento(private var context: Context, private var listaPagamento:MutableList<Pagamento>):
    RecyclerView.Adapter<AdapterPagamento.PagamentoViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagamentoViewHolder {
        var itemLista=PagamentoItemBinding.inflate(LayoutInflater.from(context),parent,false)
        return PagamentoViewHolder(itemLista)
    }

    override fun onBindViewHolder(holder: PagamentoViewHolder, position: Int) {
        holder.iconePagamento.setBackgroundResource(listaPagamento[position].icone!!)
        holder.txtTituloPagamento.text=listaPagamento[position].titulo
    }

    override fun getItemCount()=listaPagamento.size

    inner class PagamentoViewHolder(binding:PagamentoItemBinding): RecyclerView.ViewHolder(binding.root) {
        var iconePagamento=binding.icPagamento
        var txtTituloPagamento=binding.txtTituloPagamento
    }

}

