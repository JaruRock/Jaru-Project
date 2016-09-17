package th.co.tac.kms.web.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import th.co.tac.kms.web.dao.UserDao;
import th.co.tac.kms.web.dao.model.User;

@Service("customUserDetailsService")
public class CustomUserDetailsService extends AbstractService implements UserDetailsService {

	@Autowired
	private UserDao userDao;

	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = null; //userDao.findByUsername(username);
		 log_info("User : {}", user);
		if (user == null) {
			log_info("User not found");
			throw new UsernameNotFoundException("Username not found");
		}
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), true, true,
				true, true, getGrantedAuthorities(user));
	}

	private List<GrantedAuthority> getGrantedAuthorities(User user) {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
//		for (Role role : user.getRoleSet()) {
//			logger.info("Role User : {}", role.getRoleName());
//			for (Permission perm : role.getPermSet()) {
//				logger.info("Permission Name=" + perm.getPermName() + ", Detal={}", perm.getPermDetl());
//				//authorities.add(new SimpleGrantedAuthority("ROLE_" + perm.getPermCode()));
//				@SuppressWarnings("unchecked")
//				List<String> permDetlList = new Gson().fromJson(perm.getPermDetl(), List.class);
//				for (String permDetl : permDetlList) {
//					authorities.add(new SimpleGrantedAuthority("ROLE_" + permDetl));
//				}
//			}
//		}
		log_info("authorities : {}", authorities);
		return authorities;
	}

}
