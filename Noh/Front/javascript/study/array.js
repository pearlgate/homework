//자료구조와 알고르즘
'use strict'
//1.Declaration
const arr1 = new Array();
const arr2 = [1,2];

//Index position
const fruits = ['apple','banana'];
console.log(fruits);
console.log(fruits.length);
console.log(fruits[0]);
//마지막 인덱스를 지정할 때는
console.log(fruits[fruits.length-1]);

//Looping over an array
//print all fruits
function printFruits(){
    for (const fruit of fruits) {
        console.log(fruit);
    }
}
printFruits();

//forEach()로 출력~
fruits.forEach((fruit) => console.log(fruit));

function f(){
    var args = Array.from(arguments);
    console.log(args);
}