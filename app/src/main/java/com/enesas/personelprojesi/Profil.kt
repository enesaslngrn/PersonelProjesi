package com.enesas.personelprojesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.enesas.personelprojesi.databinding.ActivityProfilBinding

class Profil : AppCompatActivity() {
    lateinit var binding: ActivityProfilBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityProfilBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        var view = binding.root
        setContentView(view)

        val intent = intent

        val gelenProfil = intent.getSerializableExtra("profil") as Personel

        binding.textViewIsim.text = gelenProfil.isim
        binding.textViewDep.text = gelenProfil.departman
        binding.imageView.setImageResource(gelenProfil.foto)

    }
}