package com.example.singleactivity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.singleactivity.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {
    lateinit var binding : FragmentFirstBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFirstBinding.inflate(inflater,container,false)


        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var bundle = bundleOf("textView" to "hello", "visibility" to true)
        var button1 = view.findViewById<Button>(R.id.button1)
    button1.setOnClickListener{
         findNavController().navigate(R.id.action_firstFragment_to_secondFragment, bundle)
     }
    }
}