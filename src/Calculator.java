public class Calculator
{
    Floor floor;
    Carpet carpet;

    public Calculator(Floor floor, Carpet carpet)
    {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost(){
        double totalCost;
        totalCost = floor.getArea() * carpet.getCost();
        return totalCost;
    }
}
