using System;
using Microsoft.AspNetCore.Mvc;
using ApiCustomer.Repository;
using ApiCustomer.Models;
namespace ApiCustomer.Controllers
{
	[Route("/api/customer")]
	[ApiController]
	public class CustomerController:ControllerBase
	{
		private ICustomerRepository customerRepository;
		public CustomerController(ICustomerRepository customerRepository)
		{
			this.customerRepository = customerRepository;
        }

		[Route("/GetCustomers")]
		[HttpGet]
		public async Task<IEnumerable<Customer>> GetCustomers()
		{
			return await customerRepository.GetCustomers();
		}

        [Route("/GetCustomerById/{id}")]
        [HttpGet]
        public async Task<Customer> GetCustomerById(int id)
        {
            return await customerRepository.GetCustomerById(id);
        }

        [Route("/DeleteCustomer/{id}")]
        [HttpDelete]
        public async Task<bool> DeleteCustomer(int id)
        {
            return await customerRepository.DeleteCustomer(id);
        }

        [Route("/CreateCustomer")]
        [HttpPost]
        public async Task<Customer> CreateCustomer(Customer customer)
        {
            return await customerRepository.CreateCustomer(customer);
        }

        [Route("/UpdateCustomer")]
        [HttpPut]
        public async Task<Customer> UpdateCustomer(Customer customer)
        {
            return await customerRepository.UpdateCustomer(customer);
        }


    }


}

