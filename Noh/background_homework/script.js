'use strict'
const input1 = document.querySelector('.color1');
const input2 = document.querySelector('.color2');
const body = document.querySelector('body');

function changeColor(){
    let color1 = input1.value;
    let color2 = input2.value;
    body.style.background=`linear-gradient(to right, ${color1}, ${color2})`;
        

}

input1.addEventListener("input",changeColor);
input2.addEventListener("input",changeColor);