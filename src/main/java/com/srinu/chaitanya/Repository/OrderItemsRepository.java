package com.srinu.chaitanya.Repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.srinu.chaitanya.Model.OrderItems;
public interface OrderItemsRepository extends JpaRepository<OrderItems, Integer> {
public Float findByOrder(Long orderId);
		
@Query(name = "SELECT quantity*price qp FROM order_items JOIN books ON books.id=order_items.book_id WHERE order_id=?1", nativeQuery = true)
		
	public List<Integer> findByPrice(int order_id);
	
	}

	
	
	
	

