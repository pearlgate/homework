'use strict';

let input1Color = document.getElementsByClassName("color1")[0];
let input2Color = document.getElementsByClassName("color2")[0];
let bg = document.getElementsByTagName("body")[0];

input1Color.addEventListener("input", setbg);
input2Color.addEventListener("input", setbg);

function setbg () {
    console.log(input1Color.value);
    bg.style.background =
    "linear-gradient(to right, "
    + input1Color.value
    + ", "
    + input2Color.value
    + ")";
}
