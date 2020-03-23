# Extract Subclass
# Extract Subclass helps if part of the behavior of the large class can be implemented in different ways or is used in rare cases.
# solution: Create a subclass and use it in these cases.


class LaborItem:
    def unit_price(self):
        pass
    def employee(self):
        pass

class JobItem:
    def total_price(self):
        pass

    def unit_price(self):
        pass

    def employee(self):
        pass

if __name__=="__main__":
    pass