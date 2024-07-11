function romanToInt(s: string): number {
    const values = {
        I: 1,
        V: 5,
        X: 10,
        L: 50,
        C: 100,
        D: 500,
        M: 1000,
    }
    let result = 0
    for (let i = 0; i < s.length; i++) {
        switch (s[i]) {
            case "I":
                if (i < s.length) {
                    if (s[i + 1] === "V" || s[i + 1] === "V") {
                        result = result + -values[s[i]]
                    }
                    else {
                        result = result + values[s[i]]
                    }
                }
                break;
            case "X":
                if (i < s.length) {
                    if (s[i + 1] === "L" || s[i + 1] === "C") {
                        result = result + -values[s[i]]
                    }
                    else {
                        result = result + values[s[i]]
                    }
                }
                break;
            case "C":
                if (i < s.length) {
                    if (s[i + 1] === "D" || s[i + 1] === "M") {
                        result = result + -values[s[i]]
                    }
                    else {
                        result = result + values[s[i]]
                    }
                }
                break;
            default:
                result = result + values[s[i]]
                break
        }
    }

    return result;
};
