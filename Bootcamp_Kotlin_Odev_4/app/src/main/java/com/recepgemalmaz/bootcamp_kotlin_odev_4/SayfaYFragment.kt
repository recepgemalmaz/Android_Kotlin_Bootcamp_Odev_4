package com.recepgemalmaz.bootcamp_kotlin_odev_4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import com.google.android.material.snackbar.Snackbar
import com.recepgemalmaz.bootcamp_kotlin_odev_4.databinding.FragmentSayfaYBinding


class SayfaYFragment : Fragment() {

    private lateinit var binding: FragmentSayfaYBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentSayfaYBinding.inflate(inflater, container, false)


        val geriTusu = object : OnBackPressedCallback(true) { //true olursa geri tusu aktif degil
            override fun handleOnBackPressed() {
                Snackbar.make(
                    binding.root,
                    "Anasayfaya geri donmek istiyor musunuz ",
                    Snackbar.LENGTH_SHORT
                ).setAction("Evet") {
                    isEnabled = false
                    requireActivity().onBackPressedDispatcher.onBackPressed()
                }.show()
            }
        }

        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, geriTusu)
        return binding.root
    }


}