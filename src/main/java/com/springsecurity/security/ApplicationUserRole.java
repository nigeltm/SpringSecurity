package com.springsecurity.security;

import com.google.common.collect.Sets;
import static com.springsecurity.security.ApplicationUserPermission.*;

import java.util.Set;

public enum ApplicationUserRole {
    STUDENT(Sets.newHashSet()), //EMPTY PERMISSIONS
    ADMIN(Sets.newHashSet(COURSE_READ, COURSE_WRITE, STUDENT_READ, STUDENT_WRITE)); //FOUR PERMISSIONS

    private final Set<ApplicationUserPermission> permissions;

    ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
        this.permissions = permissions;
    }

    public Set<ApplicationUserPermission> getPermissions() {
        return permissions;
    }
}
