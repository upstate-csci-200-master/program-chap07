# program-chap07

Create a Java program **ImageCreator.java** that writes **400 × 300** P6 PPM image file named **image.ppm**. Print ```An image was written to image.ppm.``` Your image can be a solid color or something more interesting.

## P6 PPM Format
* Magic number ("P6")
* whitespace and/or comments
* width (as a string)
* whitespace and/or comments
* height (as a string)
* whitespace and/or comments
* Maximum value ("255")
* A new line
* A raster of width × height × 3 bytes
* A new line (optional)


## Writing Binary Files
The ```FileOutputStream``` class in ```java.io``` can write byte at a time or arrays of bytes. To convert a ```String``` to an array of bytes, use ```String```'s ```getBytes()```. Open, write, **close**.

## Submission
Submit your source code to CodePost.

## Resources 
* GNU Image Manipulation Processor (GIMP): https://www.gimp.org/downloads/
* Additional Information about PPM P6 format: https://en.wikipedia.org/wiki/Netpbm

