package my.shapsug.eventProject.place;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
public class PlaceController {

    @Autowired
    PlaceService placeService;

    @GetMapping
    public ResponseEntity<PlaceResponseDto> getPlaceById(@PathVariable("id") long id) {
        PlaceResponseDto response = placeService.getPlaceById(id);
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<PlaceResponseDto> createPlace(@RequestBody PlaceRequestDto request) {
        PlaceResponseDto response = placeService.createPlace(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping
    public ResponseEntity<PlaceResponseDto> updatePlaceById(@PathVariable("id") long id, PlaceRequestDto request) {
        PlaceResponseDto response = placeService.updatePlaceById(id, request);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

}
