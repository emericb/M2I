console.log("exo_19");

function countLetter(str, letter) {
    let count = 0;
    for (let i = 0; i < str.length; i++) {
        if (str[i] === letter)
            count++;
    }
    return count;
}

console.log(countLetter("hello", "l"));
console.log(countLetter("hello", "o"));
console.log(countLetter("abba", "a"));
console.log(countLetter("mixer", "a"));
