package com.kpfu.pm.coffeehouse.service.impl;

import com.kpfu.pm.coffeehouse.repository.BarmanRepository;
import com.kpfu.pm.coffeehouse.service.BarmanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BarmanServiceImpl implements BarmanService {

    @Autowired
    BarmanRepository barmanRepository;



}
