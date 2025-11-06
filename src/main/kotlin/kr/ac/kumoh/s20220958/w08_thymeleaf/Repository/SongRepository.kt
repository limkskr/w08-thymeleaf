package kr.ac.kumoh.s20220958.w08_thymeleaf.Repository

import kr.ac.kumoh.s20220958.w08_thymeleaf.model.Song
import org.springframework.stereotype.Repository

@Repository

class SongRepository {
    private val songs = listOf(
        Song(1, "soda pop", "kpop"),
        Song(2, "happy day", "asd"),
        Song(3, "romantic", "zxc")
    )

    /**
     *
     */
    fun findAll() = songs.toList()

    fun findById(id: Int) : Song? {
        return songs.find { it.id == id }
    }

    fun count() = songs.size
}