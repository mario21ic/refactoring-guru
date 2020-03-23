# Introduce Parameter Object
# If local variables and parameters interfere with extracting a method, use Replace Temp with Query, Introduce Parameter Object or Preserve Whole Object.
# Solution: Replace these parameters with an object.


class DateRange:
  def __init__(self, start_date, end_date):
    self.start_date = start_date
    self.end_date = end_date


class Customer:

  def amount_invoice_in(self, date_range):
    print("amount_invoice_in: %s - %s" % (date_range.start_date, date_range.end_date))
    return

  def amount_receive_in(self, date_range):
    print("amount_receive_in: %s - %s" % (date_range.start_date, date_range.end_date))
    return

  def amount_overdue_in(self, date_range):
    print("amount_overdue_in: %s - %s" % (date_range.start_date, date_range.end_date))
    return


if __name__=="__main__":
  date_range = DateRange("2020/22/03", "2020/31/03")
  c = Customer()
  c.amount_invoice_in(date_range)
  c.amount_receive_in(date_range)
  c.amount_overdue_in(date_range)
