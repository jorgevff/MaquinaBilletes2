/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author David J. Barnes and Michael KÃ¶lling
 * @version 2011.07.31
 */
public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;

    /**
     * Create a machine that issues tickets of the given price.
     */
    public TicketMachine(int cost)
    {
        price = cost;//int price = cost; no se puede
        balance = 0;
        total = 0;
    }
    
    

    /**
     * @Return The price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money from a customer.
     * Check that the amount is sensible.
     */
    public void insertMoney(int amount)
    {
        /** esta instrucion me indica que si la cantidad (amount) es mayor que 0
         * se suma al saldo(balance), se acumula, si no, al ser menor que 0 nos avisa que
         * necesita un valor positivo, esto sale en el mensaje impreso
         */
        if(amount > 0) {
            balance = balance + amount;
        }
        else {
            System.out.println("Use a positive amount rather than: " +
                               amount);
        }
    }

    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicket()
    {
        if(balance >= price) {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + price + " cents.");
            System.out.println("##################");
            System.out.println();

            // Update the total collected with the price.
            total = total + price;
            // Reduce the balance by the prince.
            balance = balance - price;
        }
        /** imprime un error diciendo que falta insertar la diferencia de dinero que falta para el precio
         * del billete
         */
        else {
            System.out.println("You must insert at least: " +
                               (price - balance) + " more cents.");
                    
        }
    }

    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance()
    {
        int amountToRefund;//variable local. 
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
    public int emptyMachine() 
    {
        int oldTotal; // ahí que crear una variable local para guardar lo que había
        oldTotal = total; // guarda el total de la maquina

    //El total de todas las monedas esta en el atributo total
        total = 0; // vacia la maquina de todas la monedas
        return oldTotal;// devuelve el total que había anteriormente al crear la variable local
}


  


        
    
}
