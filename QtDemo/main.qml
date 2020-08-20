import QtQuick 2.12
import QtQuick.Window 2.12

Window {
    visible: true
    width: 1600
    height: 768
    color: "black"
    title: qsTr("Hello World")

    Text {
        x: 1300
        y: 100
        id: stopName
        color: "white"
        font.pointSize: 40
        text: qsTr("Centrum   Rybnicka   Sympatyczna")
        NumberAnimation on x{
            to: -100
            from: 1700
            loops: Animation.Infinite
            duration: 10000
        }
    }
}
