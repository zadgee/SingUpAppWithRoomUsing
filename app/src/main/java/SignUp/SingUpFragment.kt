package SignUp
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.myapplication.Model.UserModel
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentSignUpBinding


class SingUpFragment : Fragment() {
 lateinit var binding:FragmentSignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
binding = FragmentSignUpBinding.inflate(inflater)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val viewModel = ViewModelProvider(this).get(SingUpViewModel::class.java)
        binding.signupbuttoninsignupfragment.setOnClickListener {
            val espace = binding.EmailSpaceSignUp.text.toString()
            val pspace = binding.PasswordSpaceSignUp.text.toString()

        binding.signupbuttoninsignupfragment.setOnClickListener {
            if(binding.EmailSpaceSignUp.length() == 0 && binding.PasswordSpaceSignUp.length() == 0){
                Toast.makeText(context,"The textspaces are empty",Toast.LENGTH_SHORT).show()
            }else{
                viewModel.insert(UserModel(email = espace, password = pspace, id = id )){}
            }
            if(binding.EmailSpaceSignUp.length()<10 && binding.PasswordSpaceSignUp.length() <8){
                Toast.makeText(context,"The symbols in textspaces are too short",Toast.LENGTH_SHORT).show()
            }else{
                viewModel.insert(UserModel(email = espace, password = pspace, id = id )){}
            }
            findNavController().navigate(R.id.action_signUpFragment_to_lastfragment)
binding.backbttomainfragment.setOnClickListener{
    findNavController().navigate(R.id.action_signUpFragment_to_fragmentForActivityMain)
}
        }
        }
    }
}