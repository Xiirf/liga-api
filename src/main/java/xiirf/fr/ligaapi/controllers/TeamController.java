package xiirf.fr.ligaapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xiirf.fr.ligaapi.models.Team;
import xiirf.fr.ligaapi.repositories.TeamRepository;

@RestController
@RequestMapping(value = "/api/teams")
public class TeamController {
	@Autowired
	private TeamRepository teamRepository;
	
	@GetMapping
	public List<Team> getAll() {
		return (List<Team>)this.teamRepository.findAll();
	}

}
