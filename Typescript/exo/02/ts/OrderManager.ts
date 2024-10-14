import {Order} from "./Order";
import {OrderStatuts} from "./OrderStatuts";

export class OrderManager {
    private orders: Order[] = [];

    addOrder(order: Order): void {
        this.orders.push(order);
    }

    getOrderById(id: number): Order {
        return this.orders.find(order => order.id === id);
    }

    updateOrderStatus(id: number, status: OrderStatuts): void {
        const order = this.getOrderById(id);
        if (order) {
            order.status = status;
        }
    }

    listOrderByStatus(status: OrderStatuts): Order[] {
        return this.orders.filter(order => order.status === status);
    }

    removeOrder(id: number): void {
        this.orders = this.orders.filter(order => order.id !== id);
    }
}
