package my.shapsug.eventProject.place;

import org.springframework.stereotype.Component;

@Component
public class PlaceMapper {

    public Place requestToEntity(PlaceRequestDto request) {

        Place currentPlace = new Place();
        currentPlace.setPlaceNumber(request.getPlaceNumber());
        currentPlace.setPlaceType(request.getPlaceType());
        currentPlace.setStatus(request.getStatus());

        return currentPlace;
    }

    public PlaceResponseDto entityToDto(Place place) {

        PlaceResponseDto response = new PlaceResponseDto();
        response.setPlaceNumber(place.getPlaceNumber());
        response.setStatus(place.getStatus());
        response.setPlaceType(place.getPlaceType());

        return response;

    }
}
