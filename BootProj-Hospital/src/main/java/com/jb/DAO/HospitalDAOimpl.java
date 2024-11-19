package com.jb.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jb.model.Hospital;

@Repository("hospDAO")
public class HospitalDAOimpl implements IHospitalDAO {
	private static final String GET_HOSP_QUERY = "SELECT HID, HNAME, LOCATION, CONTACT, BEDCAPACITY, ESTABLISHED FROM HOSPITAL WHERE LOCATION IN(?,?,?) ORDER BY LOCATION";
	private static final String INSERT_HOSP_QUERY = "INSERT INTO HOSPITAL VALUES(hid_seq.NEXTVAL,?,?,?,?,?)";

	@Autowired
	private DataSource ds;

	@Override
	public List<Hospital> getHospital(String loc1, String loc2, String loc3) throws Exception {
		System.out.println(ds);
		List<Hospital> list = new ArrayList<Hospital>();
		try (Connection con = ds.getConnection(); PreparedStatement ps = con.prepareStatement(GET_HOSP_QUERY)) {
			ps.setString(1, loc1);
			ps.setString(2, loc2);
			ps.setString(3, loc3);
			try (ResultSet rs = ps.executeQuery();) {
				while (rs.next()) {
					Hospital hosp = new Hospital();
					hosp.setHId(rs.getInt(1));
					hosp.setHName(rs.getString(2));
					hosp.setLocation(rs.getString(3));
					hosp.setContact(rs.getString(4));
					hosp.setBedCapacity(rs.getInt(5));
					hosp.setEstablished(rs.getString(6));
					list.add(hosp);
				}
			}
		} catch (SQLException se) {
			throw se;
		} catch (Exception e) {
			throw e;
		}
		return list;
	}

	@Override
	public int insertHospital(Hospital hosp) throws Exception {
		int rowCount = 0;
		try (Connection con = ds.getConnection(); PreparedStatement ps = con.prepareStatement(INSERT_HOSP_QUERY)) {
			ps.setString(1, hosp.getHName());
			ps.setString(2, hosp.getLocation());
			ps.setString(3, hosp.getContact());
			ps.setInt(4, hosp.getBedCapacity());
			ps.setString(5, hosp.getEstablished());
			rowCount = ps.executeUpdate();
		} catch (SQLException se) {
			throw se;
		} catch (Exception e) {
			throw e;
		}
		return rowCount;
	}
}
