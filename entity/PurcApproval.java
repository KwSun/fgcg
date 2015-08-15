package cn.microvideo.fggs.purc.entity;

import java.util.Date;

/**
 * 采购文件审批
 * @author Kw
 *
 * Date: 2015年7月31日
 */
public class PurcApproval {
	/**
	 * 物理主键
	 */
    private String uuid;
    /**
	 * 采购项目
	 */
    private String purcId;
    /**
	 * 实施地点
	 */
    private String constSite;
    /**
	 * 采购方式及理由
	 */
    private String wayReason;
    /**
	 * 主要条款
	 */
    private String purcTerms;
    /**
	 * 审批编号
	 */
    private String apprNo;
    /**
	 * 申请人
	 */
    private String creatorId;
    /**
	 * 申请人姓名
	 */
    private String creatorName;
    /**
	 * 申请部门
	 */
    private String deptId;
    /**
	 * 申请部门名称
	 */
    private String deptName;
    /**
	 * 创建时间
	 */
    private Date createTime;
    /**
	 * 更新时间
	 */
    private Date updateTime;
    /**
	 * 流程实例
	 */
    private Long flowInstanceId;
    /**
	 * 流程状态
	 */
    private Short flowStatus;
    
    /**
     * 项目名称
     */
    private String name;
    
    /**
     * 预算经费
     */
    private long investment;
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getInvestment() {
		return investment;
	}

	public void setInvestment(long investment) {
		this.investment = investment;
	}

	public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getPurcId() {
        return purcId;
    }

    public void setPurcId(String purcId) {
        this.purcId = purcId == null ? null : purcId.trim();
    }

    public String getConstSite() {
        return constSite;
    }

    public void setConstSite(String constSite) {
        this.constSite = constSite == null ? null : constSite.trim();
    }

    public String getWayReason() {
        return wayReason;
    }

    public void setWayReason(String wayReason) {
        this.wayReason = wayReason == null ? null : wayReason.trim();
    }

    public String getPurcTerms() {
        return purcTerms;
    }

    public void setPurcTerms(String purcTerms) {
        this.purcTerms = purcTerms == null ? null : purcTerms.trim();
    }

    public String getApprNo() {
        return apprNo;
    }

    public void setApprNo(String apprNo) {
        this.apprNo = apprNo == null ? null : apprNo.trim();
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId == null ? null : creatorId.trim();
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName == null ? null : creatorName.trim();
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getFlowInstanceId() {
        return flowInstanceId;
    }

    public void setFlowInstanceId(Long flowInstanceId) {
        this.flowInstanceId = flowInstanceId;
    }

    public Short getFlowStatus() {
        return flowStatus;
    }

    public void setFlowStatus(Short flowStatus) {
        this.flowStatus = flowStatus;
    }
}