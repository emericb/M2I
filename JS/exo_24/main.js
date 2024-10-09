document.addEventListener("DOMContentLoaded", () => {
    console.log("exo_24");

    let n = parseInt(prompt("Enter the number of grades"), 10);
    let grades  = Array.from({ length: n }, () => Math.floor(Math.random() * 20));

    const getMaximum = grades => Math.max(...grades);
    const getMinimum = grades => Math.min(...grades);
    const getAverage = grades => grades.reduce((acc, grade) => acc + grade, 0) / grades.length;

    const displayGrades = grades => {
        document.body.innerHTML = `
            <h1>Grades</h1>
            <h3>Best grade, worst grade, average grade</h3>
            <p>Number of grades: ${grades.length}</p>
            <ul id="gradesList"></ul>
            <p style="color: green;">Best grade: ${getMaximum(grades)}</p>
            <p style="color: red;">Worst grade: ${getMinimum(grades)}</p>
            <p>Average grade: ${getAverage(grades).toFixed(2)}</p>
        `;

        let gradesList = document.querySelector("#gradesList");
        grades.forEach((grade, index) => {
            let listItem = document.createElement("li");
            listItem.innerHTML = `Grade ${index + 1}: <strong>${grade}/20</strong>`;
            gradesList.appendChild(listItem);
        });
    };

    displayGrades(grades);
});
