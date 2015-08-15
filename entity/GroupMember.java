package cn.microvideo.fggs.purc.entity;

/**
 * 评审小组成员
 * @author Kw
 *
 * Date: 2015年7月31日
 */
public class GroupMember {
	/**
	 * 物理主键
	 */
    private String uuid;
    /**
	 * 所属小组
	 */
    private String groupId;
    /**
	 * 姓名
	 */
    private String name;
    /**
	 * 单位（部门）
	 */
    private String deptName;
    /**
	 * 职位
	 */
    private String jobName;
    /**
	 * 排序号
	 */
    private Short sortNo;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
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

    public Short getSortNo() {
        return sortNo;
    }

    public void setSortNo(Short sortNo) {
        this.sortNo = sortNo;
    }
}