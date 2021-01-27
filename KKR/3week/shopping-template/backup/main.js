
const list = document.querySelector(".list");
const tBtn = document.querySelector(".tBtn");
const sBtn = document.querySelector(".sBtn");
const pBtn = document.querySelector(".pBtn");
const blueBtn = document.querySelector(".blueBtn");
const yellowBtn = document.querySelector(".yellowBtn");
const pinkBtn = document.querySelector(".pinkBtn");



const makeBox = (imgSrc, sex, size) => {
    const listChild = document.createElement("div");
    const listImg = document.createElement("img");
    const listText = document.createElement("span");
    listText.innerText=`  ${sex} ${size}`;
    listImg.setAttribute("src", imgSrc);
    listChild.setAttribute("class", "listChild")
    listChild.appendChild(listImg);
    listChild.appendChild(listText);
    list.appendChild(listChild);
    
}

const loadMain = () => {
    fetch('./data/data.json')
    .then(res =>res.json()
    .then(res => {
        for (let item of res) {
            makeBox(item.imgSrc, item.sex, item.size);
        }
    })

    )
    
}

const removeAll = () => {
    listChilds = document.querySelectorAll(".listChild");
    for(listChild of listChilds) {
        listChild.parentNode.removeChild(listChild);
    }
}


loadMain();

const loadT = (e) => {
    
    removeAll();

    fetch('./data/data.json')
    .then(res =>res.json()
    .then(res => {
        const t = res.filter(item => item.kind === "t")
        for(let tt of t) {
            makeBox(tt.imgSrc, tt.sex, tt.size);
        }
    
    })

    )
    
}

const loadS = (e) => {
    
    removeAll();

    fetch('./data/data.json')
    .then(res =>res.json()
    .then(res => {
        const t = res.filter(item => item.kind === "s")
        for(let tt of t) {
            makeBox(tt.imgSrc, tt.sex, tt.size);
        }
    
    })

    )
    
}

const loadP = (e) => {
    
    removeAll();

    fetch('./data/data.json')
    .then(res =>res.json()
    .then(res => {
        const t = res.filter(item => item.kind === "p")
        for(let tt of t) {
            makeBox(tt.imgSrc, tt.sex, tt.size);
        }
    
    })

    )
    
}

const loadBlue = (e) => {
    
    removeAll();

    fetch('./data/data.json')
    .then(res =>res.json()
    .then(res => {
        const t = res.filter(item => item.color === "blue")
        for(let tt of t) {
            makeBox(tt.imgSrc, tt.sex, tt.size);
        }
    
    })

    )
    
}

const loadYellow = (e) => {
    
    removeAll();

    fetch('./data/data.json')
    .then(res =>res.json()
    .then(res => {
        const t = res.filter(item => item.color === "yellow")
        for(let tt of t) {
            makeBox(tt.imgSrc, tt.sex, tt.size);
        }
    
    })

    )
    
}

const loadPink = (e) => {
    
    removeAll();

    fetch('./data/data.json')
    .then(res =>res.json()
    .then(res => {
        const t = res.filter(item => item.color === "pink")
        for(let tt of t) {
            makeBox(tt.imgSrc, tt.sex, tt.size);
        }
    
    })

    )
    
}

tBtn.addEventListener('click', loadT);
pBtn.addEventListener('click', loadP);
sBtn.addEventListener('click', loadS);
blueBtn.addEventListener('click', loadBlue);
yellowBtn.addEventListener('click', loadYellow);
pinkBtn.addEventListener('click', loadPink);