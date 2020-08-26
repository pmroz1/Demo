const electron = require('electron');

const {app, BrowserWindow} = require('electron');

function CreateWindow(){
    const win = new BrowserWindow({
        width: 1024,
        height: 500,
        webPreferences: {
            nodeIntegration: true
        }
    })
    win.loadFile('index.html');
}

app.whenReady().then(CreateWindow);