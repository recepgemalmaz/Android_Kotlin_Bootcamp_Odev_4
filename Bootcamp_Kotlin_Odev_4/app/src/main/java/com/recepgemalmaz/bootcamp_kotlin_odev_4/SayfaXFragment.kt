package com.recepgemalmaz.bootcamp_kotlin_odev_4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.recepgemalmaz.bootcamp_kotlin_odev_4.databinding.FragmentSayfaXBinding


class SayfaXFragment : Fragment() {

    private lateinit var binding: FragmentSayfaXBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentSayfaXBinding.inflate(inflater, container, false)

        binding.buttonSayfaX.setOnClickListener {
            val gecis = SayfaXFragmentDirections.SayfaXtoSayfaY()
            Navigation.findNavController(it).navigate(gecis)
        }
        return binding.root
    }

}