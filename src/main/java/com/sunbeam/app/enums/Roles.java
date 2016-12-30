package com.sunbeam.app.enums;


public enum Roles {
	ADMIN("admin"),
	STUDENT("student"),
	LIBRARIAN("librarian");
	
	private String selectedRole;

	Roles(final String role) {
	        this.selectedRole = role;
	}
	
	public String getSelectedRole() {
		return selectedRole;
	}
	
	public static Roles parse(final String value) {
        for (Roles s: values()) {
            if (s.getSelectedRole().equalsIgnoreCase(value)) {
                return s;
            }
        }
        return STUDENT;
    }
	
	
}

