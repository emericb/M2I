console.log("exo_13");

let n = parseInt(prompt("Enter an integer : "));

let res = [];

for (let start = 1; start < n; start++) {
    let sum = 0;
    let sequence = [];

    for (let num = start; sum < n; num++) {
        sum += num;
        sequence.push(num);

        if (sum === n) {
            res.push(sequence.slice());
            break;
        }
    }
}

console.log(`Consecutive sum :`);
res.forEach(seq => {
    console.log(`${n} = ${seq.join('+')}`);
});
