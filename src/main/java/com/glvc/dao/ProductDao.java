package com.glvc.dao;
	import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.glvc.bean.Product;
import com.glvc.dbutil.DbUtil;

	public class ProductDao {
		
		public int insert(Product product) throws ClassNotFoundException, SQLException {
			Connection con=DbUtil.dbConn();
			if(con!=null) {
				System.out.println("connection with dB is established ");
			}
			else {
				System.out.println("connection failed ");
			}
			String sql="insert into product values(?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,product.getPid());
			ps.setString(2, product.getPname());
			ps.setFloat(3, product.getCost());
			return ps.executeUpdate();
		}
		
		
		public List<Product> display() throws ClassNotFoundException, SQLException{
			Connection con=DbUtil.dbConn();
			if(con!=null) {
				System.out.println("connection with dB is established ");
			}
			else {
				System.out.println("connection failed ");
			}
			List<Product> list=new ArrayList<Product>();
			String sql="select * from product";
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Product product=new Product();
				product.setPid(rs.getInt(1));
				product.setPname(rs.getString(2));
				product.setCost(rs.getFloat(3));
				list.add(product);
			}
			return list;
		}
		
		public int edit(Product product) throws ClassNotFoundException, SQLException {
			Connection con=DbUtil.dbConn();
			if(con!=null) {
				System.out.println("connection with dB is established ");
			}
			else {
				System.out.println("connection failed ");
			}
			String sql="update product set pname=? where pid=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(2,product.getPid());
			ps.setString(1, product.getPname());
			return ps.executeUpdate();
		}
	public int delete(Product product) throws ClassNotFoundException, SQLException
	{
		Connection con=DbUtil.dbConn();
		if(con!=null) {
			System.out.println("connection with dB is established ");
		}
		else {
			System.out.println("connection failed ");
		}
		String sql="delete from Product where pid =?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1,product.getPid());
		
		return ps.executeUpdate();
		
		
	}
	}
	





