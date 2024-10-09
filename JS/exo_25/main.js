console.log("exo_25");

const dogs = [
    { name: "Buddy", race: "Golden Retriever", age: 3 },
    { name: "Max", race: "Bulldog", age: 5 },
    { name: "Bella", race: "Poodle", age: 2 }
];

document.addEventListener("DOMContentLoaded", () => {
    const dogSelect = document.getElementById("dog-select");
    const selectedOutput = document.getElementById("selectOutput");
    const btnSubmit = document.getElementById("btn-submit");

    const updateDogSelect = () => {
        dogSelect.innerHTML = '<option value="0">Sélectionnez un chien</option>';
        dogs.forEach((dog, index) => {
            dogSelect.appendChild(new Option(dog.name, index));
        });
    };

    updateDogSelect();

    dogSelect.addEventListener("change", () => {
        const selectedDog = dogs[dogSelect.value];
        selectedOutput.textContent = selectedDog ?
            `Selected Dog ID: ${dogs.indexOf(selectedDog)}` :
            'No dog selected';
    });

    btnSubmit.addEventListener("click", (event) => {
        event.preventDefault();
        const dogName = document.getElementById("dog-name").value;
        const dogBreed = document.getElementById("dog-breed").value;
        const dogAge = parseInt(document.getElementById("dog-age").value);

        if (dogName && dogBreed && dogAge) {
            dogs.push({ name: dogName, race: dogBreed, age: dogAge });
            updateDogSelect();
        }
    });
});
