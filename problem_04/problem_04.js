const top_number = 999;
const bottom_number = 100;
let palindrome = [];

function isPalindrome(num) {
  return num.toString() === num.toString().split('').reverse().join('');
}

for (let i = top_number; i >= bottom_number; i--) {
  for (let j = top_number; j >= bottom_number; j--) {
    const product = i * j;
    if (isPalindrome(product)) {
      palindrome.push(product);
      break;
    }
  }
}

console.log(Math.max(...palindrome));
