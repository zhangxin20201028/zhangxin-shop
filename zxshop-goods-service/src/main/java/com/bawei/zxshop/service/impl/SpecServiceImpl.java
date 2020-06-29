package com.bawei.zxshop.service.impl;

import java.util.List;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.bawei.zxshop.dao.SpecDao;
import com.bawei.zxshop.pojo.Spec;
import com.bawei.zxshop.pojo.SpecOption;
import com.bawei.zxshop.service.SpecService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
/**
 * 
 * @ClassName: SpecServiceImpl 
 * @Description: 规格管理实现类
 * @author: 28987
 * @date: 2020年6月24日 下午10:44:45
 */
@Service(interfaceClass = SpecService.class)
public class SpecServiceImpl implements SpecService{

	@Autowired
	SpecDao specDao;
	
	
	@Override
	public int add(Spec spec) {
		// 添加主表
		int result=specDao.addSpec(spec);
		List<SpecOption> list = spec.getOptions();
		for (SpecOption specOption : list) {
			specOption.setSpecid(spec.getId());
			result+=specDao.addOption(specOption);
		}
		return result;
	}

	@Override
	public int delete(int[] ids) {
		// 先删除子表
		int result=specDao.delOption(ids);
		result+=specDao.delSpec(ids);
		return result;
	}

	@Override
	public int update(Spec spec) {
		//修改主表
		int result=specDao.update(spec);
		specDao.delOption(spec.getId());
		List<SpecOption> list = spec.getOptions();
		for (SpecOption specOption : list) {
			specOption.setSpecid(spec.getId());
			result+=specDao.addOption(specOption);
		}
		return result;
	}

	@Override
	public PageInfo<Spec> list(int pageNum, int pageSize, Spec spec) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Spec>(specDao.list(spec));
	}

	@Override
	public Spec getById(int id) {
		// TODO Auto-generated method stub
		return specDao.findById(id);
	}

	@Override
	public List<Spec> listAll() {
		// TODO Auto-generated method stub
		return specDao.listAll();
	}

}
