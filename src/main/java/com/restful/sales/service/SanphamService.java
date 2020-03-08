package com.restful.sales.service;


import com.restful.sales.repository.SanphamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.restful.sales.entities.Sanpham;

import java.util.Objects;

@Service
public class SanphamService {

    @Autowired
    SanphamRepository sanphamRepo;

    public ServiceResult findAll(){
        ServiceResult result = new ServiceResult();
        result.setData(sanphamRepo.findAll());
        return result;
    }

    public ServiceResult findById(int idsanpham){
        ServiceResult result = new ServiceResult();
        Sanpham sanpham = sanphamRepo.findById(idsanpham).orElse(null);
        result.setData(sanpham);
        return result;
    }

    public ServiceResult create(Sanpham sanpham){
        ServiceResult result = new ServiceResult();
        result.setData(sanphamRepo.save(sanpham));
        return result;
    }

    public  ServiceResult update(Sanpham sanpham){
        ServiceResult result = new ServiceResult();

        if(!sanphamRepo.findById(sanpham.getIdsanpham()).isPresent()){
            result.setStatus(ServiceResult.Status.FAILED);
            result.setMessage("Không Tìm Thấy");
        }else{
            result.setData(sanphamRepo.save(sanpham));
            result.setMessage("Thành Công");
        }
        return result;
    }

    public ServiceResult delete(int idsanpham){
        ServiceResult result = new ServiceResult();

        Sanpham sanpham = sanphamRepo.findById(idsanpham).orElse(null);
        if(sanpham==null){
            result.setStatus(ServiceResult.Status.FAILED);
            result.setMessage("Xóa Không Thành Công");
        }else{
            sanphamRepo.delete(sanpham);
            result.setMessage("Thành Công");
        }
        return result;
    }
}
