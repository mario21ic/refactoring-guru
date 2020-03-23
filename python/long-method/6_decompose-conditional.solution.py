# Decompose Conditional
# Conditional operators and loops are a good clue that code can be moved to a separate method. For conditionals, use Decompose Conditional. If loops are in the way, try Extract Method.
# Solution: Decompose the complicated parts of the conditional into separate methods: the condition, then and else.


import datetime
SUMMER_START = datetime.date(2020, 1, 11)
SUMMER_END = datetime.date(2020, 4, 30)

class MyClass:
    def __init__(self):
        super().__init__()
        self.winter_rate = 10
        self.summer_rate = 12
        self.winter_service_charge = 5
    
    def is_summer(self, date):
        if date >= SUMMER_START and date <= SUMMER_END:
            return True
        return False

    def compute(self, date, quantify):
        charge = 0
        if self.is_summer(date):
            charge = quantify * self.summer_rate
        else:
            charge = quantify * (self.winter_rate + self.winter_service_charge)
        return charge

if __name__ == "__main__":
    c = MyClass()
    today = datetime.date.today()
    print(c.compute(today, 33))

    winter_day = datetime.date(2020, 5, 14)
    print(c.compute(winter_day, 33))
