const oppositeChars = [
    { char: "Ç", opposite: "c" },
    { char: "ç", opposite: "c" },
    { char: "Ğ", opposite: "g" },
    { char: "ğ", opposite: "g" },
    { char: "I", opposite: "i" },
    { char: "ı", opposite: "i" },
    { char: "İ", opposite: "i" },
    { char: "Ö", opposite: "o" },
    { char: "ö", opposite: "o" },
    { char: "Ş", opposite: "s" },
    { char: "ş", opposite: "s" },
    { char: "Ü", opposite: "u" },
    { char: "ü", opposite: "u" }
];

function getOppositeChar(value) {
    if (result = oppositeChars.find(({ char }) => char === value)) return result.opposite;
}

function replaceChar(target) {
    document.body.innerHTML = getOppositeChar(document.body);
}

function destroyValue() {
    
}

console.log(getOppositeChar("ığç"))