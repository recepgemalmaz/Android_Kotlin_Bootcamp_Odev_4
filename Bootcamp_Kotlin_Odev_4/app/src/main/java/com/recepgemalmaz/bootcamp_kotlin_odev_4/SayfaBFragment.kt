package com.recepgemalmaz.bootcamp_kotlin_odev_4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.recepgemalmaz.bootcamp_kotlin_odev_4.databinding.FragmentSayfaBBinding


class SayfaBFragment : Fragment() {


    private lateinit var binding: FragmentSayfaBBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentSayfaBBinding.inflate(inflater, container, false)


        binding.buttonSayfaB.setOnClickListener {

            val gecis = SayfaBFragmentDirections.SayfaBtoSayfaY()
            Navigation.findNavController(it).navigate(gecis)
        }

        return binding.root
    }

}