package th.co.tac.kms.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import th.co.tac.kms.web.dao.model.KmsKioskRenterInfo;

@Repository("kmsKioskRenterInfoDao")
public class KmsKioskRenterInfoDao extends AbstractDao {
	private static final long serialVersionUID = -2539774719030629046L;

	public Integer create(KmsKioskRenterInfo kioskRenterInfo) { 
		String sql = "insert into kms_kiosk_renter_info (id_title,first_name,last_name,contact_number) values (?,?,?,?)";
		KeyHolder keyHolder = new GeneratedKeyHolder(); 		
		jdbcTemplate.update(new PreparedStatementCreator() {  
			public PreparedStatement createPreparedStatement(Connection connection)throws SQLException {  
				PreparedStatement ps = connection.prepareStatement(sql , new String[]{ "id_renter" });   
				ps.setInt(1,Integer.valueOf(kioskRenterInfo.getTitleId()));
				ps.setString(2,kioskRenterInfo.getFirstName());
				ps.setString(3,kioskRenterInfo.getLastName());
				ps.setString(4,kioskRenterInfo.getContactNumber());
				return ps;
				
				}
			}, 	keyHolder); 	
		Long returnid =  keyHolder.getKey().longValue();		
		log_info("ID=", returnid);
		return returnid.intValue();
		
	} 
	
	

}
