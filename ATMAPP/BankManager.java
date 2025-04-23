// BankManager.java
/**
 * Handles operations related to account lookup.
 */
public class BankManager {
    private Client[] clients;

    public BankManager() {
        clients = new Client[] {
            new Client("1001", "Savings", 1000.0, "1234"),
            new Client("1002", "Checking", 500.0, "5678"),
            new Client("1003", "Savings", 1500.0, "9012"),
            new Client("1004", "Checking", 200.0, "3456"),
            new Client("1005", "Savings", 3000.0, "7890"),
            new Client("1006", "Checking", 100.0, "2345"),
            new Client("1007", "Savings", 2500.0, "6789"),
            new Client("1008", "Checking", 800.0, "0123"),
            new Client("1009", "Savings", 1200.0, "4567"),
            new Client("1010", "Checking", 600.0, "8901")
        };
    }

    public Client findClient(String accountNumber) {
        for (Client client : clients) {
            if (client.getAccountNumber().equals(accountNumber)) {
                return client;
            }
        }
        return null;
    }
}
