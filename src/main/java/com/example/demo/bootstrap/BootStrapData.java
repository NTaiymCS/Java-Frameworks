package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        if (partRepository.count() == 0) {

            InhousePart part1 = new InhousePart();
            part1.setName("Gaming CPU");
            part1.setPrice(250.00);
            part1.setInv(10);
            part1.setMinInv(5);
            part1.setMaxInv(20);
            part1.setPartId(101);

            InhousePart part2 = new InhousePart();
            part2.setName("Gaming GPU");
            part2.setPrice(500.00);
            part2.setInv(8);
            part2.setMinInv(4);
            part2.setMaxInv(15);
            part2.setPartId(102);

            InhousePart part3 = new InhousePart();
            part3.setName("16GB RAM");
            part3.setPrice(80.00);
            part3.setInv(15);
            part3.setMinInv(5);
            part3.setMaxInv(25);
            part3.setPartId(103);

            OutsourcedPart part4 = new OutsourcedPart();
            part4.setName("1TB SSD");
            part4.setPrice(100.00);
            part4.setInv(12);
            part4.setMinInv(5);
            part4.setMaxInv(20);
            part4.setCompanyName("GameForge PC");

            OutsourcedPart part5 = new OutsourcedPart();
            part5.setName("Power Supply");
            part5.setPrice(90.00);
            part5.setInv(10);
            part5.setMinInv(4);
            part5.setMaxInv(15);
            part5.setCompanyName("GameForge PC");

            partRepository.save(part1);
            partRepository.save(part2);
            partRepository.save(part3);
            partRepository.save(part4);
            partRepository.save(part5);
        }

        if (productRepository.count() == 0) {

            Product product1 = new Product("Starter Gaming PC", 900.00, 5);
            Product product2 = new Product("Performance Gaming PC", 1200.00, 4);
            Product product3 = new Product("Pro Gaming PC", 1600.00, 3);
            Product product4 = new Product("Budget Gaming PC", 700.00, 6);
            Product product5 = new Product("Ultimate Gaming PC", 2000.00, 2);

            productRepository.save(product1);
            productRepository.save(product2);
            productRepository.save(product3);
            productRepository.save(product4);
            productRepository.save(product5);
        }

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products" + productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts" + partRepository.count());
        System.out.println(partRepository.findAll());
    }
}
