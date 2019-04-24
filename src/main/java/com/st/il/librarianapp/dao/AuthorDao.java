package com.st.il.librarianapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.st.il.librarianapp.models.Author;

@Repository
public interface AuthorDao extends JpaRepository<Author, Integer>{
	
}