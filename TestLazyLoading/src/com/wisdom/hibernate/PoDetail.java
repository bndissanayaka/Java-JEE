package com.wisdom.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "po_detail", schema = "public")
public class PoDetail implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private int poDetId;
	private PoHeader poHeader;
	private short quantity;
	private String detRemark;

	public PoDetail() {
	}

	@SequenceGenerator(name = "po_detail_seq", sequenceName = "po_detail_seq")
	@Id
	@GeneratedValue(generator = "po_detail_seq")
	@Column(name = "po_det_id", unique = true, nullable = false)
	public int getPoDetId() {
		return this.poDetId;
	}

	public void setPoDetId(int poDetId) {
		this.poDetId = poDetId;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "po_id")
	public PoHeader getPoHeader() {
		return this.poHeader;
	}

	public void setPoHeader(PoHeader poHeader) {
		this.poHeader = poHeader;
	}

	@Column(name = "quantity", nullable = false)
	public short getQuantity() {
		return this.quantity;
	}

	public void setQuantity(short quantity) {
		this.quantity = quantity;
	}

	@Column(name = "det_remark", length = 150)
	public String getDetRemark() {
		return this.detRemark;
	}

	public void setDetRemark(String detRemark) {
		this.detRemark = detRemark;
	}
}
