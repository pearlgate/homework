const colorBox = document.querySelector(".colorBox");
const color1 = document.querySelector(".color1");
const color2 = document.querySelector(".color2");
const body = document.body;

const clickFunc = () => {
    const colorValue1 = color1.value;
    const colorValue2 = color2.value;
    changeColor(colorValue1, colorValue2);
}

const changeColor = (colorValue1, colorValue2) => {
    body.style.background=`linear-gradient(to right, ${colorValue1}, ${colorValue2})`
}

window.addEventListener("input", clickFunc);