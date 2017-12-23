package pubhub.pubhub

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import pubhub.pubhub.Repos.HubRepository
import pubhub.pubhub.DBObjects.Hub


@RestController
class webController {

    @Autowired
    lateinit var hubRepository: HubRepository

    @RequestMapping("/home")
    fun home(): String{
        return "wyatt"
    }

    @RequestMapping("/home/hubs")
    fun getHubs(): List<Hub>{
        return hubRepository.findAll()
    }

    @RequestMapping("/home/hubs/post")
    fun postHub(@RequestParam("xCoordinate") xCoordinate: Double,@RequestParam("yCoordinate") yCoordinate: Double,@RequestParam("name") name: String):Hub{

        var hub = Hub(xCoordinate,yCoordinate,name)

        hubRepository.insert(hub)

        return hub

    }

}