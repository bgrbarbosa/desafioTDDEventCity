package com.devsuperior.demo.controller;

import com.devsuperior.demo.dto.EventDTO;
import com.devsuperior.demo.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/")
public class EventController {

    @Autowired
    private EventService service;

    @PutMapping(value = "/events/{id}")
    public ResponseEntity<EventDTO> update(@PathVariable Long id, @RequestBody EventDTO dto) {
        dto = service.update(id, dto);
        return ResponseEntity.ok().body(dto);
    }
}
