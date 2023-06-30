using System;
using ApiCustomer.Models;
using Microsoft.EntityFrameworkCore;

namespace ApiCustomer.Repository
{
    public class CustomerSQLRepository : ICustomerRepository
    {
        private ApiCustomerContext dbContext;
        public CustomerSQLRepository(ApiCustomerContext dbContext)
        {
            this.dbContext = dbContext;
        }

        public async Task<Customer> CreateCustomer(Customer customer)
        {
            dbContext.Customers.Add(customer);
            await dbContext.SaveChangesAsync();
            return customer;
        }

        public async Task<bool> DeleteCustomer(int id)
        {
            var customer= await dbContext.Customers.FirstOrDefaultAsync(c => c.CustomerId == id);
            if (customer == null)
            {
                return false;
            }
            dbContext.Remove(customer);
            await dbContext.SaveChangesAsync();
            return true;
        }

        public async Task<Customer> GetCustomerById(int id)
        {
            var customer =  await dbContext.Customers.Where(c => c.CustomerId == id)
                .FirstOrDefaultAsync();
            return customer;
        }

        public async Task<IEnumerable<Customer>> GetCustomers()
        {
           return await dbContext.Customers.ToListAsync();
        }

        public async Task<Customer> UpdateCustomer(Customer customer)
        {
            dbContext.Customers.Update(customer);
            await dbContext.SaveChangesAsync();
            return customer;
        }
    }
}

