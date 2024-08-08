const top_number = 4_000_000;
let solution = 2;

function sum_even_fibonacci_numbers() {
    let a = 1;
    let b = 2;
    let fibonacci;
    let sum = b;

    while (a + b < top_number) {
        fibonacci = a + b;
        if (fibonacci % 2 === 0) {
            sum += fibonacci;
        }
        a = b;
        b = fibonacci;
    }
    return sum;
}

console.log("The sum of the even Fibonacci numbers is: ", sum_even_fibonacci_numbers());
