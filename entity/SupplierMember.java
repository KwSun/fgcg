package cn.microvideo.fggs.purc.entity;

/**
 * 选择的供应商
 * @author Kw
 *
 * Date: 2015年7月31日
 */
public class SupplierMember {
	/**
	 * 物理主键
	 */
    private String uuid;
    /**
	 * 供应商基础信息
	 */
    private String suppId;
    /**
	 * 供应商情况选择表
	 */
    private String purcSupplier;
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

    public String getSuppId() {
        return suppId;
    }

    public void setSuppId(String suppId) {
        this.suppId = suppId == null ? null : suppId.trim();
    }

    public String getPurcSupplier() {
        return purcSupplier;
    }

    public void setPurcSupplier(String purcSupplier) {
        this.purcSupplier = purcSupplier == null ? null : purcSupplier.trim();
    }

    public Short getSortNo() {
        return sortNo;
    }

    public void setSortNo(Short sortNo) {
        this.sortNo = sortNo;
    }
}