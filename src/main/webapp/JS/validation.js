function showError(elementId, message, show) {
    const errorElement = document.getElementById(elementId);
    if (errorElement) {
        errorElement.textContent = message;
        errorElement.style.display = show ? 'block' : 'none';
    }
}

document.addEventListener('DOMContentLoaded', validateProjectForm);


// Validate Project Form
function validateProjectForm(event) {
    event.preventDefault();
    let isValid = true;

    // Clear previous errors
    document.querySelectorAll('.error').forEach(error => error.style.display = 'none');

    const form = event.target; // Get the current form

    // Validation name
    const name = form.querySelector('#name').value.trim();
    if (!name) {
        showError('nameError', 'Project name is required!', true);
        isValid = false;
    }

    // Validation description
    const description = form.querySelector('#description').value.trim();
    if (!description) {
        showError('descriptionError', 'Description is required!', true);
        isValid = false;
    }

    // Validation start date
    const startDate = form.querySelector('#start_date').value;
    if (!startDate) {
        showError('startDateError', 'Start date is required!', true);
        isValid = false;
    }

    // Validation end date
    const endDate = form.querySelector('#end_date').value;
    if (endDate && startDate && new Date(endDate) <= new Date(startDate)) {
        showError('endDateError', 'End date must be after start date!', true);
        isValid = false;
    }

    // Validation budget
    const budget = form.querySelector('#budget').value.trim();
    if (!budget || isNaN(budget) || budget <= 0) {
        showError('budgetError', 'Budget must be a positive number!', true);
        isValid = false;
    }
}

// Validate Task Form
function validateTaskForm(event) {
    event.preventDefault();
    let isValid = true;

    // Reset error messages
    document.querySelectorAll('.error').forEach(error => error.style.display = 'none');

    const form = event.target;

    // Validation project_id
    const projectId = form.querySelector('#project_id').value;
    if (!projectId || projectId === '') {
        showError('projectIdError', 'Please select a project!', true);
        isValid = false;
    }

    // Validation description
    const description = form.querySelector('#description').value.trim();
    if (!description) {
        showError('descriptionError', 'Description is required!', true);
        isValid = false;
    }

    // Validation start date
    const startDate = form.querySelector('#start_date').value;
    if (!startDate) {
        showError('startDateError', 'Start date is required!', true);
        isValid = false;
    }

    // Validation end date
    const endDate = form.querySelector('#end_date').value;
    if (endDate && startDate && new Date(endDate) <= new Date(startDate)) {
        showError('endDateError', 'End date must be after start date!', true);
        isValid = false;
    }

    // Validation status
    const status = form.querySelector('#status').value;
    if (!status || status === '') {
        showError('statusError', 'Please select a status!', true);
        isValid = false;
    }

    if (isValid) {
        form.submit();
    }
}

// Validate Resource Form
function validateResourceForm(event) {
    event.preventDefault();
    let isValid = true;

    // Reset error messages
    document.querySelectorAll('.error').forEach(error => error.style.display = 'none');

    const form = event.target;

    // Validation name
    const name = form.querySelector('#name').value.trim();
    if (!name) {
        showError('nameError', 'Resource name is required!', true);
        isValid = false;
    }

    // Validation type
    const type = form.querySelector('#type').value.trim();
    if (!type) {
        showError('typeError', 'Resource type is required!', true);
        isValid = false;
    }

    // Validation quantity
    const quantity = form.querySelector('#quantity').value;
    if (!quantity || quantity <= 0) {
        showError('quantityError', 'Quantity must be a positive number!', true);
        isValid = false;
    }

    if (isValid) {
        form.submit();
    }
}

// Menu Toggle
document.addEventListener('DOMContentLoaded', function() {
    document.getElementById('menu-toggle').addEventListener('click', function() {
        const menu = document.getElementById('menu');
        menu.classList.toggle('hidden');
        menu.classList.toggle('active');
    });

    // Attach validation functions to forms
    document.querySelector('form[action="ProjectServlet"]').addEventListener('submit', validateProjectForm);
    document.querySelector('form[action="TaskServlet"]').addEventListener('submit', validateTaskForm);
    document.querySelector('form[action="ResourceServlet"]').addEventListener('submit', validateResourceForm);
});
