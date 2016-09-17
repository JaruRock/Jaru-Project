package th.co.tac.kms.web.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import th.co.tac.kms.web.controller.model.UserInfo;
import th.co.tac.kms.web.dao.UserDao;
import th.co.tac.kms.web.dao.model.User;

@Service("userService")
@Transactional
public class UserService {

	@Autowired
	private UserDao userDao;
	
	@Autowired
    private PasswordEncoder passwordEncoder;
     
    public User findById(int id) {
        return null; //userDao.findById(id);
    }
    
	public UserInfo findByUsername(String username) {
		User user = null; //userDao.findByUsername(username);
		return fromUser(user);
	}
	
	public void saveUser(UserInfo userInfo) {
		User user = toNewUser(userInfo);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        //userDao.create(user);
    }
 
    public void updateUser(UserInfo userInfo) {
//        User entity = null; //userDao.findById(userInfo.getUserId());
//        if(entity != null){
//            entity.setUsername(userInfo.getUsername());
//            if(!userInfo.getPassword().equals(entity.getPassword())){
//                entity.setPassword(passwordEncoder.encode(userInfo.getPassword()));
//            }
//        }
    }
 
     
    public void deleteUserByUsername(String sso) {
        //userDao.deleteByUsername(sso);
    }
 
    public List<UserInfo> findAllUsers() {
    	List<UserInfo> userInfoList = new ArrayList<UserInfo>();
//    	List<User> userList = null; //userDao.findAllUsers();
//    	for (User user : userList) {
//    		userInfoList.add(fromUser(user));
//		}
    	
        return userInfoList;
    }
 
    public boolean isUsernameUnique(Integer id, String username) {
    	UserInfo user = findByUsername(username);
        return ( user == null || ((id != null) && (user.getUserId() == id)));
    }
	
    private User toNewUser(UserInfo userInfo) {
    	User user = new User();
		user.setUserId(userInfo.getUserId());
		user.setPassword(userInfo.getPassword());
		user.setUsername(userInfo.getUsername());
		return user;
    }
    
    private UserInfo fromUser(User user) {
    	if ( user == null ) {
    		return null;
    	}
    	
    	UserInfo userInfo = new UserInfo();
		userInfo.setUserId(user.getUserId());
		userInfo.setPassword(user.getPassword());
		userInfo.setUsername(user.getUsername());
		return userInfo;
    }
}
