
function showError(elementId, message, show) {
    const errorElement = document.getElementById(elementId);
    if (errorElement) {
        errorElement.textContent = message;
        errorElement.style.display = show ? 'block' : 'none';
    }
}

// project
function validateProjectForm(event) {
    event.preventDefault();
    let isValid = true;

    document.querySelectorAll('.error').forEach(error => error.style.display = 'none');

    // Validation name
    const name = document.getElementById('name').value.trim();
    if (!name) {
        showError('nameError', 'Project name is required!!', true);
        isValid = false;
    }

    // Validation description
    const description = document.getElementById('description').value.trim();
    if (!description) {
        showError('descriptionError', 'Description is required!!', true);
        isValid = false;
    }

    // Validation start date
    const startDate = document.getElementById('start_date').value;
    if (!startDate) {
        showError('startDateError', 'Start date is required!!', true);
        isValid = false;
    }

    // Validation end date
    const endDate = document.getElementById('end_date').value;
    if (endDate && startDate && new Date(endDate) <= new Date(startDate)) {
        showError('endDateError', 'End date must be after start date!!', true);
        isValid = false;
    }

    // Validation budget
    const budget = document.getElementById('budget').value;
    if (!budget || budget <= 0) {
        showError('budgetError', 'Budget must be a positive number!!!', true);
        isValid = false;
    }

    if (isValid) {
        document.querySelector('form').submit();
    }
    return isValid;
}

// Taches
function validateTaskForm(event) {
    event.preventDefault();
    let isValid = true;

    // Reset error messages
    document.querySelectorAll('.error').forEach(error => error.style.display = 'none');

    // Validation project_id
    const projectId = document.getElementById('project_id').value;
    if (!projectId || projectId === '') {
        showError('projectIdError', 'Please select a project!!!', true);
        isValid = false;
    }

    // Validation description
    const description = document.getElementById('description').value.trim();
    if (!description) {
        showError('descriptionError', 'Description is required!!!', true);
        isValid = false;
    }

    // Validation start date
    const startDate = document.getElementById('start_date').value;
    if (!startDate) {
        showError('startDateError', 'Start date is required!!', true);
        isValid = false;
    }

    // Validation end date
    const endDate = document.getElementById('end_date').value;
    if (endDate && startDate && new Date(endDate) <= new Date(startDate)) {
        showError('endDateError', 'End date must be after start date!', true);
        isValid = false;
    }

    // Validation status
    const status = document.getElementById('status').value;
    if (!status || status === '') {
        showError('statusError', 'Please select a status!!', true);
        isValid = false;
    }

    if (isValid) {
        document.querySelector('form').submit();
    }
    return isValid;
}


//Ressource

function validateResourceForm(event) {
    event.preventDefault();
    let isValid = true;

    // Reset error messages
    document.querySelectorAll('.error').forEach(error => error.style.display = 'none');

    // Validation name
    const name = document.getElementById('name').value.trim();
    if (!name) {
        showError('nameError', 'Resource name is required!', true);
        isValid = false;
    }

    // Validattion type
    const type = document.getElementById('type').value.trim();
    if (!type) {
        showError('typeError', 'Resource type is required!!', true);
        isValid = false;
    }

    // Validation quantity
    const quantity = document.getElementById('quantity').value;
    if (!quantity || quantity <= 0) {
        showError('quantityError', 'Quantity must be a positive number!!', true);
        isValid = false;
    }

    if (isValid) {
        document.querySelector('form').submit();
    }
    return isValid;
}

// Menu toggle
document.addEventListener('DOMContentLoaded', function() {
    document.getElementById('menu-toggle').addEventListener('click', function() {
        const menu = document.getElementById('menu');
        menu.classList.toggle('hidden');
        menu.classList.toggle('active');
    });
});