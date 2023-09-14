package com.recepgemalmaz.bootcamp_kotlin_odev_4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.recepgemalmaz.bootcamp_kotlin_odev_4.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {

    private lateinit var binding: FragmentAnasayfaBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.buttonAnasayfaGitA.setOnClickListener {
            val gecis = AnasayfaFragmentDirections.AnasayfatoSayfaA()
            Navigation.findNavController(it).navigate(gecis)
        }

        binding.buttonAnasayfaGitX.setOnClickListener {
            val gecis = AnasayfaFragmentDirections.AnasayfatoSayfaX()
            Navigation.findNavController(it).navigate(gecis)
        }
        return binding.root
    }


}