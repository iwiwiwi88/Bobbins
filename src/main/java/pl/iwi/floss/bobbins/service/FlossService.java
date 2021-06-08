package pl.iwi.floss.bobbins.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.iwi.floss.bobbins.model.Floss;
import pl.iwi.floss.bobbins.repository.FlossRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FlossService {

    private final FlossRepository flossColorRepository;

    public List<Floss> getAllFlosses() {
        return flossColorRepository.findAll();
    }

    public Floss getFloss(Long id) {
        return flossColorRepository.getById(id);
    }

}
