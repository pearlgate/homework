{
var today = new Date();
var hourNow = today.getHours();
var greeting;

if(hourNow>18){
    greeting = "Good evenigh!";
}else if(hourNow > 12){
    greeting = "good afternoon!";
}else if(hourNow > 0){
    greeting = "Good morning!";
}else{
    greeting = "Welcome!";
}
document.write('<h3>'+greeting+'</h3>');
}

let hotel = new Hotel();
hotel.name='Quay';
hotel.rooms="40";
hotel.booked="25";
console.log(hotel);