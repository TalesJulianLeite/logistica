package com.leite.tales.integracaologistica.controller;

import com.leite.tales.integracaologistica.dto.response.OrderDTOResponse;
import com.leite.tales.integracaologistica.service.OrderService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
@CrossOrigin(origins = "*")
public class OrdearController {

  @Autowired
  private OrderService service;

  @PostMapping("/")
  public String handleFileUpload(@RequestParam("file") MultipartFile file,
      RedirectAttributes redirectAttributes) {

    storageService.store(file);
    redirectAttributes.addFlashAttribute("message",
        "You successfully uploaded " + file.getOriginalFilename() + "!");

    return "redirect:/";
  }

  @ExceptionHandler(StorageFileNotFoundException.class)
  public ResponseEntity<?> handleStorageFileNotFound(StorageFileNotFoundException exc) {
    return ResponseEntity.notFound().build();
  }

}
