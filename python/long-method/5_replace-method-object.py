# You have a long method in which the local variables are so intertwined that you can't apply Extract Method.


class Order:
    def price(self):
        primary_base_price = 10
        secondary_base_price = 20
        tertiary_base_price = 30
        return primary_base_price + secondary_base_price + tertiary_base_price

if __name__=="__main__":
  o = Order()
  print(o.price())