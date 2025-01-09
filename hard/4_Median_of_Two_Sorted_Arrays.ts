function findMedianSortedArrays(nums1: number[], nums2: number[]): number {
    const temp = []
    for(let i = 0;i<nums1?.length;i++){
        temp.push(nums1[i])
    }
    for(let i = 0;i<nums2?.length;i++){
        temp.push(nums2[i])
    }
    for(let i = 0;i < temp?.length;i++){
        let smallNumber = temp[i];
        let index = i;
        for(let j = i+1;j< temp?.length;j++){
            if(smallNumber > temp[j]){
                smallNumber = temp[j]
                index = j
            }
        }
        const value = temp[i]
        temp[i] = smallNumber
        temp[index] = value
    }
    let result;
    if(temp?.length % 2 !== 0){
        result = temp[parseInt(temp?.length/2 as unknown as string)]
    }
    else{
        const half = temp?.length / 2


        result = (temp[half-1] + temp[half]) /2

    }

    return result;
};
