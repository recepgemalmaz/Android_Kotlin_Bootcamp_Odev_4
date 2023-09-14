package com.recepgemalmaz.bootcamp_kotlin_odev_4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.recepgemalmaz.bootcamp_kotlin_odev_4.databinding.FragmentSayfaABinding


class SayfaAFragment : Fragment() {

    private lateinit var binding: FragmentSayfaABinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentSayfaABinding.inflate(inflater, container, false)



        binding.buttonSayfaA.setOnClickListener{

            val gecis = SayfaAFragmentDirections.SayfaAtoSayfaB()
            Navigation.findNavController(it).navigate(gecis)
        }
        return binding.root
    }
}