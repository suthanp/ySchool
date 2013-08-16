package org.yarlithub.yschool.model.obj.yschoolLite;

import com.felees.hbnpojogen.persistence.IPojoGenEntity;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.yarlithub.yschool.model.obj.yschoolLite.iface.IClassSubjectHasStaffHasRole;


/** 
 * Object mapping for hibernate-handled table: class_subject_has_staff_has_role.
 * @author autogenerated
 */

@Entity
@Table(name = "class_subject_has_staff_has_role", schema = "yschool_lite")
public class ClassSubjectHasStaffHasRole implements Cloneable, Serializable, IPojoGenEntity, IClassSubjectHasStaffHasRole {

	/** Serial Version UID. */
	private static final long serialVersionUID = -559009394L;

	

	/** Field mapping. */
	@Id 
	private ClassSubjectHasStaffHasRolePK id;

	/**
	 * Default constructor, mainly for hibernate use.
	 */
	public ClassSubjectHasStaffHasRole() {
		// Default constructor
	} 

	/** Constructor taking a given ID.
	 * @param id to set
	 */
	public ClassSubjectHasStaffHasRole(ClassSubjectHasStaffHasRolePK id) {
		this.id = id;
	}
	
 


 
	/** Return the type of this class. Useful for when dealing with proxies.
	* @return Defining class.
	*/
	@Transient
	public Class<?> getClassType() {
		return ClassSubjectHasStaffHasRole.class;
	}
 

    /**
     * Return the value associated with the column: id.
	 * @return A ClassSubjectHasStaffHasRolePK object (this.id)
	 */
	public ClassSubjectHasStaffHasRolePK getId() {
		return this.id;
		
	}
	

  
    /**  
     * Set the value related to the column: id.
	 * @param id the id value you wish to set
	 */
	public void setId(final ClassSubjectHasStaffHasRolePK id) {
		this.id = id;
	}


   /**
    * Deep copy.
	* @return cloned object
	* @throws CloneNotSupportedException on error
    */
    @Override
    public ClassSubjectHasStaffHasRole clone() throws CloneNotSupportedException {
		
        final ClassSubjectHasStaffHasRole copy = (ClassSubjectHasStaffHasRole)super.clone();

		copy.setId(this.getId());
		return copy;
	}
	


	/** Provides toString implementation.
	 * @see java.lang.Object#toString()
	 * @return String representation of this class.
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("id: " + this.getId());
		return sb.toString();		
	}


	/** Equals implementation. 
	 * @see java.lang.Object#equals(java.lang.Object)
	 * @param aThat Object to compare with
	 * @return true/false
	 */
	@Override
	public boolean equals(final Object aThat) {
		if ( this == aThat ) {
			 return true;
		}

		if ((aThat == null) || ( !(aThat.getClass().equals(this.getClass())))) {
			 return false;
		}
	
		final ClassSubjectHasStaffHasRole that = (ClassSubjectHasStaffHasRole) aThat;
		return this.getId().equals(that.getId());
	}
	
	/** Calculate the hashcode.
	 * @see java.lang.Object#hashCode()
	 * @return a calculated number
	 */
	@Override
	public int hashCode() {
		return getId().hashCode();
	}
	

	
}