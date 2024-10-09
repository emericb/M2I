console.log("exo_22");

function selectMode() {
    console.log("1: no restriction\n2: error on negative number");
    return prompt("Select the mode :");
}

function gradeAmount() {
    return prompt("Enter the number of grades :");
}

function gradeInput(mode, gradeAmount) {
    let grades = [];
    for (let i = 0; i < gradeAmount; i++) {
        let grade = prompt(`Enter the grade ${i + 1} :`);
        if (mode == 2 && grade < 0) {
            console.log("Error: negative number");
            return;
        }
        grades.push(grade);
    }
    return grades;
}

function maxGrade(grades) {
    console.log("Max grade :", Math.max(...grades));
}

function minGrade(grades) {
    console.log("Min grade :", Math.min(...grades));
}

function averageGrade(grades) {
    let sum = grades.reduce((acc, grade) => acc + parseInt(grade), 0);
    console.log("Average grade :", sum / grades.length);
}

function main() {
    let mode = selectMode();
    let gradeAmountValue = gradeAmount();
    let grades = gradeInput(mode, gradeAmountValue);
    if (grades) {
        maxGrade(grades);
        minGrade(grades);
        averageGrade(grades);
    }
}

main();
