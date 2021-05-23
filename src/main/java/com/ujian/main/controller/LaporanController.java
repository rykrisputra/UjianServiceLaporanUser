package com.ujian.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ujian.main.entity.Laporan;
import com.ujian.main.repository.LaporanRepository;

@RestController
@RequestMapping("/laporan")
public class LaporanController {

	@Autowired
	LaporanRepository laporanRepo;
	
	@GetMapping("/")
    public List<Laporan> getAll() {
        return laporanRepo.findAll();
    }

    @PostMapping("/lapor/")
    public String addLaporan(@RequestBody Laporan user) {
        laporanRepo.save(user);
        return "Insert Berhasil";
    }
}
