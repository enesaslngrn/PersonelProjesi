package com.enesas.personelprojesi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.enesas.personelprojesi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var personelListe: ArrayList<Personel>

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        var view = binding.root
        setContentView(view)


        val aslan = Personel("Aslan","BT",R.drawable.aslan)
        val kaplan = Personel("Kaplan","IT",R.drawable.kaplan)
        val kedi = Personel("Kedi","Finans",R.drawable.kedi)

        personelListe = ArrayList<Personel>()

        personelListe.add(aslan)
        personelListe.add(kaplan)
        personelListe.add(kedi)

        val personelAdapter = PersonelAdapter(personelListe)
        binding.recyclerView.adapter = personelAdapter

        binding.recyclerView.layoutManager = LinearLayoutManager(this)



        var x: Int = 0

        if (x < personelListe.size){
            personelListe.forEach {
                println("İsim: ${it.isim},Departman: ${it.departman},Foto: ${it.foto}")
            }
        }

    }
}