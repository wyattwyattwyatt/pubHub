package pubhub.pubhub.Repos

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Component
import pubhub.pubhub.DBObjects.Hub


@Component
interface TalkRepository : MongoRepository<Hub, String> {



    override fun findAll(): ArrayList<Hub>


}