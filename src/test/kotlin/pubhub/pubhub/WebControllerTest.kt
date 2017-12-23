package pubhub.pubhub

import org.junit.Test
import org.springframework.beans.factory.annotation.Autowired


class WebControllerTest{
    @Autowired
    lateinit var webController: WebController





    @Test
    fun testGetHubs(){
        assert(webController.getHubs()!=null)
    }




}