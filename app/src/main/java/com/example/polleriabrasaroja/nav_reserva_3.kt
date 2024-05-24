package com.example.polleriabrasaroja

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import androidx.navigation.Navigation
import com.example.polleriabrasaroja.databinding.FragmentNavReserva3Binding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"
private lateinit var bt3: RelativeLayout

/**
 * A simple [Fragment] subclass.
 * Use the [nav_reserva_3.newInstance] factory method to
 * create an instance of this fragment.
 */
class nav_reserva_3 : Fragment() {
    // TODO: Rename and change types of parameters
    private var _binding: FragmentNavReserva3Binding? = null
    private val binding get() = _binding!!
    private var param1: String? = null
    private var param2: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentNavReserva3Binding.inflate(inflater,container,false)
        val root: View = binding.root

        bt3 = binding.button3
        bt3.setOnClickListener{v ->
            Navigation.findNavController(v).navigate(R.id.nav_perfil) }
        return root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment nav_reserva_3.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            nav_reserva_3().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}