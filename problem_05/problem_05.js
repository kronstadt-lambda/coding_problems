let number = 0;

do {
  number += 1;
  if (number % 11 === 0 && number % 13 === 0 && number % 14 === 0 && number % 16 === 0 && number % 17 === 0 && number % 18 === 0 && number % 19 === 0 && number % 20 === 0) {
    break;
  }
} while (true);

console.log("The smallest number that can be divided by each of the numbers from 1 to 20 without any remainder is: ", number);