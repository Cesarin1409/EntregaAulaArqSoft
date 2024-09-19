function viewDetails(courseName) {
    document.getElementById('course-list').style.display = 'none';
    document.getElementById('course-details').style.display = 'block';
    document.getElementById('course-name').innerText = courseName;
}

function registerCourse(courseName) {
    document.getElementById('course-list').style.display = 'none';
    document.getElementById('registration').style.display = 'block';
}

function goBack() {
    document.getElementById('course-list').style.display = 'block';
    document.getElementById('registration').style.display = 'none';
    document.getElementById('course-details').style.display = 'none';
    document.getElementById('profile').style.display = 'none';
}
