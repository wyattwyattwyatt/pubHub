package pubhub.pubhub.DBObjects

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import java.util.*


class Hub( var xCoordinate: Double, var yCoordinate: Double, var name: String) {

    @Id
    lateinit var id: String

    @CreatedDate
    lateinit var created: Date


    var talks = ArrayList<String>()

    fun comment(comment: String): Talk{

        talks.add(comment)
        return Talk(comment)




    }
}