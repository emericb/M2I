let temp = prompt("Enter the temperature in Celsius: ");

if (temp < 0) {
    console.log("SOLID");
} else if (temp <= 100) {
    console.log("LIQUID");
} else {
    console.log("GAS");
}
