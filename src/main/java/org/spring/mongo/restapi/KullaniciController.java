package org.spring.mongo.restapi;

import org.apache.coyote.Response;
import org.spring.mongo.restapi.entity.Kisi;
import org.spring.mongo.restapi.repository.KisiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping("/kullanici")
public class KullaniciController {
    @Autowired
    private KisiRepository kisiRepository;
    @PostMapping
    public ResponseEntity<Kisi> KisiEkle(@RequestBody Kisi kisi){
        return ResponseEntity.ok((kisiRepository.save(kisi)));
    }
    @GetMapping()
    public ResponseEntity<List<Kisi>> Listele(){

        return ResponseEntity.ok((kisiRepository.findAll()));
    }

}
