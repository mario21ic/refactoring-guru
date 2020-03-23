# Extract Method
# Conditional operators and loops are a good clue that code can be moved to a separate method. For conditionals, use Decompose Conditional. If loops are in the way, try Extract Method.
# Solution: Move this code to a separate new method (or function) and replace the old code with a call to the method.


class User:
    def __init__(self, name, age):
        super().__init__()
        self.name = name
        self.age = age


class Printer:

    def __init__(self):
        super().__init__()
        self.users = [User("Mario", 34), User("Adrian", 54)]

    def properties(self, user):
        return "%s %s" % (user.name, user.age)

    def print_properties(self):
        for user in self.users:
            print(self.properties(user))

if __name__=="__main__":
    p = Printer()
    p.print_properties()
