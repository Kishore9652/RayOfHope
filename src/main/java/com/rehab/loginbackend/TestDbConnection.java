package com.rehab.loginbackend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;


@Component
public abstract class TestDbConnection implements CommandLineRunner {

	
	@Override
    public void run(String... args) throws Exception {
        // Use your public Railway MySQL values here
        String url = "jdbc:mysql://mysql.railway.internal:3306/railway";
        String username = "root";
        String password = "xHNKUwUVdEWuuItZFPQJDgeuEumEobyq";

        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            System.out.println("✅ DB Connection Successful!");
        } catch (Exception e) {
            System.out.println("❌ DB Connection Failed!");
            e.printStackTrace();
        }
    }
	
}
