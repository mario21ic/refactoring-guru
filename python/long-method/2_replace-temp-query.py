# You place the result of an expression in a local variable for later use in your code.


class MyClass:
  def __init__(self):
    self.quantify = 11
    self.item_price = 10.2

  def calc_price(self):
    base_price = self.quantify * self.item_price
    if base_price > 1000:
      return base_price * 0.95
    else:
      return base_price * 0.98

if __name__=="__main__":
  c = MyClass()
  print(c.calc_price())
