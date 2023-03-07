window.onload = function () {
    let classesTaken = [];
    let classCatalog = [];
    let allClasses = document.getElementById("allClasses")
    let options = allClasses.children;
    
    for (let i = 0; i < options.length; i++) {
        let s = options[i].innerHTML
        classCatalog.push(s.substring(0, s.length - 1))
    }
    console.log(classCatalog)
    let classString = document.getElementById("classDisplay").value
    if (classString !== "null") {
        classesTaken = classString.split(",")

    }
    let classDisplay = document.getElementById("classDisplay")
    let classSelector = document.getElementById("classSelector")

    //course selector interface
    classSelector.onchange = () => {
        if (classesTaken.includes(classSelector.value)) {
            classesTaken.splice(classesTaken.indexOf(classSelector.value), 1)

        } else {
            classesTaken.push(classSelector.value)
        }
        classString = ""
        classesTaken.forEach(c => {
            if (c !== "") {
                classString = classString + c + ","
            }
        })
        if (classString.charAt(0) !== ',') {
            classDisplay.value = classString
        } else {
            classDisplay.value = classString.substring(1, classString.length - 1)
        }
        console.log(classesTaken)
    }

    firstChoice.onchange = (e) => {
        document.getElementById("second").setAttribute("style", "display:block")
    }
    secondChoice.onchange = () => {
        document.getElementById("third").setAttribute("style", "display:block")

    }
}