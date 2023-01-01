package FragmentMainViewModel

import Const.repository
import Room.Database.UserDB
import UserRepository.RepositoryAndDaoRealization
import android.app.Application
import androidx.lifecycle.AndroidViewModel

class fragmentmainviewmodel(application: Application):AndroidViewModel(application) {
    val context = application
fun initdb(){
    val daouser = UserDB.getadminDB(context).getDAO()
    repository = RepositoryAndDaoRealization(daouser)
}

}