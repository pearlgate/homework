//string concatenation
console.log('my' + 'cat');
console.log('1' + 2);
console.log(`string literals: 1 + 2 = ${1+2}`);

let name="hanho";
if(name==="injae"){
    console.log("how handsome");
}else if(name==="noh"){
    console.log("wonderful body");
}else{
    console.log(name+" nice to meet you");
}
//Ternary operator
console.log(name ==='injae'?'yse':'no');

for(let i=1; i<=10; i++){
    if(i % 2 !== 0){
        continue;
    }else{
        console.log(i);
    }
}
for(let i=1; i<=10; i++){
    if(i > 8){
        break;
    }else{
        console.log(i)
    }
}