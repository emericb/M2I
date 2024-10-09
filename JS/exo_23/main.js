console.log("exo_23");

let etudiants = [
    {
        prenom: "José",
        nom: "Garcia",
        matieres: {
            francais: 16,
            anglais: 7,
            humour: 14
        }
    },
    {
        prenom: "Antoine",
        nom: "De Caunes",
        matieres: {
            francais: 15,
            anglais: 6,
            humour: 16,
            informatique: 4,
            sport: 10
        }
    }
];

function gradeAverage(etudiant) {
    let grades = Object.values(etudiant.matieres);
    let sum = grades.reduce((acc, grade) => acc + grade, 0);
    return sum / grades.length;
}

function displayEtudiants() {
    etudiants.forEach(etudiant => {
        console.log("######## START Student ######## :");
        console.log(`Student : ${etudiant.prenom} ${etudiant.nom}`);
        Object.entries(etudiant.matieres).forEach(([matiere, grade]) => {
            console.log(`- ${matiere} : ${grade}`);
        });
        let average = gradeAverage(etudiant);
        console.log(`Average : ${average}`);
        console.log(`Average : ${average.toFixed(2)}`);
        console.log("######## END Student ######## :");
    });
}

displayEtudiants();
