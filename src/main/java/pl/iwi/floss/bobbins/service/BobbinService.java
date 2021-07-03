package pl.iwi.floss.bobbins.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.iwi.floss.bobbins.model.Bobbin;
import pl.iwi.floss.bobbins.repository.BobbinRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BobbinService {

    private final BobbinRepository bobbinRepository;

    public List<Bobbin> getAllBobbins() {
        return bobbinRepository.findAll();
    }
}
