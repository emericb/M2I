document.addEventListener("DOMContentLoaded", () => {
    console.log("exo_24_bis");

    class Voiture {
        constructor(marque, modele, vitesse) {
            this.brand = marque;
            this.model = modele;
            this.speed = vitesse;
        }

        speedUp() {
            this.speed += 10;
        }

        turn() {
            this.speed -= 5;
        }

        display() {
            console.log(`${this.brand} ${this.model} roule à ${this.speed} km/h`);
        }
    }

    const car1 = new Voiture('Bmw', 'Serie 1', 80);
    const car2 = new Voiture('Mercedes', 'GLB', 100);

    car1.speedUp();
    car1.display();
    car1.speedUp();
    car1.display();
    car1.speedUp();
    car1.display();

    car2.speedUp();
    car2.display();
    car2.speedUp();
    car2.display();
    car2.turn();
    car2.display();
    car2.turn();
    car2.display();
});
