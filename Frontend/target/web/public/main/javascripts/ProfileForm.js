window.onload = function () {
    let isStudent = false;
    let statusSelector = document.getElementById("status")
    let degreeSelector = document.getElementById("degree")
    let startingSemester = document.getElementById("startingSemester")
    let gradSemester = document.getElementById("gradSemester")
    let startLabel = document.getElementById("startLabel")
    let gradLabel = document.getElementById("gradLabel")

    statusSelector.onchange = () => {
        if (statusSelector.value === "Student") {
            degreeSelector.setAttribute("style", "display:block")
            degreeSelector.setAttribute("required", "true")

            startingSemester.setAttribute("style", "display:block")
            startingSemester.setAttribute("required", "true")

            gradSemester.setAttribute("style", "display:block")
            gradSemester.setAttribute("required", "true")

            startLabel.setAttribute("style", "display:block")
            gradLabel.setAttribute("style", "display:block")
        } else {
            degreeSelector.setAttribute("style", "display:none")
            degreeSelector.setAttribute("value", "")
            degreeSelector.removeAttribute("required")

            startingSemester.setAttribute("style", "display:none")
            startingSemester.setAttribute("value", "")
            startingSemester.removeAttribute("required")

            gradSemester.setAttribute("style", "display:none")
            gradSemester.setAttribute("value", "")
            gradSemester.removeAttribute("required")

            startLabel.setAttribute("style", "display:none")
            gradLabel.setAttribute("style", "display:none")
        }
    }

}