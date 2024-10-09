let r;
let h;

r = prompt("Enter the radius");
h = prompt("Enter the height");

console.log(`The volume of a cone with radius ${r} and height ${h} is: ` + (Math.PI * Math.pow(r, 2) * h / 3));
