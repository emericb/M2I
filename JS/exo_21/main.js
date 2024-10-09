console.log("exo_21");

let arrLength = prompt("Enter the length of the array: ");
let randomArr = Array.from({ length: arrLength - 1}, () => Math.floor(Math.random() * 50));

function isEven(num) {
    return num % 2 === 0;
}

randomArr.forEach((element, index) => {
    console.log(`number ${element} is ${isEven(element) ? "pair" : "impair"}`);
});
