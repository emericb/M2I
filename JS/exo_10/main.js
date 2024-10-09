console.log("exo_10");

let n = prompt("Enter a number");

for (let i = 1; i <= n; i++) {
    let star = "";
    for (let j = 1; j <= n - i; j++) {
        star += " ";
    }
    for (let k = 1; k <= 2 * i - 1; k++) {
        star += "*";
    }
    console.log(star);
}
