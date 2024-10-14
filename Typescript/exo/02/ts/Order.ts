import {OrderItem} from "./OrderItem";
import {Customer} from "./Customer";
import {OrderStatuts} from "./OrderStatuts";

export interface Order {
    id: number;
    customer: Customer;
    items: OrderItem[];
    status: OrderStatuts;
}
