const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

console.log("===== NODE APP =====");

rl.question("Enter your name: ", (name) => {

    rl.question("Enter your age: ", (age) => {

        console.log("-------------------");
        console.log("Welcome:", name);
        console.log("Age:", age);
        console.log("-------------------");

        rl.close();

    });

});
