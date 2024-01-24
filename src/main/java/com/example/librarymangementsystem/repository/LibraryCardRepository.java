package com.example.librarymangementsystem.repository;

import com.example.librarymangementsystem.entities.LibraryCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryCardRepository extends JpaRepository<LibraryCard,Integer> {
}
