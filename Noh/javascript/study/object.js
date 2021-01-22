//Objects
//one tof the JavaScript's data types.
//a collection of related data and/or functionality.
//Nearly all objects in Javascript are instances of Object
//object ={key : value};

const obj1 = {}; //'object literal'
const obj2 = new Object(); //'object constructor'

function print(person){
    console.log(person.name);
    console.log(person.age);
}

const injae = { name: 'injae', age: 4 };
print(injae);