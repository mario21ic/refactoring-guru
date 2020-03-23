# Your methods contain a repeating group of parameters.


class Customer:

  def amount_invoice_in(self, start_date, end_date):
    print("amount_invoice_in: %s - %s" % (start_date, end_date))
    return

  def amount_receive_in(self, start_date, end_date):
    print("amount_receive_in: %s - %s" % (start_date, end_date))
    return

  def amount_overdue_in(self, start_date, end_date):
    print("amount_overdue_in: %s - %s" % (start_date, end_date))
    return


if __name__=="__main__":
  c = Customer()
  c.amount_invoice_in("2020/22/03", "2020/31/03")
  c.amount_receive_in("2020/22/03", "2020/31/03")
  c.amount_overdue_in("2020/22/03", "2020/31/03")
