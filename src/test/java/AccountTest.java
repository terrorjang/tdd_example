import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    private Account account;

    @BeforeEach
    private void setup() {
        account = new Account(10000);
    }

    @Test
    public void testAccount() {
        setup();
        assertThat(account).isNotNull();
    }

    @Test
    public void testGetBalance() {
        assertThat(account.getBalance()).isEqualTo(10000);

        account = new Account(1000);
        assertThat(account.getBalance()).isEqualTo(1000);

        account = new Account(0);
        assertThat(account.getBalance()).isEqualTo(0);
    }

    @Test
    public void testDeposit() {
        account.deposit(1000);

        assertThat(account.getBalance()).isEqualTo(9000);
    }
    @Test
    public void testWithdraw() {
        account.withdraw(1000);

        assertThat(account.getBalance()).isEqualTo(11000);
    }
}
