interface Contact {
    firstName: string;
    lastName: string;
    dob: string;
    email: string;
    phone: string;
}

let contacts: Contact[] = [];
let currentEditIndex: number | null = null;

document.getElementById('addContactForm')?.addEventListener('submit', (event) => {
    event.preventDefault();
    const newContact: Contact = {
        firstName: (document.getElementById('firstName') as HTMLInputElement).value,
        lastName: (document.getElementById('lastName') as HTMLInputElement).value,
        dob: (document.getElementById('dob') as HTMLInputElement).value,
        email: (document.getElementById('email') as HTMLInputElement).value,
        phone: (document.getElementById('phone') as HTMLInputElement).value,
    };

    if (currentEditIndex !== null) {
        contacts[currentEditIndex] = newContact;
        currentEditIndex = null;
    } else {
        contacts.push(newContact);
    }

    updateContactList();
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

function displayContactDetails(index: number) {
    const contact = contacts[index];
    const contactDetailsDiv = document.getElementById('contactDetails');
    const detailsContainer = document.querySelector('.col-md-8') as HTMLElement;
    if (contactDetailsDiv) {
        contactDetailsDiv.innerHTML = `
            <p><strong>First Name:</strong> ${contact.firstName}</p>
            <p><strong>Last Name:</strong> ${contact.lastName}</p>
            <p><strong>Date of Birth:</strong> ${contact.dob}</p>
            <p><strong>Email:</strong> ${contact.email}</p>
            <p><strong>Phone Number:</strong> ${contact.phone}</p>
        `;
        detailsContainer.hidden = false;
    }
    document.getElementById('editContactBtn')?.addEventListener('click', () => editContact(index));
    document.getElementById('deleteContactBtn')?.addEventListener('click', () => deleteContact(index));
}

function editContact(index: number) {
    const contact = contacts[index];
    (document.getElementById('firstName') as HTMLInputElement).value = contact.firstName;
    (document.getElementById('lastName') as HTMLInputElement).value = contact.lastName;
    (document.getElementById('dob') as HTMLInputElement).value = contact.dob;
    (document.getElementById('email') as HTMLInputElement).value = contact.email;
    (document.getElementById('phone') as HTMLInputElement).value = contact.phone;
    currentEditIndex = index;
    openModal();
}

function deleteContact(index: number) {
    contacts.splice(index, 1);
    updateContactList();
    document.getElementById('contactDetails')!.innerHTML = '';
    const detailsContainer = document.querySelector('.col-md-8') as HTMLElement;
    detailsContainer.hidden = true;
}

const modal = document.getElementById('addContactModal') as HTMLElement;
const btn = document.getElementById('addContactBtn') as HTMLElement;
const span = document.getElementsByClassName('close')[0] as HTMLElement;

btn.onclick = openModal;
span.onclick = closeModal;
window.onclick = (event) => { if (event.target == modal) closeModal(); };

function openModal() { modal.style.display = 'block'; }
function closeModal() { modal.style.display = 'none'; }
