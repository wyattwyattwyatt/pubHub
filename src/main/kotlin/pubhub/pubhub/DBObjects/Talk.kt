package pubhub.pubhub.DBObjects

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import org.springframework.format.annotation.DateTimeFormat
import java.util.*

class Talk(var text: String){

    @Id
    lateinit var id: String

    @CreatedDate
    lateinit var created: Date


    var subTalkIds = ArrayList<String>()


}