package com.retech.nyscms.entity;

import java.io.Serializable;

public class BaseMgdatalibrary implements Serializable {
    private Integer userid;

    private Integer databaseid;

    private static final long serialVersionUID = 1L;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getDatabaseid() {
        return databaseid;
    }

    public void setDatabaseid(Integer databaseid) {
        this.databaseid = databaseid;
    }
}