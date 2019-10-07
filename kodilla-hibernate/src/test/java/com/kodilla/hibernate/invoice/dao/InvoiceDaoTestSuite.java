package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;

    @Test
    public void testInvoiceDaoSave(){
        //Given
        Invoice invoice = new Invoice("0002");

        Product milk = new Product("milk");
        Product oil = new Product("oil");
        Product bread = new Product("bread");

        Item itemMilk = new Item(new BigDecimal(125), 5, new BigDecimal(150));
        Item itemOil = new Item(new BigDecimal(100), 10, new BigDecimal(200));
        Item itemBread = new Item(new BigDecimal(45), 3, new BigDecimal(85));

        itemMilk.setProduct(milk);
        itemOil.setProduct(oil);
        itemBread.setProduct(bread);

        invoice.getItems().add(itemMilk);
        invoice.getItems().add(itemOil);
        invoice.getItems().add(itemBread);

        itemMilk.setInvoice(invoice);
        itemOil.setInvoice(invoice);
        itemBread.setInvoice(invoice);

        //When
        productDao.save(milk);
        productDao.save(oil);
        productDao.save(bread);

        invoiceDao.save(invoice);
        int id1 = invoice.getId();
        int id2 = milk.getId();
        int id3 = oil.getId();
        int id4 = bread.getId();

        //Then
        Assert.assertNotEquals(0, id1);
        Assert.assertNotEquals(0, id2);
        Assert.assertNotEquals(0, id3);
        Assert.assertNotEquals(0, id4);

        //CleanUp
        invoiceDao.deleteById(id1);
        productDao.deleteById(id2);
        productDao.deleteById(id3);
        productDao.deleteById(id4);
    }
}
