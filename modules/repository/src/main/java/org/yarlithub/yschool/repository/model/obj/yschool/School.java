package org.yarlithub.yschool.repository.model.obj.yschool;

import com.felees.hbnpojogen.persistence.IPojoGenEntity;
import java.io.Serializable;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.hibernate.proxy.HibernateProxy;
import org.yarlithub.yschool.repository.model.obj.yschool.SchoolHasStaffHasRole;
import org.yarlithub.yschool.repository.model.obj.yschool.iface.ISchool;


/** 
 * Object mapping for hibernate-handled table: school.
 * @author autogenerated
 */

@Entity
@Table(name = "school", schema = "yschool")
public class School implements Cloneable, Serializable, IPojoGenEntity, ISchool {

	/** Serial Version UID. */
	private static final long serialVersionUID = -558977421L;

	/** Use a WeakHashMap so entries will be garbage collected once all entities 
		referring to a saved hash are garbage collected themselves. */
	private static final Map<Serializable, Integer> SAVED_HASHES =
		Collections.synchronizedMap(new WeakHashMap<Serializable, Integer>());
	
	/** hashCode temporary storage. */
	private volatile Integer hashCode;
	

	/** Field mapping. */
	private String address;
	/** Field mapping. */
	private String appKey;
	/** Field mapping. */
	private String district;
	/** Field mapping. */
	private Integer id = 0; // init for hibernate bug workaround
	/** Field mapping. */
	private Date modifiedTime;
	/** Field mapping. */
	private String name;
	/** Field mapping. */
	private String province;
	/** Field mapping. */
	private Set<SchoolHasStaffHasRole> schoolHasStaffHasRoles = new HashSet<SchoolHasStaffHasRole>();

	/** Field mapping. */
	private Integer schoolNo;
	/** Field mapping. */
	private String zone;
	/**
	 * Default constructor, mainly for hibernate use.
	 */
	public School() {
		// Default constructor
	} 

	/** Constructor taking a given ID.
	 * @param id to set
	 */
	public School(Integer id) {
		this.id = id;
	}
	
	/** Constructor taking a given ID.
	 * @param id Integer object;
	 * @param modifiedTime Date object;
	 * @param name String object;
	 */
	public School(Integer id, Date modifiedTime, String name) {

		this.id = id;
		this.modifiedTime = modifiedTime;
		this.name = name;
	}
	
 


 
	/** Return the type of this class. Useful for when dealing with proxies.
	* @return Defining class.
	*/
	@Transient
	public Class<?> getClassType() {
		return School.class;
	}
 

    /**
     * Return the value associated with the column: address.
	 * @return A String object (this.address)
	 */
	@Basic( optional = true )
	@Column( length = 45  )
	public String getAddress() {
		return this.address;
		
	}
	

  
    /**  
     * Set the value related to the column: address.
	 * @param address the address value you wish to set
	 */
	public void setAddress(final String address) {
		this.address = address;
	}

    /**
     * Return the value associated with the column: appKey.
	 * @return A String object (this.appKey)
	 */
	@Basic( optional = true )
	@Column( name = "app_key", length = 45  )
	public String getAppKey() {
		return this.appKey;
		
	}
	

  
    /**  
     * Set the value related to the column: appKey.
	 * @param appKey the appKey value you wish to set
	 */
	public void setAppKey(final String appKey) {
		this.appKey = appKey;
	}

    /**
     * Return the value associated with the column: district.
	 * @return A String object (this.district)
	 */
	@Basic( optional = true )
	@Column( length = 45  )
	public String getDistrict() {
		return this.district;
		
	}
	

  
    /**  
     * Set the value related to the column: district.
	 * @param district the district value you wish to set
	 */
	public void setDistrict(final String district) {
		this.district = district;
	}

    /**
     * Return the value associated with the column: id.
	 * @return A Integer object (this.id)
	 */
    @Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Basic( optional = false )
	@Column( name = "idschool", nullable = false  )
	public Integer getId() {
		return this.id;
		
	}
	

  
    /**  
     * Set the value related to the column: id.
	 * @param id the id value you wish to set
	 */
	public void setId(final Integer id) {
		// If we've just been persisted and hashCode has been
		// returned then make sure other entities with this
		// ID return the already returned hash code
		if ( (this.id == null || this.id == 0) &&
				(id != null) &&
				(this.hashCode != null) ) {
		SAVED_HASHES.put( id, this.hashCode );
		}
		this.id = id;
	}

    /**
     * Return the value associated with the column: modifiedTime.
	 * @return A Date object (this.modifiedTime)
	 */
	@Basic( optional = false )
	@Column( name = "modified_time", nullable = false  )
	public Date getModifiedTime() {
		return this.modifiedTime;
		
	}
	

  
    /**  
     * Set the value related to the column: modifiedTime.
	 * @param modifiedTime the modifiedTime value you wish to set
	 */
	public void setModifiedTime(final Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

    /**
     * Return the value associated with the column: name.
	 * @return A String object (this.name)
	 */
	@Basic( optional = false )
	@Column( nullable = false, length = 45  )
	public String getName() {
		return this.name;
		
	}
	

  
    /**  
     * Set the value related to the column: name.
	 * @param name the name value you wish to set
	 */
	public void setName(final String name) {
		this.name = name;
	}

    /**
     * Return the value associated with the column: province.
	 * @return A String object (this.province)
	 */
	@Basic( optional = true )
	@Column( length = 45  )
	public String getProvince() {
		return this.province;
		
	}
	

  
    /**  
     * Set the value related to the column: province.
	 * @param province the province value you wish to set
	 */
	public void setProvince(final String province) {
		this.province = province;
	}

    /**
     * Return the value associated with the column: schoolHasStaffHasRole.
	 * @return A Set&lt;SchoolHasStaffHasRole&gt; object (this.schoolHasStaffHasRole)
	 */
 	@OneToMany( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "id.schoolIdschool"  )
 	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@Column( nullable = false  )
	public Set<SchoolHasStaffHasRole> getSchoolHasStaffHasRoles() {
		return this.schoolHasStaffHasRoles;
		
	}
	
	/**
	 * Adds a bi-directional link of type SchoolHasStaffHasRole to the schoolHasStaffHasRoles set.
	 * @param schoolHasStaffHasRole item to add
	 */
	public void addSchoolHasStaffHasRole(SchoolHasStaffHasRole schoolHasStaffHasRole) {
		schoolHasStaffHasRole.getId().setSchoolIdschool(this);
		this.schoolHasStaffHasRoles.add(schoolHasStaffHasRole);
	}

  
    /**  
     * Set the value related to the column: schoolHasStaffHasRole.
	 * @param schoolHasStaffHasRole the schoolHasStaffHasRole value you wish to set
	 */
	public void setSchoolHasStaffHasRoles(final Set<SchoolHasStaffHasRole> schoolHasStaffHasRole) {
		this.schoolHasStaffHasRoles = schoolHasStaffHasRole;
	}

    /**
     * Return the value associated with the column: schoolNo.
	 * @return A Integer object (this.schoolNo)
	 */
	@Basic( optional = true )
	@Column( name = "school_no"  )
	public Integer getSchoolNo() {
		return this.schoolNo;
		
	}
	

  
    /**  
     * Set the value related to the column: schoolNo.
	 * @param schoolNo the schoolNo value you wish to set
	 */
	public void setSchoolNo(final Integer schoolNo) {
		this.schoolNo = schoolNo;
	}

    /**
     * Return the value associated with the column: zone.
	 * @return A String object (this.zone)
	 */
	@Basic( optional = true )
	@Column( length = 45  )
	public String getZone() {
		return this.zone;
		
	}
	

  
    /**  
     * Set the value related to the column: zone.
	 * @param zone the zone value you wish to set
	 */
	public void setZone(final String zone) {
		this.zone = zone;
	}


   /**
    * Deep copy.
	* @return cloned object
	* @throws CloneNotSupportedException on error
    */
    @Override
    public School clone() throws CloneNotSupportedException {
		
        final School copy = (School)super.clone();

		copy.setAddress(this.getAddress());
		copy.setAppKey(this.getAppKey());
		copy.setDistrict(this.getDistrict());
		copy.setId(this.getId());
		copy.setModifiedTime(this.getModifiedTime());
		copy.setName(this.getName());
		copy.setProvince(this.getProvince());
		if (this.getSchoolHasStaffHasRoles() != null) {
			copy.getSchoolHasStaffHasRoles().addAll(this.getSchoolHasStaffHasRoles());
		}
		copy.setSchoolNo(this.getSchoolNo());
		copy.setZone(this.getZone());
		return copy;
	}
	


	/** Provides toString implementation.
	 * @see java.lang.Object#toString()
	 * @return String representation of this class.
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("address: " + this.getAddress() + ", ");
		sb.append("appKey: " + this.getAppKey() + ", ");
		sb.append("district: " + this.getDistrict() + ", ");
		sb.append("id: " + this.getId() + ", ");
		sb.append("modifiedTime: " + this.getModifiedTime() + ", ");
		sb.append("name: " + this.getName() + ", ");
		sb.append("province: " + this.getProvince() + ", ");
		sb.append("schoolNo: " + this.getSchoolNo() + ", ");
		sb.append("zone: " + this.getZone());
		return sb.toString();		
	}


	/** Equals implementation. 
	 * @see java.lang.Object#equals(java.lang.Object)
	 * @param aThat Object to compare with
	 * @return true/false
	 */
	@Override
	public boolean equals(final Object aThat) {
		Object proxyThat = aThat;
		
		if ( this == aThat ) {
			 return true;
		}

		
		if (aThat instanceof HibernateProxy) {
 			// narrow down the proxy to the class we are dealing with.
 			try {
				proxyThat = ((HibernateProxy) aThat).getHibernateLazyInitializer().getImplementation(); 
			} catch (org.hibernate.ObjectNotFoundException e) {
				return false;
		   	}
		}
		if (aThat == null)  {
			 return false;
		}
		
		final School that; 
		try {
			that = (School) proxyThat;
			if ( !(that.getClassType().equals(this.getClassType()))){
				return false;
			}
		} catch (org.hibernate.ObjectNotFoundException e) {
				return false;
		} catch (ClassCastException e) {
				return false;
		}
		
		
		boolean result = true;
		result = result && (((this.getId() == null) && ( that.getId() == null)) || (this.getId() != null  && this.getId().equals(that.getId())));
		result = result && (((getAddress() == null) && (that.getAddress() == null)) || (getAddress() != null && getAddress().equals(that.getAddress())));
		result = result && (((getAppKey() == null) && (that.getAppKey() == null)) || (getAppKey() != null && getAppKey().equals(that.getAppKey())));
		result = result && (((getDistrict() == null) && (that.getDistrict() == null)) || (getDistrict() != null && getDistrict().equals(that.getDistrict())));
		result = result && (((getModifiedTime() == null) && (that.getModifiedTime() == null)) || (getModifiedTime() != null && getModifiedTime().equals(that.getModifiedTime())));
		result = result && (((getName() == null) && (that.getName() == null)) || (getName() != null && getName().equals(that.getName())));
		result = result && (((getProvince() == null) && (that.getProvince() == null)) || (getProvince() != null && getProvince().equals(that.getProvince())));
		result = result && (((getSchoolNo() == null) && (that.getSchoolNo() == null)) || (getSchoolNo() != null && getSchoolNo().equals(that.getSchoolNo())));
		result = result && (((getZone() == null) && (that.getZone() == null)) || (getZone() != null && getZone().equals(that.getZone())));
		return result;
	}
	
	/** Calculate the hashcode.
	 * @see java.lang.Object#hashCode()
	 * @return a calculated number
	 */
	@Override
	public int hashCode() {
		if ( this.hashCode == null ) {
			synchronized ( this ) {
				if ( this.hashCode == null ) {
					Integer newHashCode = null;

					if ( getId() != null ) {
					newHashCode = SAVED_HASHES.get( getId() );
					}
					
					if ( newHashCode == null ) {
						if ( getId() != null && getId() != 0) {
							newHashCode = getId();
						} else {

						}
					}
					
					this.hashCode = newHashCode;
				}
			}
		}
	return this.hashCode;
	}
	

	
}
