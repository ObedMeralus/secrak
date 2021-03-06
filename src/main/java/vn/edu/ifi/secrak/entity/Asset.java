package vn.edu.ifi.secrak.entity;

import javax.persistence.*;

@Entity
@Table(name="asset")
public class Asset {


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "asset_id")
	private Long assetId;
	
	@Column(name="asset_mark")
	private String mark;
	
	@Column(name="asset_idnumber")
	private String idNumber; 

	@Column(name = "asset_price")
    private float price ;

	@Column(name = "asset_currency")
    private String currency;

	@Column(name="asset_status")
	private byte assetStatus;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="shop_id")
	private Shop shop;

	public Asset(){

    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
	 * @return the assetId
	 */
	public Long getAssetId() {
		return assetId;
	}

	/**
	 * @param assetId the assetId to set
	 */
	public void setAssetId(Long assetId) {
		this.assetId = assetId;
	}

	/**
	 * @return the mark
	 */
	public String getMark() {
		return mark;
	}

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public Shop getShop() {
        return shop;
    }

    /**
	 * @param mark the mark to set
	 */
	public void setMark(String mark) {
		this.mark = mark;
	}

	/**
	 * @return the idNumber
	 */
	public String getIdNumber() {
		return idNumber;
	}

	/**
	 * @param idNumber the idNumber to set
	 */
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	/**
	 * @return the assetStatus
	 */
	public byte getAssetStatus() {
		return assetStatus;
	}

	/**
	 * @param assetStatus the assetStatus to set
	 */
	public void setAssetStatus(byte assetStatus) {
		this.assetStatus = assetStatus;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Asset [assetId=" + assetId + ", mark=" + mark + ", idNumber=" + idNumber + ", assetStatus="
				+ assetStatus + ", shopId="+shop.getShopId()+"]";
	}
	
}
