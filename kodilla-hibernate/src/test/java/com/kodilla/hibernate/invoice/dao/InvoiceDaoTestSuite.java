package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product product = new Product("Butter");
        Product product2 = new Product("Milk");
        Product product3 = new Product("Onion");
        Item item = new Item(new BigDecimal(5),1,new BigDecimal(5));
        Item item2 = new Item(new BigDecimal(3.20),4,new BigDecimal(12.80));
        Item item3 = new Item(new BigDecimal(1.20),3,new BigDecimal(3.60));

        Invoice invoice = new Invoice("INV-0001");
        Invoice invoice2 = new Invoice("INV-0002");

        product.getItems().add(item);
        product2.getItems().add(item2);
        product3.getItems().add(item3);

        item.setProduct(product);
        item2.setProduct(product2);
        item3.setProduct(product3);
        item.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice2);

        invoice.getItems().add(item);
        invoice.getItems().add(item2);
        invoice2.getItems().add(item3);
        //When
        invoiceDao.save(invoice);
        invoiceDao.save(invoice2);
        int invoiceId = invoice.getId();
        int invoice2Id = invoice2.getId();
        //Then

        assertNotEquals(0, invoiceId);
        assertNotEquals(0, invoice2Id);

        try {
            invoiceDao.deleteById(invoiceId);
            invoiceDao.deleteById(invoice2Id);
        } catch (Exception e) {
        }
    }
}
