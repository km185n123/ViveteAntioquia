package com.example.vivetelaantioquia.experiences.view

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.vivetelaantioquia.R
import com.example.vivetelaantioquia.experiences.viewmodel.ExperiencesViewModel

class ExperiencesFragment : Fragment() {

    companion object {
        fun newInstance() =
            ExperiencesFragment()
    }

    private lateinit var viewModel: ExperiencesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.experiences_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ExperiencesViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
