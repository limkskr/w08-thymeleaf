package kr.ac.kumoh.s20220958.w08_thymeleaf.Controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class SongController {
    @GetMapping("/songs/random")
    fun getRandomSong(model: Model): String {
        model.addAttribute("songTitle", "soda pop")
        return "random"
    }
}