package com.example.spring_aop_jdbc_demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.spring_aop_jdbc_demo.model.Product;


@Repository
public class ProductDaoImpl implements ProductDao {
	private JdbcTemplate jdbcTemplate;

    public ProductDaoImpl(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void addProduct(Product product) {
        String sql = "INSERT INTO products (name) VALUES (?)";
        jdbcTemplate.update(sql, product.getName());
    }

    @Override
    public List<Product> getAllProducts() {
        String sql = "SELECT * FROM products";
        return jdbcTemplate.query(sql, new RowMapper<Product>() {
            public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
                Product p = new Product();
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                return p;
            }
        });
    }
}
