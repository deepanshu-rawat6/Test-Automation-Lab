const users = [
    { username: 'ABC', password: 'pass1' },
    { username: 'DEF', password: 'pass2' },
    { username: 'HIJ', password: 'pass3' },
    { username: 'KLM', password: 'pass4' },
    { username: 'OPQ', password: 'pass5' },
];

function userExists(username) {
    return users.some(user => user.username === username);
}

function checkLogin() {
    const usernameInput = document.getElementById('username').value;
    const passwordInput = document.getElementById('password').value;
    const loginMessage = document.getElementById('loginMessage');

    if (userExists(usernameInput)) {
        const user =
            users.find(user => user.username === usernameInput);

        if (user.password === passwordInput) {
            loginMessage.innerText = 'Login successful';
            loginMessage.style.color = 'green';
        } else {
            loginMessage.innerText = 'Incorrect password';
            loginMessage.style.color = 'red';
        }
    } else {
        loginMessage.innerText = 'User does not exist';
        loginMessage.style.color = 'red';
    }
}