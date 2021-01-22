//1. make a string out of an array
{
    const fruits = ['apple', 'banana', 'orange'];
    // console.log(fruits);
    // //index[0]을 잘라서 변수에 저장
    // let stringFruits = fruits.shift();
    // console.log(stringFruits);
    // //자르고,반환 받은 값을 계속해서 저장
    // for(i=0; i<=fruits.length; i++){
    //     stringFruits += fruits.shift();
    // }
    // console.log(stringFruits);

    const result= fruits.join('boom');
    console.log(result);
}

//2.make an array out of a string
{
    const fruits ="apple, kiwi, banana, cherry";
    const result = fruits.split(',');
    console.log(result);
}
//3.make this array look like this:[5,4,3,2,1]
{
    const array=[1,2,3,4,5];
    array.reverse();
    console.log(array);
}
//4.make new array without the first two elements
{
    const array=[1,2,3,4,5];
    const newArray=array.slice(2,5);
    console.log(newArray);
}

class Student{
    constructor(name, age, enrolled, score){
        this.name = name;
        this.age = age;
        this.enrolled = enrolled;
        this.score = score;
    }
}
const students = [
    new Student('A', 29, true, 45),
    new Student('B', 28, false, 80),
    new Student('C', 30, true, 90),
    new Student('D', 40, false, 66),
    new Student('E', 18, true, 88),
];
//5. find a student with the score 90
{
console.log(students[0]);

function grade(){
    for(i=0; i<students.length; i++){
        if(students[i].score<90){
            continue;
        }else{
            console.log(students[i].name);
        }
    }
}
grade();
}
//6. make an array of enrolled students 등록한 학생들의 배열을 만들어라.
