package com.example.demo.repos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Product;
import com.example.demo.ifaces.CrudRepositry;
@Repository
public class ProductRepositry implements CrudRepositry<Product> {

	
	private JdbcTemplate template;
	
	
	@Autowired
	public ProductRepositry(JdbcTemplate template) {
		super();
		this.template = template;
	}

	@Override
	public int add(Product t) {
		String sql=	"insert into sri_product values(?,?,?)";

		return template.update(sql,t.getProductId(),t.getProductName(),t.getPrice());
	}


	@Override
	public List<Product> findAll() {
String sql="select*from sri_product";
return template.query(sql,BeanPropertyRowMapper.newInstance(Product.class));
	}

	@Override
	public Product findById(int id) {
		String sql="SELECT * FROM sri_product where product_id=?";
	
		return  template.queryForObject(sql, BeanPropertyRowMapper.newInstance(Product.class),id);
	}

	@Override
	public int update(Product t) {
		String sql="UPDATE sri_product SET price =?  where product_id=?";
		return template.update(sql,
				t.getPrice(),t.getProductId());
				}

	@Override
	public int remove(int id) {
String sql="delete FROM sri_product where product_id=?";

return template.update(sql,id);
	
	}



}
