package com.example.demo.security;

import java.util.Set;
import com.google.common.collect.Sets;
import static com.example.demo.security.ApplicationUserPermission.*;

public enum ApplicationUserRole {
	STUDENT(Sets.newHashSet()),
	ADMIN(Sets.newHashSet(COURSE_READ, COURSE_WRITE,	STUDENT_READ, STUDENT_WRITE)),
	ADMINTRAINEE(Sets.newHashSet(COURSE_READ, STUDENT_READ));
	
	
	private final Set<ApplicationUserPermission> permissions;

	public Set<ApplicationUserPermission> getPermissions() {
		return permissions;
	}

	private ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
		this.permissions = permissions;
	}


}
