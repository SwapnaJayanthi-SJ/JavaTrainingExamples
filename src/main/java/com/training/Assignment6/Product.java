package com.training.Assignment6;

import java.io.Serializable;
import java.util.Objects;

public class Product implements Serializable
{
	public String name;
	public String description;
	public double price;
	public int quantity;

	static ProductCatalog productCatalog = new ProductCatalog();
	public Product(String name, String description, double price, int quantity)
	{
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) 
	{
        this.quantity = quantity;
    }
	
    public boolean equals(Object obj) 
    {
        if (this == obj) 
        	return true;
        if (obj == null || getClass() != obj.getClass()) 
        	return false;
        Product product = (Product) obj;
        return Objects.equals(name, product.name);
    }
    
	@Override
	public String toString() {
		return "Product [name=" + name + ", description=" + description + ", price=" + price + ", quantity=" + quantity+ "]";
	}

}
