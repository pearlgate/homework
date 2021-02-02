//JSON
//JavaScript Object Notation

//1.Object to JSON
//stringfy(obj)
let json = JSON.stringify(true);
console.log(json);

//배열변환
json = JSON.stringify(['apple','banana']);
console.log(json);

//obj
const rabbit = {
    name : 'tori',
    color : 'white',
    size : null,
    birthDate : new Date(),
    //JSON에서 함수는 Object에 있는 Data가 아니기 때문에 포함되지 않는다.
    jump: () =>{
        console.log(`${name} can jump!`);
    },
};

json = JSON.stringify(rabbit);
console.log(json);

json = JSON.stringify(rabbit, ['name','color']);
console.log(json);

//콜백함수를 이용 key값을 사용해 해당하는 value를 바꿀수 있다.
json = JSON.stringify(rabbit,(key, value)=>{
    console.log(`key: ${key}, value:${value}`);
    return key ==='name' ? 'ellie' : value;
});
console.log(json);

//2.JSON to Object
//parse(json)
console.clear();
json = JSON.stringify(rabbit);
// console.log(rabbit);
const obj = JSON.parse(json);
console.log(obj);
rabbit.jump();
obj.jump();