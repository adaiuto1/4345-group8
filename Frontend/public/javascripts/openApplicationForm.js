window.onload = function () {
    let classesTaken = [];
    let classCatalog = [];
    let avoidedClasses = [];
    let allClasses = document.getElementById("allClasses")
    let options = allClasses.children;
    let avoidString = ""
    let firstChoice = document.getElementById("firstChoice")
    let firstChoiceSelector = document.getElementById("firstChoiceSelector")
    let secondChoice = document.getElementById("secondChoice")
    let secondChoiceSelector = document.getElementById("secondChoiceSelector")
    let thirdChoice = document.getElementById("thirdChoice")
    let thirdChoiceSelector = document.getElementById("thirdChoiceSelector")
    let avoid = document.getElementById("avoid")
    let avoidSelector = document.getElementById("avoidSelector")
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

    firstChoiceSelector.onchange = (f) => {
        firstChoice.value = f.target.value
        document.getElementById("second").setAttribute("style", "display:block")
    }
    secondChoiceSelector.onchange = (s) => {
        secondChoice.value = s.target.value
        document.getElementById("third").setAttribute("style", "display:block")
    }
    thirdChoiceSelector.onchange = (t) => {
        thirdChoice.value = t.target.value
    }

    avoidSelector.onchange = () => {
        if (avoidedClasses.includes(avoidSelector.value)) {
            avoidedClasses.splice(avoidedClasses.indexOf(avoidSelector.value), 1)
        } else {
            avoidedClasses.push(avoidSelector.value)
        }
        avoidString = ""
        avoidedClasses.forEach(c => {
            if (c !== "") {
                avoidString = avoidString + c + ","
            }
        })
        if (avoidString.charAt(0) !== ',') {
            avoid.value = avoidString
        } else {
            avoid.value = avoidString.substring(1, avoidString.length - 1)
        }
    }
}