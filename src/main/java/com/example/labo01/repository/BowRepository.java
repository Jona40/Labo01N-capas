package com.example.labo01.repository;

import com.example.labo01.common.BowList;
import com.example.labo01.domain.model.Bow;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class BowRepository {

    private final BowList bowList;

    public List<Bow> findAll() {
        return bowList.getBows();
    }
}