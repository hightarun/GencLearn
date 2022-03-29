import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FruitBasketUtility {

  private List<FruitBasket> fruitBasketList = new ArrayList<FruitBasket>();

  public List<FruitBasket> getFruitBasketList() {
    return fruitBasketList;
  }

  public void setFruitBasketList(List<FruitBasket> fruitBasketList) {
    this.fruitBasketList = fruitBasketList;
  }

  public void addToBasket(FruitBasket fbObj) {
    // Fill your code here
    fruitBasketList.add(fbObj);
  }

  public int calculateBill(Stream<FruitBasket> fruitBasketStream) {
    // Fill your code here
    int totalBill = 0;
    List<Integer> priceList = fruitBasketStream
      .map(basket -> basket.getWeightInKgs() * basket.getPricePerKg())
      .collect(Collectors.toList());

    for (int price : priceList) {
      totalBill += price;
    }
    return totalBill;
  }
}
