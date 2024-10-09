let age = prompt("Enter your age");
let salary = prompt("Enter your salary");
let experience = prompt("Enter your years of experience");

if (age < 30) {
    console.log("Required age is 30 years old.");
} else if (salary > 40000) {
    console.log("The maximum salary is 40,000.");
} else if (experience < 5) {
    console.log("The minimum experience required is 5 years.");
} else {
    console.log("Profile accepted.");
}
