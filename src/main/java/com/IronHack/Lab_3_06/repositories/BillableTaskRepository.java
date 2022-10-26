package com.IronHack.Lab_3_06.repositories;

import com.IronHack.Lab_3_06.entities.BillableTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillableTaskRepository extends JpaRepository<BillableTask, Integer> {
}
