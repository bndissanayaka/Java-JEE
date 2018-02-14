package com.wisdom.hibernate;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "po_header", schema = "public")
public class PoHeader implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private int poId;
	private String hdrRemark;
	private Date poDate;
	private Set<PoDetail> poDetails = new HashSet<PoDetail>(0);

	public PoHeader() {
	}

	@SequenceGenerator(name = "po_header_seq", sequenceName = "po_header_seq")
	@Id
	@GeneratedValue(generator = "po_header_seq")
	@Column(name = "po_id", unique = true, nullable = false)
	public int getPoId() {
		return this.poId;
	}

	public void setPoId(int poId) {
		this.poId = poId;
	}

	@Column(name = "hdr_remark", length = 150)
	public String getHdrRemark() {
		return this.hdrRemark;
	}

	public void setHdrRemark(String hdrRemark) {
		this.hdrRemark = hdrRemark;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "po_date", nullable = false, length = 13)
	public Date getPoDate() {
		return this.poDate;
	}

	public void setPoDate(Date poDate) {
		this.poDate = poDate;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "poHeader")
	public Set<PoDetail> getPoDetails() {
		return this.poDetails;
	}

	public void setPoDetails(Set<PoDetail> poDetails) {
		this.poDetails = poDetails;
	}
}
