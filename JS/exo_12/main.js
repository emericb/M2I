console.log("exo_12");

let init = prompt("Stating population");
let growth = prompt("Growth rate");
let target = prompt("Target population");

let years = 0;

while (init < target) {
    init = init * (1 + growth / 100);
    years++;
}
console.log("Years to reach target population: " + years + " population: " + Math.round(init));
