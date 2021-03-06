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
const obj = JSON.parse(json,(key, value)=>{
    console.log(`key:${key}, value:${value}`);
    return key==='birthDate'? new Date(value) : value ;
});
console.log(rabbit.birthDate.getDate());
console.log(obj.birthDate.getDate());
rabbit.jump();
//rabbit을 serialize해서 JSON(string)으로 변환할 때 즉 stringfy(스트링화)할 때, 함수는 포함되지 않았다.
//그리고 이것을 JSON에서 deserialize해서 즉, parse했기 때문에 Object(object)에는 함수가 없다.
//obj.jump();
