package pubhub.pubhub.Repos

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Component
import pubhub.pubhub.DBObjects.Hub

@Component
interface HubRepository : MongoRepository<Hub,String>{



     open override fun findAll(): List<Hub>


}
