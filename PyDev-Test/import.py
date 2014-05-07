import sys
from PyQt4 import QtGui
print "PyQt4 successfully imported!"
from PIL import Image
print "PIL successfully imported!"
import numpy
print "numpy successfully imported!"
#im = Image.open("IMG_1346_resize.JPG")
#im.rotate(45).show()
print Image.VERSION

def main():
    app = QtGui.QApplication(sys.argv)
    
    w = QtGui.QWidget()
    w.resize(250, 150)
    w.move(300, 300)
    w.setWindowTitle('Simple')
    w.show()
    
    sys.exit(app.exec_())
    
if __name__ == '__main__':
    main()