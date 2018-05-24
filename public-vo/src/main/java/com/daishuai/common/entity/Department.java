package com.daishuai.common.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2018/5/24 18:45
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
@Entity
@Table(name = "departments")
public class Department implements Serializable {

    @Id
    @GeneratedValue
    private Integer department_id;
    private String department_name;
    private Integer location_id;
    private Integer manager_id;

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public Integer getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(Integer department_id) {
        this.department_id = department_id;
    }

    public Integer getLocation_id() {
        return location_id;
    }

    public void setLocation_id(Integer location_id) {
        this.location_id = location_id;
    }

    public Integer getManager_id() {
        return manager_id;
    }

    public void setManager_id(Integer manager_id) {
        this.manager_id = manager_id;
    }
}
