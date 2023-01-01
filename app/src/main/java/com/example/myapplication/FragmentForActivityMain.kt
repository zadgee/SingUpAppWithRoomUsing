package com.example.myapplication
import FragmentMainViewModel.fragmentmainviewmodel
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.myapplication.databinding.FragmentForActivityMainBinding



class FragmentForActivityMain : Fragment(R.layout.fragment_for_activity_main) {
    private lateinit var  binding :FragmentForActivityMainBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = FragmentForActivityMainBinding.inflate(inflater,container,false)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()


    }

private fun init(){
    val viewModel = ViewModelProvider(this).get(fragmentmainviewmodel::class.java)
    viewModel.initdb()
    binding.signupbutton.setOnClickListener {
        findNavController().navigate(R.id.action_fragmentForActivityMain_to_signUpFragment)
    }
}




}