package pubhub.pubhub.DBObjects

import org.springframework.data.annotation.Id

class Talk(var text: String){

    @Id
    lateinit var id: String


    var subTalkIds = ArrayList<Talk>()


}