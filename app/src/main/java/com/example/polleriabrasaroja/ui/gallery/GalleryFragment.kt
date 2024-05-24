package com.example.polleriabrasaroja.ui.gallery

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CalendarView
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.withStarted
import androidx.navigation.Navigation
import com.example.polleriabrasaroja.R
import com.example.polleriabrasaroja.Registro
import com.example.polleriabrasaroja.databinding.FragmentGalleryBinding

class GalleryFragment : Fragment() {


    private var _binding: FragmentGalleryBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private lateinit var calendarView: CalendarView
    private lateinit var bt1: RelativeLayout


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        ViewModelProvider(this).get(GalleryViewModel::class.java)

        _binding = FragmentGalleryBinding.inflate(inflater, container, false)
        val root: View = binding.root

        bt1 = binding.button1

        bt1.setOnClickListener{v ->
                Navigation.findNavController(v).navigate(R.id.nav_reservar_2)}

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }



}