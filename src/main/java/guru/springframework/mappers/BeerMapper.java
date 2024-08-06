package guru.springframework.mappers;

import guru.springframework.spring6restmvc.entities.Beer;
import guru.springframework.spring6restmvc.model.BeerDTO;

public interface BeerMapper {
    Beer beerDtoToDto(BeerDTO dto);

    BeerDTO beerToBeerDto(Beer beer);

}
