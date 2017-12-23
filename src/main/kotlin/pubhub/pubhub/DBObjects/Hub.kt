package pubhub.pubhub.DBObjects

import org.springframework.data.annotation.Id



class Hub( var xCoordinate: Double, var yCoordinate: Double, var name: String) {

    @Id
    lateinit var id: String

}