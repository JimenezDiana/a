package com.IronHack.Lab_3_06.repositories;

import com.IronHack.Lab_3_06.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InternalTaskRepository extends JpaRepository<Task, Integer> {
}
