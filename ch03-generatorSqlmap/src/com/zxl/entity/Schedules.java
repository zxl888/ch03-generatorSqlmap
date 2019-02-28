package com.zxl.entity;

import java.util.Date;

public class Schedules {
    private Integer scid;

    private Integer docid;

    private Date scstart;

    private Date scstop;

    private Integer cid;

    public Integer getScid() {
        return scid;
    }

    public void setScid(Integer scid) {
        this.scid = scid;
    }

    public Integer getDocid() {
        return docid;
    }

    public void setDocid(Integer docid) {
        this.docid = docid;
    }

    public Date getScstart() {
        return scstart;
    }

    public void setScstart(Date scstart) {
        this.scstart = scstart;
    }

    public Date getScstop() {
        return scstop;
    }

    public void setScstop(Date scstop) {
        this.scstop = scstop;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", scid=").append(scid);
        sb.append(", docid=").append(docid);
        sb.append(", scstart=").append(scstart);
        sb.append(", scstop=").append(scstop);
        sb.append(", cid=").append(cid);
        sb.append("]");
        return sb.toString();
    }
}