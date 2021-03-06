console.log(mergeIntervals([[0,5], [1,4], [2,5], [7,9]]));

// https://medium.com/swlh/how-to-merge-intervals-step-by-step-cb2c1edf1cd0
// Time complexity : O(n * log n) since program has to execute for the length of input array and also prior to it sort the input
// Space complexity: O(n) since new array is created to store and return the new intervals
function mergeIntervals(array) {
    if(array.length < 2)
        return array;

    // Sort based on start value of each interval, hence the compare function is subtracting only first index of both params
    array.sort((a, b) => a[0] - b[0]);

    let startTime = array[0][0];
    let endTime = array[0][1];
    let curStart;
    let curEnd;
    const intervals = [];

    for(let i=1; i<array.length; i++){
        curStart = array[i][0];
        curEnd = array[i][1];

        if(endTime >= curStart){ // Reversed the condition (to what is specified in medium article) so that it is easy to read
            // Main condition is this "if" statement where in we identify that endTime is greater than or equal to "start of current interval"
            // if there exists any interval whose start is less than or equal to the defined "endTime",
            // that means it is a merged interval
            endTime = Math.max(endTime, curEnd);
        }else{
            intervals.push([startTime, endTime]);
            startTime = curStart;
            endTime = curEnd;
        }
    }
    intervals.push([startTime, endTime]);
    return intervals;
}