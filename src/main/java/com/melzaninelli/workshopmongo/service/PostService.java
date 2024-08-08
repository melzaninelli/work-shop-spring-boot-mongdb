package com.melzaninelli.workshopmongo.service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.melzaninelli.workshopmongo.domain.Post;
import com.melzaninelli.workshopmongo.repository.PostRepository2;
import com.melzaninelli.workshopmongo.service.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository2 repo;
	
	public Post findById(String id) {
		Optional<Post>  user = repo.findById(id);
		if(user == null) {
			throw new ObjectNotFoundException("Objeto não encontrado");
		}
		return null;
	}
	
	public List<Post> findByTitle(String text) {
		return repo.searchTitle(text);
	}
	public List<Post> fullSearch(String text, Date minDate, Date maxDate) {
		maxDate = new Date(maxDate.getTime() + 24 * 60 * 60 * 1000);
		return repo.fullSearch(text, minDate, maxDate);
	}

	
	
}
