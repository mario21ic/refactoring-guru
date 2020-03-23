# Preserver Whole Object
# If local variables and parameters interfere with extracting a method, use Replace Temp with Query, Introduce Parameter Object or Preserve Whole Object.
# Solution: Instead, try passing the whole object.


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

  def whitin_range(self, temp_range):
    return "Start: % s - End: %s\nLow: %s - High: %s" % (temp_range.start_date, temp_range.end_date, temp_range.calc_low(), temp_range.calc_high())

  def speak(self, start_date, end_date):
    message = "Good morning, this is %s\n" % self.name
    whithin_plan = self.whitin_range(TempRange(start_date, end_date))
    return message + whithin_plan


if __name__=="__main__":
  r = Reporter("Mario")
  print(r.speak("2020/20/03", "2020/31/03"))
