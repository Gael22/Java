
package com.app.service.impl;

import java.util.List;


import com.app.dao.PlayerSearchDAO;
import com.app.dao.impl.PlayerSearchDAOImpl;
import com.app.exception.BusinessException;
import com.app.model.Player;
import com.app.service.PlayerSearchService;
import com.app.validation.Validation;

public class PlayerSearchServiceImpl implements PlayerSearchService {

	private PlayerSearchDAO playerSearchDAO = new PlayerSearchDAOImpl();

	@Override
	public Player getPlayerById(int id) throws BusinessException {
		Player player = null;
		if (id > 99 && id < 1000) {
			// code here for DAO
			player = playerSearchDAO.getPlayerById(id);
		} else {
			throw new BusinessException("Entered Player Id " + id + " is INVALID......");
		}
		return player;
	}

	
	@Override
	public Player getPlayerbyContact(long contact) throws BusinessException {
		Player player = null;
		
		if(Validation.contactValiation(contact)) {
			player = playerSearchDAO.getPlayerByContact(contact);
		}else {
			throw new BusinessException("Entered Player contact("+contact+") is invalid......Please enter a 10 digit contact number");
		}
		
		return player;
		
	}


	@Override
	public List<Player> getAllPlayers() throws BusinessException {
		List<Player> allPlayersList = null;
		allPlayersList = playerSearchDAO.getAllPlayers();
		return allPlayersList;
	}

	@Override
	public List<Player> getPlayersByAge(int age) throws BusinessException {
		List<Player> agePlayersList = null;
		if (age > 19 && age < 41) {
			// code here for DAO
			agePlayersList = playerSearchDAO.getPlayersByAge(age);
		} else {
			throw new BusinessException("Entered Player Age " + age + " is INVALID......");
		}
		return agePlayersList;
	}

	@Override
	public List<Player> getPlayersByGender(String gender) throws BusinessException {
		List<Player> playersGender=null;
		if(gender!=null && gender.matches("[a-zA-Z]")) {
			playersGender=playerSearchDAO.getPlayersByGender(gender);
		}else {
			throw new BusinessException("Entered Gender "+gender+" is INVALID");
		}
		return playersGender;
	}
	

	@Override
	public List<Player> getPlayersByTeamName(String teamname) throws BusinessException {
		List<Player> teamPlayersList=null;
		if(teamname!=null && teamname.matches("[a-zA-Z]{5,20}")) {
			teamPlayersList=playerSearchDAO.getPlayersByTeamName(teamname);
		}else {
			throw new BusinessException("Entered TeamName "+teamname+" is INVALID");
		}
		return teamPlayersList;
	}

	@Override
	public List<Player> getPlayersByName(String name) throws BusinessException {
		List<Player> playersName=null;
		if(name!=null && name.matches("[a-zA-Z]{5,20}")) {
			playersName=playerSearchDAO.getPlayersByName(name);
		}else {
			throw new BusinessException("Entered Name "+name+" is INVALID");
		}
		return playersName;
	}
	

	@Override
	public List<Player> getPlayersByDob(String dob) throws BusinessException {
		List<Player> playersDOBList = null;
		if (dob != null && dob.matches("[0-9]{4}-[0-9]{2}-[0-9]{2}")) {
			playersDOBList = playerSearchDAO.getPlayersByDob(dob);
		}else {
			throw new BusinessException("Enter Date of Birth " + dob + " is INVALID");
		}
		return playersDOBList;
	}

}
