package org.yarlithub.yschool.model.dao.yschool.impl;

import com.felees.hbnpojogen.persistence.impl.GenericHibernateDaoImpl;
import org.yarlithub.yschool.model.obj.yschool.Role;
import org.springframework.stereotype.Repository;
import org.yarlithub.yschool.model.dao.yschool.RoleDao;
 
 
/**
 * DAO for table: Role.
 * @author autogenerated
 */
@Repository
public class RoleDaoImpl extends GenericHibernateDaoImpl<Role, Integer> implements RoleDao {
	
	/** Constructor method. */
		public RoleDaoImpl() {
			super(Role.class);
		}
	}
