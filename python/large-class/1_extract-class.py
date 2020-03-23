# When one class does the work of two, awkwardness results.


class Person:
    def __init__(self, name, office_area_code, office_number):
        self.name = name
        self.office_area_code = office_area_code
        self.office_number = office_number
    
    def telephone_number(self):
        return "%d-%d" % (self.office_area_code, self.office_number)

if __name__=="__main__":
    p = Person("Mario", 51, 966296636)
    print(p.name)
    print(p.telephone_number())