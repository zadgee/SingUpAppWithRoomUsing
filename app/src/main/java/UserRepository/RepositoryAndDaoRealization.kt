package UserRepository

import Room.DAO.UserDAO
import androidx.lifecycle.LiveData
import com.example.myapplication.Model.UserModel

class RepositoryAndDaoRealization(private var dao:UserDAO):UserRepository {
    override val allusers: LiveData<List<UserModel>>
        get() = dao.getAllUser()

    override suspend fun insertUser(userModel: UserModel, onSuccess: () -> Unit) {
      dao.insertnewUser(userModel)
    }



    }
