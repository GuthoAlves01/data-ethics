package br.unitins.dataethics.service;

import br.unitins.dataethics.entity.Feedback;
import br.unitins.dataethics.entity.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

@Service
public class FeedbackService {
    @Autowired
    private FeedbackRepository repository;
    public void salvar(Feedback feedback){
        repository.save(feedback);
    }

    public Iterable<Feedback> buscarTudo(){
        return repository.findAll();
    }

}
