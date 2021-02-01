export function positiveSum(arr:number[]):number {
  
    let result = 0;
    
    for (var i of arr) {
      if (i > 0) {
        result += i
      }
    }
    return result;
}

console.log(positiveSum([1,22,0,-7,8,-898]))
