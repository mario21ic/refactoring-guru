# You have a complex conditional (if-then/else or switch).

import datetime
SUMMER_START = datetime.date(2020, 1, 11)
SUMMER_END = datetime.date(2020, 4, 30)

class MyClass:
    def __init__(self):
        super().__init__()
        self.winter_rate = 10
        self.summer_rate = 12
        self.winter_service_charge = 5

    def compute(self, date, quantify):
        charge = 0
        if date >= SUMMER_START and date <= SUMMER_END:
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
