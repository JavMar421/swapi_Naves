package com.example.naves

import android.content.Intent
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.naves.databinding.RecyclerviewBinding

class RecyclerNavesAdapter(var naves: MutableList<Naves>) :
    RecyclerView.Adapter<RecyclerNavesAdapter.TextoViewHolder>() {
    private val colorrojo = Color.RED
    private val colorverde = Color.GREEN
    private var personaje: String = ""
    fun setpersonaje(personaje: String) {
        this.personaje = personaje
    }

    class TextoViewHolder(var itemBinding: RecyclerviewBinding) :
        RecyclerView.ViewHolder(itemBinding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextoViewHolder {
        val binding =
            RecyclerviewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TextoViewHolder(binding)

    }

    override fun onBindViewHolder(holder: TextoViewHolder, pos: Int) {

        holder.itemBinding.name.text = naves[pos].name
        if (naves[pos].pilots.contains(personaje))
            holder.itemBinding.name.setTextColor(colorverde)
        else
            holder.itemBinding.name.setTextColor(colorrojo)

        holder.itemBinding.all.setOnClickListener {
            val intent = Intent(holder.itemBinding.root.context, PersonajesFiltradosActivity::class.java)
            intent.putExtra("nave", naves[pos].url)
            holder.itemBinding.root.context.startActivity(intent)


        }
    }

    override fun getItemCount(): Int {
        return naves.size
    }

}

