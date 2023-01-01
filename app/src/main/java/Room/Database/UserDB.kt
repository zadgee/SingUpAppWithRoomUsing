package Room.Database
import Room.DAO.UserDAO
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.myapplication.Model.UserModel

@Database (entities = [UserModel::class], version = 5, exportSchema = true)
abstract class UserDB:RoomDatabase(){
abstract fun getDAO(): UserDAO
companion object{
    private var database : UserDB?= null
    @Synchronized
    fun getadminDB(context: Context):UserDB{
        return if(database == null){
            database= Room.databaseBuilder(context,UserDB::class.java,"UserDatabase").build()
            database as UserDB
        }else{
        database as UserDB
        }
    }
}
}