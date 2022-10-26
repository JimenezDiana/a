package com.IronHack.Lab_3_06.repositories;

import com.IronHack.Lab_3_06.entities.Contacts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepository extends JpaRepository<Contacts, Integer> {

    @Query("SELECT middle_name from contacts WHERE id > 1;")
    List<Object> findMiddleNamesWhereIdIsBigThan1();

    @Query("SELECT names FROM Contacts WHERE saludation like A%")
    List<Object> findNamesWhereSaludationContainsA(String middleNames);

    @Query("UNION SELECT first_name from Contacts WHERE middle_name like JR")
    List<Object> findIfMiddleNamesContainsJR();

}
