# You have a code fragment that can be grouped together.


class User:
    def __init__(self, name, age):
        super().__init__()
        self.name = name
        self.age = age


class Printer:

    def __init__(self):
        super().__init__()
        self.users = [User("Mario", 34), User("Adrian", 54)]

    def print_properties(self):
        for x in range(len(self.users)):
            result = ""
            result += self.users[x].name
            result += " "
            result += str(self.users[x].age)
            print(result)

if __name__=="__main__":
    p = Printer()
    p.print_properties()
