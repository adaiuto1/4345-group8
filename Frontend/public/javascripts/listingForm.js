window.onload = function () {
    let courseworkInterface = document.getElementById("courseworkInterface")
    let courseArray = [];
    let courseworkString = "";
    let classSelector = document.getElementById("classSelector")
    classSelector.onchange = (e) => {
        let v = e.target.value
        if (courseArray.includes(v)) {
            courseArray.splice(courseArray.indexOf(v), 1)
        } else {
            courseArray.push(v)
        }
        courseworkString = ""
        courseArray.forEach(c => {
            courseworkString = courseworkString + c + ","
        })
        document.getElementById("courses").value = courseworkString;
    }
    document.getElementById('targetSelector').onchange = e => {
        document.getElementById('classID').setAttribute("value", e.target.value)
    }
}