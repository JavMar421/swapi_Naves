package com.example.naves

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.naves.databinding.RecyclerviewBinding


class RecyclerAdapter(var personas: MutableList<Personajes>) :
    RecyclerView.Adapter<RecyclerAdapter.TextoViewHolder>() {


    class TextoViewHolder(var itemBinding: RecyclerviewBinding) :
        RecyclerView.ViewHolder(itemBinding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextoViewHolder {
        val binding =
            RecyclerviewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TextoViewHolder(binding)

    }

    override fun onBindViewHolder(holder: TextoViewHolder, pos: Int) {

        holder.itemBinding.name.text = personas[pos].name
        holder.itemBinding.all.setOnClickListener {
            val intent = Intent(holder.itemBinding.root.context, NavesActivity::class.java)
            intent.putExtra("personaje", personas[pos].url)
            holder.itemBinding.root.context.startActivity(intent)


        }
    }

    override fun getItemCount(): Int {
        return personas.size
    }

}