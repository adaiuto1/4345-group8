window.onload = function () {
    let classArray = [];
    let classString = document.getElementById("classDisplay").value
    if (classString !== "null") {
        classArray = classString.split(",")
    }
    let classDisplay = document.getElementById("classDisplay")
    let classSelector = document.getElementById("classSelector")
    //course selector interface
    classSelector.onchange = () => {
        if (classArray.includes(classSelector.value)) {
            classArray.splice(classArray.indexOf(classSelector.value), 1)

        } else {
            if (classString === "null") {
                classString = ""
            }
            classArray.push(classSelector.value)
        }

        classString = ""
        classArray.forEach(c => {
            classString = classString + c + ","
        })
        classDisplay.value = classString
        console.log(classArray)
    }
}