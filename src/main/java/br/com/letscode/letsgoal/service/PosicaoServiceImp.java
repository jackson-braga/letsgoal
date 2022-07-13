package br.com.letscode.letsgoal.service;

import br.com.letscode.letsgoal.exception.PosicaoNotFoundException;
import br.com.letscode.letsgoal.model.Posicao;
import br.com.letscode.letsgoal.repository.PosicaoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class PosicaoServiceImp implements PosicaoService{
    private final PosicaoRepository posicaoRepository;

    public Posicao savePosicao(Posicao posicao) {
        return posicaoRepository.save(posicao);
    }


    public List<Posicao> findAll() {
        return (List<Posicao>) posicaoRepository.findAll();
    }


    public Posicao findById(Long id) {
        return posicaoRepository
                .findById(id)
                .orElseThrow(() -> new PosicaoNotFoundException());
    }
}
