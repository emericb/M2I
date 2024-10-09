console.log("exo_18");

function isPalindrome(str) {
    str = str.toLowerCase();
    return str === str.split("").reverse().join("");
}

console.log(isPalindrome("kayak"));
console.log(isPalindrome("radar"));
console.log(isPalindrome("hello"));
console.log(isPalindrome("world"));
console.log(isPalindrome("hello world"));
console.log(isPalindrome("k a y a k"));
console.log(isPalindrome("race car"));
