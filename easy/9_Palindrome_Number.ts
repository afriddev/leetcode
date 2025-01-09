function isPalindrome(x: number): boolean {

const n = x.toString()
for(let i = 0;i < x.toString().length/2;i++){
    if(n[i] !== n[(n.length-1) - i]) return false
}
return true
};
