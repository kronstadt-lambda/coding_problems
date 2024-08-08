// declaration of variables
let top_number = 1_000;
let acumulator = 0;

const array = Array.from({length: top_number-1}, (_, i) => i + 1);

// function to check if a number is multiple of 3 or 5 and add it to the acumulator
function multiple_of_3_or_5(value) {
  if (value % 3 === 0 || value % 5 === 0) {
    acumulator += value;
  }
}

// Code execution
array.forEach(multiple_of_3_or_5);

// Print the result
console.log("The sum is: ",acumulator);
