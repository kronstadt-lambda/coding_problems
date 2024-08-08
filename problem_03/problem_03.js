const number = 600851475143;

function isPrime(num) {
  for (let i = 2; i <= Math.sqrt(num); i++) {
    if (num % i === 0) {
      return false;
    }
  }
  return true;
}

function largestPrimeFactor(num) {
  for (let i = 2; i <= Math.sqrt(num); i++) {
    if ( num % i === 0 && isPrime(i)) {
      largestPrime = i;
    }
  }
    return largestPrime;
}

console.log(largestPrimeFactor(number));