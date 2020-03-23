# You have a code fragment that can be grouped together.


class Printer:
  def __init__(self):
    self.name = "Mario"
    self.amount = 0

  def print_banner(self):
    print("### Banner ###")
    return

  def print_owing(self):
    self.print_banner()
    print("name: %s" % self.name)
    print("name: %s" % self.amount)


if __name__=="__main__":
  p = Printer()
  p.print_owing()
