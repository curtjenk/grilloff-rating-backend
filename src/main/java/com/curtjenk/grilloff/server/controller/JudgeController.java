package com.curtjenk.grilloff.server.controller;

import java.util.List;

import javax.validation.Valid;

import org.hibernate.exception.*;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curtjenk.grilloff.server.repository.JudgeRepository;
import com.curtjenk.grilloff.server.model.Judge;


@RestController
public class JudgeController {
	
	@Autowired
	private JudgeRepository judgeRepository;
	
	@GetMapping("/judges")
    public List<Judge> getJudges() {
        return judgeRepository.findAll();
    }
	
	@PostMapping("/judge")
    public Judge createJudge(@Valid @RequestBody Judge judge) {
		Judge resp = null;
		try {
			resp = judgeRepository.save(judge);
		} catch (ConstraintViolationException cve) {
			System.out.println("hello");
		} catch (Exception e) {
			System.out.println("there");
		}
		
        return resp;
    }
}
