const selectors = document.querySelector(".selectors");
const list = document.querySelector(".list");


const fetchData = (dataSet) => {
        fetch('./data/data.json')
        .then(res => res.json())
        .then(res => {
            filterFunc(dataSet, res)
            
    })
}

const createHtml = (filterdList) => {
    list.innerHTML="";
    for(item of filterdList){
    list.innerHTML +=
    `<div class="listChild">
        <img src=${item.imgSrc}>
        <span>${item.sex} ${item.size}</span>
     </div>`
    }
}

const filterFunc = (dataSet, res) => {
    if(dataSet === "t" || dataSet === "p" || dataSet === "s" ) {
        filterdList = res.filter(item => item.kind === dataSet);
        createHtml(filterdList);
        
    } else {
        filterdList = res.filter(item => item.color === dataSet);
        createHtml(filterdList);
    }
}

const clickFunc = (e) => {
    const dataSet = e.target.dataset.id
    if(dataSet === undefined) {
        return;
    }
    
    fetchData(dataSet);


}


selectors.addEventListener("click", clickFunc);

