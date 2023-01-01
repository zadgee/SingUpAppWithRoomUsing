package Room.DAO
import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.myapplication.Model.UserModel


@Dao
interface UserDAO {



  @Insert(onConflict = OnConflictStrategy.REPLACE)
 suspend fun insertnewUser(user:UserModel)

 @Query("select * from user_table where email like :email and password like :password")
suspend fun validationuser(email: String?, password:String?):List<UserModel>

@Query("select * from user_table")
fun getAllUser():LiveData<List<UserModel>>

}