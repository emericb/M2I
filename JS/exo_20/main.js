console.log("exo_20");

let randomArr10 = Array.from({ length: 10 }, () => Math.floor(Math.random() * 100));
let space = "     ";

randomArr10.forEach((element, index) => {
    console.log(space.repeat(index) + `${element}`);
});
