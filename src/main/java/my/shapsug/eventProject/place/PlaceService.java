package my.shapsug.eventProject.place;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PlaceService {

    @Autowired
    PlaceRepository placeRepository;

    @Autowired
    PlaceMapper placeMapper;

    public PlaceResponseDto getPlaceById(long id) {
        Place place = placeRepository.findById(id).orElseThrow(() -> new PlaceNotFoundException("Место с айди " + id + " не найдено!"));
        return placeMapper.entityToDto(place);
    }

    public PlaceResponseDto createPlace(PlaceRequestDto request) {
        if (placeRepository.existsByPlaceNumber(request.getPlaceNumber())) {
            throw new PlaceAlreadyExistsException("Такое место уже существует!");
        }

        Place currentPlace = placeMapper.requestToEntity(request);
        Place saved = placeRepository.save(currentPlace);

        return placeMapper.entityToDto(saved);
    }


    public PlaceResponseDto updatePlaceById(long id, PlaceRequestDto request) {
        if (!placeRepository.existsById(id)) {
            throw new PlaceNotFoundException("Место с айди " + id + " не существует!");
        }
    }
}
