package com.bawei.zxshop.dao;

import java.util.List;

import com.bawei.zxshop.pojo.Spec;
import com.bawei.zxshop.pojo.SpecOption;

public interface SpecDao {

	int addSpec(Spec spec);

	int addOption(SpecOption specOption);

	int delOption(int ... ids);

	int delSpec(int[] ids);

	int update(Spec spec);

	List<Spec> list(Spec spec);

	Spec findById(int id);

	List<Spec> listAll();

}
