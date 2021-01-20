const mainDate = document.querySelector('.main_date');
const date = mainDate.querySelector('h2');

const curruntTime = new Date();

console.log(curruntTime);

const setCurruntTime = function() {
    const year = curruntTime.getFullYear();
    const month = curruntTime.getMonth();
    const day = curruntTime.getDate();

    date.innerText = `${year}.${month+1 <10 ? `0${month+1}` : `${month+1}`}.${day < 10 ? `0${day}` : `${day}`}`;
}


const init = function () {
    setCurruntTime();
}
init();