# Extract Subclass
# Extract Subclass helps if part of the behavior of the large class can be implemented in different ways or is used in rare cases.
# solution: Create a subclass and use it in these cases.


class Employee:
    def rate(self):
        pass

    def has_special_skill(self):
        pass

    def name(self):
        pass

    def department(self):
        pass

if __name__=="__main__":
    pass