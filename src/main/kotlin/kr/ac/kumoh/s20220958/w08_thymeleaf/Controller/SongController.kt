package kr.ac.kumoh.s20220958.w08_thymeleaf.Controller

import kr.ac.kumoh.s20220958.w08_thymeleaf.Service.SongService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class SongController (
    private val service: SongService
){

    @GetMapping("/songs/random")
    fun getRandomSong(model: Model): String {
        model.addAttribute("song", service.getRandomSong())
        return "random"
    }
}