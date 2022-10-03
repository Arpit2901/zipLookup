package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.main.EmployeeBean;
import com.main.Product;

public class abc {

	public static void main(String[] args) {
		
		Product p1=new Product("red","small",9000);
		Product p2=new Product("red","big",6000);
		Product p3=new Product("green","small",9000);
		Product p4=new Product("blue","small",7000);
		List<Product> list1 = new ArrayList<Product>();
        list1.add(p1);
        list1.add(p2);
        list1.add(p3);
       List convert = list1.stream().filter(element -> element.getColor()=="red").filter(element -> element.getSize()=="small")
                .collect(Collectors.toList());
        System.out.println(convert);
		
//		EmployeeBean emp1 = new EmployeeBean("Ram","Banglore");
//        EmployeeBean emp2 = new EmployeeBean("jam","Pune");
//        EmployeeBean emp3 = new EmployeeBean("sam","Noida");
//        
//         List<EmployeeBean> list = new ArrayList<EmployeeBean>();
//         list.add(emp1);
//         list.add(emp2);
//         list.add(emp3);
         
//         Map<Object,Object> convert = list.stream()
//                 .collect(Collectors.toMap(p -> p.getName(), p -> p.getLocation()));
//         System.out.println(convert);
	}

}
