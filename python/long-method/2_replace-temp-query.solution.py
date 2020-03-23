# Replace Temp with Query
# If local variables and parameters interfere with extracting a method, use Replace Temp with Query, Introduce Parameter Object or Preserve Whole Object.
# Solution: Move the entire expression to a separate method and return the result from it. Query the method instead of using a variable. Incorporate the new method in other methods, if necessary.


class MyClass:
  def __init__(self):
    self.quantify = 11
    self.item_price = 10.2

  def base_price(self):
    return self.quantify * self.item_price

  def calc_price(self):
    base_price = self.base_price()
    if base_price > 1000:
      return base_price * 0.95
    else:
      return base_price * 0.98

if __name__=="__main__":
  c = MyClass()
  print(c.calc_price())
