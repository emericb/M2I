var _a;
let contacts = [];
let currentEditIndex = null;
(_a = document.getElementById('addContactForm')) === null || _a === void 0 ? void 0 : _a.addEventListener('submit', (event) => {
    event.preventDefault();
    const newContact = {
        firstName: document.getElementById('firstName').value,
        lastName: document.getElementById('lastName').value,
        dob: document.getElementById('dob').value,
        email: document.getElementById('email').value,
        phone: document.getElementById('phone').value,
    };
    if (currentEditIndex !== null) {
        contacts[currentEditIndex] = newContact;
        updateContactList();
        displayContactDetails(currentEditIndex); // Refresh displayed information
        currentEditIndex = null;
    }
    else {
        contacts.push(newContact);
        updateContactList();
    }
    closeModal();
});
function updateContactList() {
    const contactsDiv = document.getElementById('contacts');
    if (contactsDiv) {
        contactsDiv.innerHTML = '';
        contacts.forEach((contact, index) => {
            const button = document.createElement('button');
            button.className = 'list-group-item list-group-item-action';
            button.textContent = `${contact.firstName} ${contact.lastName}`;
            button.addEventListener('click', () => displayContactDetails(index));
            contactsDiv.appendChild(button);
        });
    }
}
function displayContactDetails(index) {
    var _a, _b;
    const contact = contacts[index];
    const contactDetailsDiv = document.getElementById('contactDetails');
    const detailsContainer = document.querySelector('.col-md-8');
    if (contactDetailsDiv) {
        contactDetailsDiv.innerHTML = `
            <p><strong>First Name:</strong> ${contact.firstName}</p>
            <p><strong>Last Name:</strong> ${contact.lastName}</p>
            <p><strong>Date of Birth:</strong> ${contact.dob}</p>
            <p><strong>Email:</strong> ${contact.email}</p>
            <p><strong>Phone Number:</strong> ${contact.phone}</p>
        `;
        detailsContainer.hidden = false; // Show the details div
    }
    (_a = document.getElementById('editContactBtn')) === null || _a === void 0 ? void 0 : _a.addEventListener('click', () => editContact(index));
    (_b = document.getElementById('deleteContactBtn')) === null || _b === void 0 ? void 0 : _b.addEventListener('click', () => deleteContact(index));
}
function editContact(index) {
    const contact = contacts[index];
    document.getElementById('firstName').value = contact.firstName;
    document.getElementById('lastName').value = contact.lastName;
    document.getElementById('dob').value = contact.dob;
    document.getElementById('email').value = contact.email;
    document.getElementById('phone').value = contact.phone;
    currentEditIndex = index;
    openModal();
}
function deleteContact(index) {
    contacts.splice(index, 1);
    updateContactList();
    document.getElementById('contactDetails').innerHTML = '';
    const detailsContainer = document.querySelector('.col-md-8');
    detailsContainer.hidden = true;
}
const modal = document.getElementById('addContactModal');
const btn = document.getElementById('addContactBtn');
const span = document.getElementsByClassName('close')[0];
btn.onclick = function () {
    openModal();
};
span.onclick = function () {
    closeModal();
};
window.onclick = function (event) {
    if (event.target == modal) {
        closeModal();
    }
};
function openModal() {
    modal.style.display = 'block';
}
function closeModal() {
    modal.style.display = 'none';
}
