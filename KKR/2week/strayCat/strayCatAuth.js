
const authBox = document.querySelector('.auth_box')
const hiddenBox =  document.querySelectorAll('.hidden_box')


const toggleFunc =  function() {

    hiddenBox[0].classList.toggle('hidden');
    hiddenBox[1].classList.toggle('hidden');
    
}

authBox.addEventListener('click', toggleFunc);


/////////////////////////////////////////////////////////

const homePath = "file:///C:/Users/Ryun_sinzinet/Documents/Practice/2week/strayCat/strayCat.html";
const joinPath = "file:///C:/Users/Ryun_sinzinet/Documents/Practice/2week/strayCat/strayCat.html#join" ;


const joinBtn = document.querySelector('.joinBtn');
const joinBox = document.querySelector('.join_form');
const main = document.querySelector('.main');

const changeToJoinPage =  function() {
    console.log('activatied');
    joinBox.classList.remove('joinOn');
    
    main.classList.add('mainOn');
}

const changeToHomePage = function() {
    joinBox.classList.add('joinOn');
    
    main.classList.remove('mainOn');

}



window.addEventListener('hashchange', function(e) {
    console.log(e.newURL);

    // loadText(e.newURL);
    
    if (e.newURL === joinPath) {
        changeToJoinPage();
    } else if (e.newURL === homePath){
        console.log('home!!')
        changeToHomePage();
    }



})







//////////////////////////////////


// const loadText = function(file) {   
    

//     var thatText = file.indexOf('strayCat.');
//     var thatText = thatText + 8
//     var thatText = file.slice(thatText);
    


//     if ( file === joinPath) {
//         console.log("Find Fath!!");
//         file = file.replace(thatText, "_join.txt")
//     }
    
// const rawFile = new XMLHttpRequest();
// rawFile.open("get", file, false);
// rawFile.onreadystatechange = function () {
    
//     if(rawFile.readyState === 4) {
//         if(rawFile.status === 200 || rawFile.status == 0) {
//             var allText = rawFile.responseText;
//             console.log(allText);
//         }
//     }
//     rawFile.send(null);
// }

    
// }









