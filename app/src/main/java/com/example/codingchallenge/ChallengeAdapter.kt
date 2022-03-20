package com.example.codingchallenge

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.example.codingchallenge.models.Challenge
import kotlinx.android.synthetic.main.fragment_movie_list.view.*


class ChallengeAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    private var items : List<Challenge> = ArrayList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

 // Retorna um RecyclerView.ViewHolder
        return ChallengeViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.fragment_movie_list, parent, false)
        )

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
//
        when(holder) {
            is ChallengeViewHolder ->{
                holder.bind(items[position])
            }
        }

    }
     // É um metodo do Adapter que vai dizer para o RV, quantos Itens RV vai mostrar pra ele ir fazer toda lógica de back
    override fun getItemCount(): Int {
        return items.size

    }

    fun setDataSet(Challenges : List<Challenge>){

        this.items = Challenges

    }

// Conceitos de View Holder - Uma representação do Layout no XML (Dentro do Adapter)

    class ChallengeViewHolder constructor(
        itemView : View
    ): RecyclerView.ViewHolder(itemView){

        private val Challengetitle= itemView.title
        private val Challengeauhtor= itemView.author

        // Ele pega as informacoes da Model e coloca no Layout do RecyclerView

        fun bind(Challenge: Challenge) {
            Challengetitle.text = Challenge.title
            Challengeauhtor.text = Challenge.author
        }

    }
}