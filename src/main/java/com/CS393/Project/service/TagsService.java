package com.CS393.Project.service;

import com.CS393.Project.model.Answer;
import com.CS393.Project.model.Tags;
import com.CS393.Project.repository.TagsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TagsService {

    @Autowired
    private TagsRepository tagsRepository;

    public Tags save(Tags tags){
        return tagsRepository.save(tags);
    }

}
