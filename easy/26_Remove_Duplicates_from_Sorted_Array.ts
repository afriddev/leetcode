function removeDuplicates(nums: number[]): number {
     const temp = []
    for (let i = 0; i < nums.length; i++) {
        let minValue = nums[i]
        for (let j = i; j < nums.length; j++) {
            if (minValue > nums[j]) {
                minValue = nums[j]
            }
        }
        if (!temp.includes(minValue)) {
            nums[temp?.length] = minValue
            temp.push(minValue)
            

        }
    }

    return temp.length

};
