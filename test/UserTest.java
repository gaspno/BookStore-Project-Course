import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bookstore.entity.Users;

public class UserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Users u1=new Users(null, "romerio@tmail.com", "Romerio Augusto Fernandes","mylifeiscrazy");
		Users u2=new Users(null,"rosana@tmail.com","Rosana Fernandes Gonzales", "fixthebugs");
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BookStoreWebsite");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();		
		entityManager.persist(u1);
		entityManager.persist(u2);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
		
		System.out.print("two users was persisted !?");
		
		
	}

}
