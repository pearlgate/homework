let btn = document.getElementById("enter");
let userInput = document.getElementById("userinput");

let ul = document.getElementsByTagName("ul")[0];


btn.addEventListener('click', function() {
    if(inputValue()) {
        ulLi();
    }
});

userInput.addEventListener('keypress', function(event) {
    if(inputValue()&& event.keyCode===13) {
        ulLi();
    }
});

function inputValue() {
    if(userInput.value.length > 0) return true;
}

function ulLi () {
    let saveValue = userInput.value;
    console.log(saveValue);
    let li = document.createElement("li");
    ul.appendChild(li);
    li.innerHTML=saveValue;
}