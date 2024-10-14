import { OrderManager } from './OrderManager.js';
import { OrderStatuts } from './OrderStatuts.js';
import { Customer } from './Customer.js';
import { OrderItem } from './OrderItem.js';
import { Product } from './Product.js';
import { createOrder, calculateTotal } from './functions.js';

console.log('Create some sample products');
const product1: Product = { id: 1, name: 'Product 1', price: 100, stock: 10 };
const product2: Product = { id: 2, name: 'Product 2', price: 200, stock: 5 };

console.log('Create a sample customer');
const customer: Customer = { id: 1, name: 'John Doe', email: 'john.doe@example.com' };

console.log('Create some sample order items');
const orderItem1: OrderItem = { product: product1, quantity: 2 };
const orderItem2: OrderItem = { product: product2, quantity: 1 };

console.log('Create orders');
const order1 = createOrder(customer, [orderItem1], OrderStatuts.Pending);
const order2 = createOrder(customer, [orderItem2], OrderStatuts.Pending);

console.log('Instantiate OrderManager');
const orderManager = new OrderManager();

console.log('Add orders');
orderManager.addOrder(order1);
orderManager.addOrder(order2);

console.log('Test getOrderById');
console.log(orderManager.getOrderById(order1.id)); // Should print order1 details

console.log('Test updateOrderStatus');
orderManager.updateOrderStatus(order1.id, OrderStatuts.Shipped);
console.log(orderManager.getOrderById(order1.id).status); // Should print 'Shipped'

console.log('Test listOrdersByStatus');
console.log(orderManager.listOrderByStatus(OrderStatuts.Pending)); // Should print orders with status 'Pending'

console.log('Test calculateTotal');
console.log(calculateTotal(order1)); // Should print the total amount of order1

console.log('Test removeOrder');
orderManager.removeOrder(order1.id);
console.log(orderManager.getOrderById(order1.id)); // Should print undefined
