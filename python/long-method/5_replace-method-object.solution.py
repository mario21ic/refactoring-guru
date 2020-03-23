# Replace Method with Method Object
# If none of the previous recipes help, try moving the entire method to a separate object via Replace Method with Method Object.
# Solution: Transform the method into a separate class so that the local variables become fields of the class. Then you can split the method into several methods within the same class.


class PriceCalculator:

  def __init__(self):
    self.primary_base_price = 10
    self.secondary_base_price = 20
    self.tertiary_base_price = 30

  def compute(self):
    return self.primary_base_price + self.secondary_base_price + self.tertiary_base_price


class Order:
    def price(self):
        return PriceCalculator().compute()

if __name__=="__main__":
  o = Order()
  print(o.price())