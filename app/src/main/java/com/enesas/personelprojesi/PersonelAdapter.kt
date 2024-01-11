package com.enesas.personelprojesi

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.enesas.personelprojesi.databinding.RecyclerItemBinding

class PersonelAdapter (val personelListe: ArrayList<Personel>): RecyclerView.Adapter<PersonelAdapter.PersonelHolder>() {

    class PersonelHolder(val binding: RecyclerItemBinding): RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonelHolder {

        val binding = RecyclerItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return PersonelHolder(binding)
    }

    override fun getItemCount(): Int {
        return personelListe.size
    }

    override fun onBindViewHolder(holder: PersonelHolder, position: Int) {
        holder.binding.recyclerTextView.text = personelListe.get(position).isim
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, Profil::class.java)
            intent.putExtra("profil",personelListe.get(position))
            holder.itemView.context.startActivity(intent)

        }
    }
}