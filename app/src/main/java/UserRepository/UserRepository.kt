package UserRepository

import androidx.lifecycle.LiveData
import com.example.myapplication.Model.UserModel


interface UserRepository {
val allusers:LiveData<List<UserModel>>
suspend fun insertUser(userModel: UserModel,onSuccess:()->Unit)
}

