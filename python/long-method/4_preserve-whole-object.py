# You get several values from an object and then pass them as parameters to a method.


import random

class TempRange:
  def __init__(self, start_date, end_date):
    self.start_date = start_date
    self.end_date = end_date

  def calc_low(self):
    return random.randrange(1, 5)

  def calc_high(self):
    return random.randrange(6, 10)


class Reporter:
  def __init__(self, name):
    self.name = name

  def whitin_range(self, start_date, end_date, low, high):
    return "Start: % s - End: %s\nLow: %s - High: %s" % (start_date, end_date, low, high)

  def speak(self, start_date, end_date):
    message = "Good morning, this is %s\n" % self.name
    temp_range = TempRange(start_date, end_date)
    low = temp_range.calc_low()
    high = temp_range.calc_high()
    whithin_plan = self.whitin_range(start_date, end_date, low, high)
    return message + whithin_plan


if __name__=="__main__":
  r = Reporter("Mario")
  print(r.speak("2020/20/03", "2020/31/03"))
