package App.controller;

import App.dto.UserResp;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/app/like")
public class LikeController {

    @PostMapping("/{id}")
    public ResponseEntity<?> like(@PathVariable Integer id){
        return null;
    }

    @GetMapping("/favs")
    public ResponseEntity<List<UserResp>> favourites(){
        return null;
    }
}
