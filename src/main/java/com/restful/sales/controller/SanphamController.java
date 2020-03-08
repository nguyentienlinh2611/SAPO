package com.restful.sales.controller;


import com.restful.sales.entities.Sanpham;
import com.restful.sales.service.SanphamService;
import com.restful.sales.service.ServiceResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sales")
public class SanphamController {

    @Autowired
    private SanphamService sanphamService;

    @GetMapping("/sanpham")
    public ResponseEntity<ServiceResult> findAllSanpham(){
        return new ResponseEntity<ServiceResult>(sanphamService.findAll(), HttpStatus.OK);
    }


    @GetMapping("/sanpham/{idsanpham}")
    public ResponseEntity<ServiceResult> findById(@PathVariable int idsanpham){
        return new ResponseEntity<ServiceResult>(sanphamService.findById(idsanpham), HttpStatus.OK);
    }

    @PutMapping("/sanpham")
    public ResponseEntity<ServiceResult> update(@RequestBody Sanpham sanpham){
        return new ResponseEntity<ServiceResult>(sanphamService.update(sanpham), HttpStatus.OK);
    }

    @PostMapping("/sanpham")
    public ResponseEntity<ServiceResult> create(@RequestBody Sanpham sanpham){
        return  new ResponseEntity<ServiceResult>(sanphamService.create(sanpham), HttpStatus.OK);
    }


    @DeleteMapping("/sanpham")
    public ResponseEntity<ServiceResult> delete(@RequestBody DeleteSanphamRequest request){
        return new ResponseEntity<ServiceResult>(sanphamService.delete(request.getId()),HttpStatus.OK);
    }
}

