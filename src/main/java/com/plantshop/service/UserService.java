package com.plantshop.service;

import com.plantshop.domain.User;
import com.plantshop.domain.security.PasswordResetToken;

public interface UserService {
	PasswordResetToken getPasswordResetToken(final String token);
	
	void createPasswordResetTokenForUser(final User user, final String token);
}
