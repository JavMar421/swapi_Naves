package com.example.naves

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.naves.databinding.RecyclerviewBinding

class RecyclerFiltradoAdapter(var personas: MutableList<Personajes>) :
    RecyclerView.Adapter<RecyclerFiltradoAdapter.TextoViewHolder>() {

    private val colorrojo = Color.RED
    private val colorverde = Color.GREEN
    private var nave: String = ""
    fun setpelicula(personaje: String) {
        this.nave = personaje
    }

    class TextoViewHolder(var itemBinding: RecyclerviewBinding) :
        RecyclerView.ViewHolder(itemBinding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextoViewHolder {
        val binding =
            RecyclerviewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TextoViewHolder(binding)

    }

    override fun onBindViewHolder(holder: TextoViewHolder, pos: Int) {
        if (personas[pos].starships.contains(nave))
            holder.itemBinding.name.setTextColor(colorverde)
        else
            holder.itemBinding.name.setTextColor(colorrojo)
        holder.itemBinding.name.text = personas[pos].name

    }

    override fun getItemCount(): Int {
        return personas.size
    }

}