package website.advertisement.controller;


import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import website.advertisement.Model.Client;
import website.advertisement.domain.User;

@Data
@Controller
public class ClientController {
    private Client client;




    @PostMapping( "/registration")
    public ResponseEntity registration(@RequestBody Client client){
        return  ResponseEntity.ok(client);
    }
    @GetMapping("/registration")
    public ResponseEntity registration(@PathVariable Long id){

        return ResponseEntity.ok(id);
    }

}
