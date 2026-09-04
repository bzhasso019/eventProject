package my.shapsug.eventProject.place;

import org.springframework.stereotype.Component;

@Component
public class PlaceMapper {

    public Place requestToEntity(PlaceRequestDto request) {

        Place currentPlace = new Place();
        currentPlace.setPlaceNumber(request.getPlaceNumber());
        currentPlace.setPlaceType(request.getPlaceType());
        currentPlace.setStatus(request.getStatus());
        currentPlace.setEventId(request.getEventId());
        currentPlace.setPrice(request.getPrice());

        return currentPlace;
    }

    public PlaceResponseDto entityToDto(Place place) {

        PlaceResponseDto response = new PlaceResponseDto();
        response.setPlaceNumber(place.getPlaceNumber());
        response.setStatus(place.getStatus());
        response.setPlaceType(place.getPlaceType());
        response.setEventId(place.getEventId());
        response.setPrice(place.getPrice());

        return response;

    }
}
