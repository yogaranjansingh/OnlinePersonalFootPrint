package com.yota.controller;

import com.yota.model.Note;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("notes")
public class NotesController {

    @PostMapping(path = "/save")
    public boolean saveNote(@RequestBody Note note) {
        return false;
    }

    @GetMapping(value = "/getAllNotesByUserId")
    public List<Note> getAllNotesByUserId(@PathVariable("userId") Long userId) {
        return null;
    }

}
