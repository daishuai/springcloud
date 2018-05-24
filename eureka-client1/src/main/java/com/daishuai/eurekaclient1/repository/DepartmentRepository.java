package com.daishuai.eurekaclient1.repository;

import com.daishuai.common.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2018/5/24 19:04
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
public interface DepartmentRepository extends JpaRepository<Department,Integer> {
}
