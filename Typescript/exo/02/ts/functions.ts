import {Customer} from "./Customer.js";
import {OrderItem} from "./OrderItem.js";
import {OrderStatuts} from "./OrderStatuts.js";
import {Order} from "./Order.js";

export function createOrder(customer: Customer, items: OrderItem[], status: OrderStatuts): Order {
    return {
        id: Math.floor(Math.random() * 1000),
        customer: customer,
        items: items,
        status: status = OrderStatuts.Pending,
    };
}

export function calculateTotal(order: Order): number {
    return order.items.reduce((total, item) => total + item.product.price * item.quantity, 0);
}
