# Extract Method
# To reduce the length of a method body, use Extract Method.
# Solution: Move this code to a separate new method (or function) and replace the old code with a call to the method.


class Printer:
  def __init__(self):
    self.name = "Mario"
    self.amount = 0

  def print_banner(self):
    print("### Banner ###")
    return

  def print_details(self):
    print("name: %s" % self.name)
    print("name: %s" % self.amount)
    return

  def print_owing(self):
    self.print_banner()
    self.print_details()

if __name__=="__main__":
  p = Printer()
  p.print_owing()
