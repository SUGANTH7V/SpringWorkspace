package com.sorpage.sug.surepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sorpage.sug.modal.SuModal;

@Repository
public interface SuRepository extends JpaRepository<SuModal,Integer> {

}
