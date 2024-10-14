import { OrderStatuts } from "./OrderStatuts.js";
export function createOrder(customer, items, status) {
    return {
        id: Math.floor(Math.random() * 1000),
        customer: customer,
        items: items,
        status: status = OrderStatuts.Pending,
    };
}
export function calculateTotal(order) {
    return order.items.reduce((total, item) => total + item.product.price * item.quantity, 0);
}
