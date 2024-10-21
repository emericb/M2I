import { Injectable } from '@angular/core';
import { Product } from '../models/product.model';

@Injectable({
  providedIn: 'root'
})
export class LocalStorageService {
  private storageKey = 'products';

  constructor() {
    const products = localStorage.getItem(this.storageKey);
    if (!products) {
      localStorage.setItem(this.storageKey, JSON.stringify([]));
    }
  }

  saveProducts(products: Product[]) {
    localStorage.setItem(this.storageKey, JSON.stringify(products));
  }

  getProducts(): Product[] {
    return JSON.parse(localStorage.getItem(this.storageKey) || '[]');
  }

}
