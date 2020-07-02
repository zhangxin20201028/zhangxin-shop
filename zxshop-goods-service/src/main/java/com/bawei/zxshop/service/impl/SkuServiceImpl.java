package com.bawei.zxshop.service.impl;

import java.util.List;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.bawei.zxshop.dao.SkuDao;
import com.bawei.zxshop.pojo.Sku;
import com.bawei.zxshop.pojo.SkuVo;
import com.bawei.zxshop.pojo.SpecOption;
import com.bawei.zxshop.service.SkuService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service(interfaceClass = SkuService.class)
public class SkuServiceImpl implements SkuService{

	@Autowired
	SkuDao skuDao;
	@Override
	public int add(Sku sku) {
		// TODO Auto-generated method stub
		int i=skuDao.insert(sku);
		List<SpecOption> options=sku.getOptions();
		for (SpecOption specOption : options) {
			i+=skuDao.insertSpecOption(sku.getId(),specOption);
		}
		return i;
	}

	@Override
	public int update(Sku sku) {
		// TODO Auto-generated method stub
		int i=skuDao.update(sku);
		i+=skuDao.deleteSpecOption(sku.getId());
		List<SpecOption> options=sku.getOptions();
		for (SpecOption specOption : options) {
			i+=skuDao.insertSpecOption(sku.getId(),specOption);
		}
		return i;
	}

	@Override
	public int delete(int[] ids) {
		// TODO Auto-generated method stub
		int i =skuDao.deleteSpecOption(ids);
		i+=skuDao.delete(ids);
		return i;
	}

	@Override
	public PageInfo<Sku> list(SkuVo skuVo) {
		// TODO Auto-generated method stub
		PageHelper.startPage(skuVo.getPageNum(),skuVo.getPageSize());
		return new PageInfo<Sku>(skuDao.list(skuVo)) ;
	}

	@Override
	public Sku getById(int id) {
		// TODO Auto-generated method stub
		return skuDao.findById(id);
	}
	@Override
	public List<Sku> listDetailBySpu(int spuId) {
		// TODO Auto-generated method stub
		return skuDao.ListBySpuId(spuId);
	}

}
