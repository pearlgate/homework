'use strict';
//Getter and Setters(사용자가 의도하지 않은 value의 입력을 방지해주기 위한 캡슐화)
class User{
    constructor(firstName, lastName, age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    get age(){
        return this._age;
    }
    set age(value){
        this._age=value < 0? 0 : value;
    }
}

const user1 = new User('steve','jobs', -1);
console.log(user1.age);