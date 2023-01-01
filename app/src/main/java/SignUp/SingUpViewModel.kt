package SignUp

import Const.repository
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.Model.UserModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class SingUpViewModel: ViewModel() {

    fun insert(userModel: UserModel,onSuccess:()->Unit) =
        viewModelScope.launch(Dispatchers.IO) {
            repository.insertUser(userModel){
onSuccess()
            }
        }


}