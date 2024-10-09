console.log("exo_9");
console.log("Part 1");
let n = prompt("Enter a number");

for (let i = 1; i <= n; i++) {
    console.log("Table of " + i);
    for (let j = 1; j <= 10; j++) {
        console.log(i + " * " + j + " = " + i * j);
    }
    console.log("" +
        "");
}

console.log("Part 2");

let header = "   ";
for (let i = 1; i <= 10; i++) {
    header += i.toString().padStart(4, ' ');
}
console.log(header);
console.log("-".repeat(header.length));

for (let i = 1; i <= n; i++) {
    let row = i.toString().padStart(4, ' ');
    for (let j = 1; j <= 10; j++) {
        row += (i * j).toString().padStart(4, ' ');
    }
    console.log(row);
}
