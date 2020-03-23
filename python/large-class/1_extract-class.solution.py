# Extract Class
# Extract Class helps if part of the behavior of the large class can be spun off into a separate component.
# Solution: Instead, create a new class and place the fields and methods responsible for the relevant functionality in it.


class TelephoneNumber:
    def __init__(self, office_area_code, office_number):
        self.office_area_code = office_area_code
        self.office_number = office_number

    def __str__(self):
        return "%d-%d" % (self.office_area_code, self.office_number)

class Person:
    def __init__(self, name, telephone_number):
        self.name = name
        self.telephone_number = telephone_number

    def get_telephone_number(self):
        return self.telephone_number.__str__()
        

if __name__=="__main__":
    p = Person("Mario", TelephoneNumber(51, 966296636))
    print(p.name)
    print(p.get_telephone_number())
    print(p.telephone_number)
