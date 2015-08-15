package cn.microvideo.fggs.purc.entity;

/**
 * 履约考核小组名单
 * @author Kw
 *
 * Date: 2015年7月31日
 */
public class AsseMember {
	/**
	 * 物理主键
	 */
    private String uuid;
    /**
	 * 考核小组
	 */
    private String suppGroupId;
    /**
	 * 姓名
	 */
    private String name;
    /**
	 * 部门（单位）
	 */
    private String deptName;
    /**
	 * 职称（职务）
	 */
    private String jobName;
    /**
	 * 排序
	 */
    private Integer sort;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getSuppGroupId() {
        return suppGroupId;
    }

    public void setSuppGroupId(String suppGroupId) {
        this.suppGroupId = suppGroupId == null ? null : suppGroupId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}