package my.shapsug.eventProject.place;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlaceController {

    @Autowired
    PlaceService placeService;

    @GetMapping
    public ResponseEntity<PlaceResponseDto> getPlaceById(@PathVariable("id") long id) {
        PlaceResponseDto response = placeService.getPlaceById(id);
        return ResponseEntity.ok(response);
    }

}
