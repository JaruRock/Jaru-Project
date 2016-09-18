package th.co.tac.kms.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import th.co.tac.kms.web.dao.model.KmsWalletInfo;

@Repository("kmsWalletInfoDao")
public class KmsWalletInfoDao extends AbstractDao {

	private static final long serialVersionUID = 5561146655863451807L;

	
	public Integer create(final KmsWalletInfo kmsWalletInfo) {
		String sql = "insert into kms_wallet_info (agent_id , pin_code) values (?, ?) ";
		KeyHolder keyHolder = new GeneratedKeyHolder(); 		
		jdbcTemplate.update(new PreparedStatementCreator() {  
			public PreparedStatement createPreparedStatement(Connection connection)throws SQLException {  
				PreparedStatement ps = connection.prepareStatement(sql , new String[]{ "wallet_id" });   
				ps.setString(1,kmsWalletInfo.getAgentId());
				ps.setString(2,kmsWalletInfo.getPinCode());
				return ps;
				}
			}, 	keyHolder); 	
		Long returnid =  keyHolder.getKey().longValue();		
		log_info("ID=", returnid);
		return returnid.intValue();
	}

	
}
