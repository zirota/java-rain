# JAVA RAIN

Learn how to make raindrops using the Java Swing libary!

## Pre-requisites

`JDK >= 8`

For Windows 10 machines with High DPI displays it is reccomended to use:

`JDK >= 9`

## Setup

### Project Structure

```md
.
├── bin                   # Compiled files
├── src                   # Source files
│   ├── rain
├── LICENSE
└── README.md
```

### Compile

Please set your Java environment variables if you have not done so

To compile the java code:

```cmd
$ javac -d bin/ src/rain/*.java
```

### Start

To start the program:

```cmd
$ java -cp bin/ rain.App
```

## General Workflow

1) Create frame
2) Add Objects to Panels
3) Add Panels to Frame

## Useful Links

For more information, please read:

1. [Java Frame][jframe]
2. [Java Panel][jpanel]

[jframe]: https://docs.oracle.com/javase/tutorial/uiswing/components/frame.html
[jpanel]: https://docs.oracle.com/javase/tutorial/uiswing/components/panel.html