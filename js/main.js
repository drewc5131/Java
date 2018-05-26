function OnPressQuestions() {
    document.getElementById('questionbtn').classList.add('questionBtnOutPlaying');
    document.body.classList.add('backgroundChangeColor');
    document.getElementById('jumbo').style.setProperty('font-size', '0', 'important')
    document.getElementById('title').style.setProperty('font-size', '0', 'important')
    document.getElementById('desc').style.setProperty('font-size', '0', 'important')
    setTimeout(OpenQuestions, 3500)
}

function OpenQuestions() {
    window.location.href='questions.html'
}