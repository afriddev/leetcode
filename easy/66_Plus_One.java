
function handleRec(array: number[], index: number) {
    if(array?.length > 1 && index < 0){
        array.unshift(1)

    }
    else if (index === 0 && array?.length === 1) {
        array = [1, 0]
    }
    else if (array[index] === 9) {
        array[index] = 0
        handleRec(array, index - 1)

    }
    else{
        
            array[index] = array[index] +1

        
    }

    return array
}

function plusOne(digits: number[]): number[] {
    if (digits[digits?.length - 1] + 1 < 9) {
        digits[digits?.length - 1] = digits[digits?.length - 1] + 1
        return digits
    }
    else {
        return handleRec(digits, digits?.length - 1)

    }
};
