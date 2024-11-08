package com.yug.User_access_managment_final.Repo;

import com.yug.User_access_managment_final.model.AccessRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccessRepo extends JpaRepository<AccessRequest , Long> {
    List<AccessRequest> findByStatus(String status);
}
