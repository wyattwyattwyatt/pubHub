package pubhub.pubhub

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import pubhub.pubhub.DBObjects.Hub
import pubhub.pubhub.DBObjects.Talk
import pubhub.pubhub.Repos.HubRepository
import pubhub.pubhub.Repos.TalkRepository
import javax.websocket.server.PathParam


@RestController
class WebController {

    @Autowired
    lateinit var hubRepository: HubRepository

    @Autowired
    lateinit var talkRepository: TalkRepository

    @RequestMapping("/home")
    fun home(): String {
        return "wyatt"
    }

    @RequestMapping("/home/hubs")
    fun getHubs(): ArrayList<Hub> {
        return hubRepository.findAll()
    }

    @RequestMapping("/home/hubs/{id}")
    fun getHub(@PathVariable id: String): Hub {
        return hubRepository.findOneById(id)
    }

    @RequestMapping("/home/hubs/post")
    fun postHub(@RequestParam("xCoordinate") xCoordinate: Double, @RequestParam("yCoordinate") yCoordinate: Double, @RequestParam("name") name: String): Hub {

        var hub = Hub(xCoordinate, yCoordinate, name)

        hubRepository.insert(hub)

        return hub
    }


    @RequestMapping("home/talks")
    fun getTalks(): ArrayList<Talk>{
        return talkRepository.findAll()
    }

    //@RequestMapping("")






}