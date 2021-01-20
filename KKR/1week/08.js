const header = document.getElementById("wow");




document.addEventListener('scroll', scFunc);
header.addEventListener('mouseover', mouseOverFunc);
header.addEventListener('mouseout', mouseOutFunc);





function scFunc(event) {

    const loc = document.documentElement.scrollTop;

    if (loc > 50) {
        header.style.opacity=0.3;
        header.style.transition=("all 0.5s");


    } else {
        header.style.opacity=1;
    }
}

function mouseOverFunc(event) {
    if(event.isTrusted) {
        header.style.opacity=1;
    }
}

function mouseOutFunc(event) {


    if(event.pageY > 215) {

        if(event.y > 153 || event.y <= 0 || event.x >1515 || event.x == 0) {
            header.style.opacity=0.3;
            header.style.transition=("all 0.5s");
        }

    }
    
}