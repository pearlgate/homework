//function declaration
//function name(param1, param2){body...return;}
//one function === one thing
//naming: dosomething, command, verb
//e.g. createCardAndPoint -> createCard, createPoint
//function is object in js

//callback function
//함수를 정의해놓고 파라미터로 함수를 받아와서 다시 쓰는 함수
//function randomQuiz(answer, printYes, printNo){
//    if(answer === 'love you'){
//        printYes();
//    }else{
//        printNo();
//    }
//}
//anonymous function
//const printYes = function(){
//    console.log('yes!');
//}
//names function
//const printNo = function print(){
//    console.log('no!');
//}

//randomQuiz('wrong', printYes, printNo);




//function을 만들건데 이름 과 파라미터 calculate(command, a, b)
//command: add, substract, divide, multiply, remainder가 있음 각각 실행이 다르게 calculate의 function을 짜시오.
// function calculate(command, a, b){
//     if(command==add()){
//         console.log(add);
//     }else if(command==subtract){
//        console.log(subtract);
//     }
// }

// const add =(a,b) => a+b;
// const subtract = (a,b) => a-b;
// const divide = (a,b) => a/b;

// calculate(add,1,2);
// function sum(a,b){
//     return a+b;
// }
// const result = sum(1,2);
// console.log(result);
// function caculate(command,a,b){
//     console.log(command);
// }

function calculate(command,a,b){
    switch (command){
        case 'add' :
            return a+b;
        case 'substract' :
            return a-b;
        case 'divide' :
            return a/b;
        case 'multiply' :
            return a*b;
        case 'remainder' :
            return a % b;                      
    }
}

console.log(calculate('add',1,2));