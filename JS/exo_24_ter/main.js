console.log("exo_24_ter");

function appendToOutput(text) {
    const output = document.getElementById('output');
    const p = document.createElement('p');
    p.textContent = text;
    output.appendChild(p);
}

class Vehicle {
    constructor(brand, model, mileage, year) {
        this.brand = brand;
        this.model = model;
        this.mileage = mileage;
        this.year = year;
    }

    display(type) {
        appendToOutput(`${type} : ${this.brand} ${this.model} a ${this.mileage} km et date de ${this.year}`);
    }
}

class Car extends Vehicle {
    constructor(brand, model, mileage, year, airConditioning) {
        super(brand, model, mileage, year);
        this.airConditioning = airConditioning;
    }

    display() {
        super.display("Car");
        appendToOutput(`Climatisation: ${this.airConditioning}`);
    }
}

class Moto extends Vehicle {
    constructor(brand, model, mileage, year) {
        super(brand, model, mileage, year);
    }

    display() {
        super.display("Moto");
    }
}

document.addEventListener("DOMContentLoaded", () => {
    const car1 = new Car('Bmw', 'Serie 1', 80000, 2010, true);
    car1.display();

    const moto1 = new Moto('Yamaha', 'MT-07', 20000, 2015);
    moto1.display();
});
