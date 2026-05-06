import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class OrderProcessorTest {

    @Test
    void testPrintOrderSummaryForMember() {
        Customer customer = new Customer("Alice", true);
        List<Item> items = List.of(new Item("Book", 10.0, 2));
        Order order = new Order(customer, items);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        new OrderProcessor().printOrderSummary(order);
        System.setOut(System.out);

        String output = out.toString();
        assertTrue(output.contains("Alice"));
        assertTrue(output.contains("Total Price: $18.00")); // 20 * 0.9 = 18
    }

    @Test
    void testPrintOrderSummaryForNonMember() {
        Customer customer = new Customer("Bob", false);
        List<Item> items = List.of(new Item("Pen", 5.0, 4));
        Order order = new Order(customer, items);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        new OrderProcessor().printOrderSummary(order);
        System.setOut(System.out);

        String output = out.toString();
        assertTrue(output.contains("Bob"));
        assertTrue(output.contains("Total Price: $20.00")); // no discount
    }
}