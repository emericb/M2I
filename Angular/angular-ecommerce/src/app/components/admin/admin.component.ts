import { Component, OnInit } from '@angular/core';
import { LocalStorageService } from '../../services/local-storage.service';
import {FormsModule} from '@angular/forms';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  standalone: true,
  imports: [
    FormsModule
  ],
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {
  products: any[] = [];
  newProduct: any = {};

  constructor(private localStorageService: LocalStorageService) {}

  ngOnInit() {
    this.products = this.localStorageService.getProducts();
  }

  addProduct() {
    this.products.push({ ...this.newProduct });
    this.localStorageService.saveProducts(this.products);
    this.newProduct = {};
  }

  updateProduct(product: any) {
    const index = this.products.findIndex(p => p.id === product.id);
    if (index !== -1) {
      this.products[index] = product;
      this.localStorageService.saveProducts(this.products);
    }
  }

  deleteProduct(productId: number) {
    this.products = this.products.filter(p => p.id !== productId);
    this.localStorageService.saveProducts(this.products);
  }
}
