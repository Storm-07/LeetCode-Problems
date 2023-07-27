/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array[]}
 */
var chunk = function(arr, size) {
    const chunkarr = [];
    let chunk = [];
    let count = 0;

    for(let i = 0; i <= arr.length - 1; i++) {
        chunk.push(arr[i]);
        count++;

        // if i === length and count is less than size, add the remaining chunk
        if(i === arr.length - 1 && count < size) {
            chunkarr.push(chunk);
            chunk = [];
            count = 0;
        }

        // if chunk is full add to array
        if(count === size) {
            chunkarr.push(chunk);
            chunk = [];
            count = 0;
        }
    }

    return chunkarr;
};
