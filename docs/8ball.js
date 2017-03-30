function toggleLog(button, divName, name) {
    var div = document.getElementById(divName);
    var off = div.style.display !== "block";
    if (off) {
        div.style.display = "block";
        button.innerHTML = "Hide " + name;
    } else {
        div.style.display = "none";
        button.innerHTML = "Show " + name;
    }
}