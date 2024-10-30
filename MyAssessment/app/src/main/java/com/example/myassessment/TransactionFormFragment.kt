package com.example.myassessment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast


class TransactionFormFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_transaction_form, container, false)

        view.findViewById<Button>(R.id.btn_save).setOnClickListener {
            Toast.makeText(requireContext(), "Saved....", Toast.LENGTH_SHORT).show()
        }

        return view
    }
}
