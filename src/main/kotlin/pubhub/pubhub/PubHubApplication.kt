package pubhub.pubhub

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class PubHubApplication

fun main(args: Array<String>) {
    SpringApplication.run(PubHubApplication::class.java, *args)
}
