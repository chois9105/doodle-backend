package com.test.doodle.repository;


import com.test.doodle.entity.Chat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChatDAO extends JpaRepository<Chat, Long> {


    List<Chat> findAllByOrderByDateAsc();

}
