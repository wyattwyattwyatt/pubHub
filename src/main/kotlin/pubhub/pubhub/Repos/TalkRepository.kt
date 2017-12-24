package pubhub.pubhub.Repos

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Component
import pubhub.pubhub.DBObjects.Talk


@Component
interface TalkRepository : MongoRepository<Talk, String> {



    override fun findAll(): ArrayList<Talk>


}