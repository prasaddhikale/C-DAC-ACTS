package com.app.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository //represent class that communicates with database
public class TeamDaoImpl implements TeamDao {

	@Autowired //dependency (super i/f of hibernate)
	private EntityManager mgr;
	
	@Override
	public List<String> getTeamsAbbreviations() {
		
		String jpql="select t.abbreviation from Team t";
		
		return mgr.createQuery(jpql,String.class).getResultList();
	}

}
