package com.example.nubankclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.nubankclone.adapter.AdapterPagamento
import com.example.nubankclone.adapter.AdapterProduto
import com.example.nubankclone.databinding.ActivityMainBinding
import com.example.nubankclone.model.Pagamento
import com.example.nubankclone.model.Produto

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    private lateinit var adapterPagamento:AdapterPagamento
    private lateinit var adapterProduto: AdapterProduto
    private var listaProduto:MutableList<Produto> = mutableListOf()
    private var listaPagamento:MutableList<Pagamento> =mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()

        var recyclerIconesPagamento=binding.recyclerIconesPagamento
        recyclerIconesPagamento.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        recyclerIconesPagamento.setHasFixedSize(true)
        adapterPagamento= AdapterPagamento(this,listaPagamento)
        recyclerIconesPagamento.adapter=adapterPagamento
        listaIconesPagamento()

        var recyclerProdutos=binding.recylerProdutos
        recyclerProdutos.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        recyclerProdutos.setHasFixedSize(true)
        adapterProduto= AdapterProduto(this,listaProduto)
        recyclerProdutos.adapter=adapterProduto
        listaTextoInformativo()

    }

    private fun listaIconesPagamento(){
        var icone1=Pagamento(R.drawable.ic_pix,"Área Pix")
        listaPagamento.add(icone1)

        var icone2=Pagamento(R.drawable.barcode,"Pagamento")
        listaPagamento.add(icone2)

        var icone3=Pagamento(R.drawable.emprestimo,"Pegar \n Emprestado")
        listaPagamento.add(icone3)

        var icone4=Pagamento(R.drawable.transferencia,"Transferir")
        listaPagamento.add(icone4)

        var icone5=Pagamento(R.drawable.depositar,"Depositar")
        listaPagamento.add(icone5)

        var icone6=Pagamento(R.drawable.ic_recarga_celular,"Recarga de celular")
        listaPagamento.add(icone6)

        var icone7=Pagamento(R.drawable.ic_cobrar,"Cobrar")
        listaPagamento.add(icone7)

        var icone8=Pagamento(R.drawable.doacao,"Doação")
        listaPagamento.add(icone8)


    }

    private fun listaTextoInformativo(){
        var textoInformativo1=Produto("Participe da promoção Tudo no Roxinho e concorra a ...")
        listaProduto.add(textoInformativo1)

        var textoInformativo2=Produto("Chegou o débito automático na fatura do cartão")
        listaProduto.add(textoInformativo2)

        var textoInformativo3=Produto("Conheça a conta PJ: prática e livre de brucaracia para se...")
        listaProduto.add(textoInformativo3)

        var textoInformativo4=Produto("Salve seus amigos da burocracia: Faça um convite...")
        listaProduto.add(textoInformativo4)


    }
}