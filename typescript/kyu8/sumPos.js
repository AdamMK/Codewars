function positiveSum(arr) {
    var result = 0;
    for (var _i = 0, arr_1 = arr; _i < arr_1.length; _i++) {
        var i = arr_1[_i];
        if (i > 0) {
            result += i;
        }
    }
    return result;
}
console.log(positiveSum([1, 22, 0, -7, 8, -898]));
