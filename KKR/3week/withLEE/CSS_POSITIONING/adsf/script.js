const form = document.querySelector("form");
const input = document.querySelector("#userinput");
const ul = document.querySelector("ul");
const clearBtn = document.querySelector("btn");

const clickBtn = (e) => {
    e.preventDefault();
    const value = input.value;
    if(value.length === 0) return
    ul.innerHTML+=`<li>${value}</li>`
    input.value=""
}

form.addEventListener("submit", clickBtn);