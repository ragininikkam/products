package com.devops.products.service;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.Collections;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.devops.products.modal.Products;
import org.junit.jupiter.api.extension.ExtendWith;
import com.devops.products.repository.ProductsRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.test.context.junit.jupiter.SpringExtension;

//@ExtendWith(SpringExtension.class)
@SpringBootTest
//@AutoConfigureMockMvc
public class ProductsServiceTest {
	
	
	

	/*
	@Mock
    private ProductsRepository prepo;

   @Autowired
    private ProductsService pservice = new ProductsService();

    private Products prods;
    
    @BeforeEach
	public void setUp() {
   
       prods = new Products(1L,"Iphone 12", "Apple","USA",999);
       prods = new Products(2L,"Iphone 13", "Apple","USA",999);
       prods = new Products(3L,"Iphone 10", "Apple","USA",299);
       
       Products prods = new Products(4L,"Nokia N72", "Nokia","China",100);
    }
    
    @AfterEach
	public void tearDown() {
		Products prods = null;
	}

    
    @Test
	@DisplayName("JUnit test for createProducts operation")
	public void givenProducts_whenCreateProducts_thenReturnProducts() {
    	
       
        when(prepo.save(any(Products.class))).thenReturn(prods);
        System.out.println("savedProds" + prods);

        Products savedProds = prepo.save(prods);
       
      //  assertThat(savedProds.getName()).isNotNull();
        assertThat(savedProds.getName()).isEqualTo("Iphone 10");
    }
    /*
    @Test
	@DisplayName("JUnit test for getAllProducts operation")
	public void givenProductsList_whenGetAllProducts_thenReturnProductsList() {
		// given - precondition or setup
		Products prods1 = new Products(1L,"Iphone 12", "Apple","USA",999);
		Products prods2 = new Products(2L,"Iphone 13", "Apple","USA",999);
		
		////when(prepo.save(any(Products.class))).thenReturn(prods);
        System.out.println("savedProds" + prods1);

       // Products savedProds = prepo.save(prods1, prods2);

		given(prepo.findAll()).willReturn(List.of(prods1, prods2));
		
		// when - action or the behaviour
		List<Products> products = pservice.listAll();
		// then - verify the output
		
		//List<Products> productList = (List<Products>) prepo.findAll();
	  //   assertEquals("Iphone 12", productList.get(1).getName());
		System.out.println(products.size());
		assertThat(products.size()).isNotNull();
		//assertThat(productList.size()).isEqualTo(2);
	}*/
	
	/*
    
    @Test
	@DisplayName("JUnit test for getAllEmployees operation")
	public void givenEmployeesList_whenGetAllEmployees_thenReturnEmployeesList() {
		// given - precondition or setup
	Products prod1 = new Products(1L,"Dhandapani","Sudhakar","dhandapani.sudhakar@dtechideas.com",99);
	Products prod2 = new Products(2L,"Kathirvel","Sudhakar","kathirvel.sudhakar@dtechideas.com",99);
    /*when(prepo.save(any(Products.class))).thenReturn(prods);
    	List<Products> productList = (List<Products>) prepo.findAll();
    	System.out.println(productList.size());
    	assertThat(productList.size()).isEqualTo(0); 
    	
    	 when(prepo.save(any(Products.class))).thenReturn(prods);
         System.out.println("savedProds" + prods);

         Products savedProds = prepo.save(prods);
         List<Products> productList = pservice.listAll();
        
         System.out.println(productList.size());
     	assertThat(productList.size()).isEqualTo(0);*/
   /*  	
     	given(prepo.findAll()).willReturn(List.of(prod1,prod2));
		// when - action or the behaviour
		List<Products> products = pservice.listAll();
		// then - verify the output
		assertThat(products).isNotNull();
		System.out.println(products.size());
		assertThat(products.size()).isGreaterThanOrEqualTo(1);

 
	}


    
    @Test
	@DisplayName("JUnit test for getAllProducts operation - Empty List (Negative Scenario)")
	public void givenEmptyProductsList_whenGetAllProducts_thenReturnEmptyProductsList() {
		// given - precondition or setup
		given(prepo.findAll()).willReturn(Collections.emptyList());
		// when - action or the behaviour
		List<Products> products = pservice.listAll();
		// then - verify the output
		assertThat(products).isEmpty();
		assertThat(products.size()).isEqualTo(0);
	}
    
    @Test
	@DisplayName("JUnit test for getEmployeeById operation")
	public void givenEmployeeId_whenFindEmployeeById_thenReturnEmployee() {
		// given - precondition or setup
		given(prepo.findById(prods.getId())).willReturn(Optional.of(prods));
		// when - action or the behaviour
		Products foundProducts = pservice.get(prods.getId());
		// then - verify the output
		assertThat(foundProducts).isNotNull();
		assertThat(foundProducts.getId()).isEqualTo(prods.getId());
	}
	/*
    
    @Test
    public void GivenGetAllProductShouldReturnListOfAllProducts(){
         Products product1 = new Products(1L,"ball","ball","ball",400);
         Products product2 = new Products(2L,"bat","bat","bat",500);
         prepo.save(product1);
         prepo.save(product2);
         List<Products> productList = (List<Products>) prepo.findAll();
       //  assertEquals("bat", productList.get(2).getName());
         System.out.println(productList.size());
         assertThat(productList.size()).isEqualTo(0);
    } */
	
    
	/*
	@Test
	@DisplayName("JUnit test for getEmployeeById operation - throw ResourceNotFoundException")
	public void givenEmployeeId_whenFindEmployeeById_thenThrowResourceNotFoundException() {
		// given - precondition or setup
		given(prepo.findById(anyLong())).willReturn(Optional.ofNullable(null));
		// when - action or the behaviour
		assertThrows(ResourceNotFoundException.class, () -> {
			pservice.get(prods.getId());
		});
	} 
	
	@Test
	@DisplayName("JUnit test for updateEmployee operation")
	public void givenEmployee_whenUpdateEmployee_thenReturnEmployeeUpdated() {
		// given - precondition or setup
		given(prepo.findById(prods.getId())).willReturn(Optional.of(prods));
		prods.setBrand("one plus");
		given(prepo.save(prods)).willReturn(prods);
		// when - action or the behaviour
		Products updatedProducts = pservice.updateProducts(prods.getId(),prods);
		// then - verify the output
		assertThat(updatedProducts).isNotNull();
		assertThat(updatedProducts.getBrand()).isEqualTo(prods.getBrand());
	}*/
	/*
	@Test
	@DisplayName("JUnit test for deleteEmployeeById operation")
	public void givenEmployeeId_whenDeleteEmployeeById_thenReturnTrue() {
		// given - precondition or setup
		given(prepo.findById(prods.getId())).willReturn(Optional.of(prods));
	 //given(prepo.deleteById(prods.getId());
		// when - action or the behaviour
		pservice.delete(prods.getId());
		// then - verify the output
		verify(prepo,times(1)).deleteById(prods.getId());
	}*/
	/*	
	@Test
	public void givenIdThenShouldReturnProductOfThatId() {
		Products products = new Products(5L,"iphone12 Pro", "Apple","USA",160);
		
		prepo.save(products);
	     Optional<Products> optional =  prepo.findById(products.getId());
	     System.out.println(products.getId());
	     System.out.println(products.getName());

	  //   assertEquals(products.getId());
	   //  assertEquals(products.getName(), products.getName());
	     assertThat(products.getName()).isNotNull();
	}
	
	@Test
	public void givenIdTODeleteThenShouldDeleteTheProducts() {
	      Products products = new Products(4L,"iphone10", "Apple","USA",160);
	      prepo.save(products);
	      System.out.println(products.getId());
	      prepo.deleteById(products.getId());
	     
	      Optional optional = prepo.findById(products.getId());
	      assertEquals(Optional.empty(), optional);
	}

	@Test
	public void GivenGetAllProductShouldReturnListOfAllProducts11(){
		Products product1 = new Products(6L,"iphone13", "Apple","USA",160);
	     Products product2 = new Products(7L,"iphone12 Pro Max", "Apple","USA",360);
	   
	     Products products = prepo.save(product1);
	    // prepo.save(product2);
	     List<Products> productList = (List<Products>) prepo.findAll();
	     System.out.println(productList.size());
	     assertThat(productList.size()).isEqualTo(1);
	    // assertEquals("iphone12 Pro Max", productList.get(1).getName());
	} 
	
	*/
/*	
	@Test
	public void givenProductToAddShouldReturnAddedProduct(){
		
		
		Products products3 = new Products(8L,"iphone11 Pro", "Apple","USA",360);
	     prepo.save(products3);
	   //  Products fetchedProduct = prepo.findById(products3.getId()).get();
	     
	     
	     System.out.println(products3.getId());
	     // prepo.deleteById(products.getId());
	     
	      Optional optional = prepo.findById(products3.getId());
	      assertEquals(Optional.empty(), optional);
	     
	}
	
*/
	

	 
}




