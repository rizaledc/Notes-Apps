package com.HomeRent.PBO.repository;
import com.HomeRent.PBO.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
    // Tidak perlu tulis save() dan findAll() manual, sudah diwarisi dari JpaRepository
}