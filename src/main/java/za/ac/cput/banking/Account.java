package za.ac.cput.banking;

/**
 * Guy De La Cruz 
 * Student Number: 218336969
 */
public class Account 
{
    private String id, name, accountType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", name=" + name + ", accountType=" + accountType + '}';
    }
}
