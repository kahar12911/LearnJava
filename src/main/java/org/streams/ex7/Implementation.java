package org.streams.ex7;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Implementation {
    public Map<String, List<Product>> getProductName(List<Product> products){
        Map<String,List<Product>> p = products.stream().collect(Collectors.groupingBy(Product::getName));
        //System.out.println(p);
        return p;
    }

    public Map<String,Double> getSum(List<Product> products){
        return products.stream().collect(Collectors.groupingBy(Product::getName, Collectors.summingDouble(Product::getPrice)));

    }
}
