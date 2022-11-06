# Face_detection
Here, we capture the video. The read() function reads one frame from the video source, which in this example is the webcam. This returns:
The actual video frame read (one frame on each loop)
A return code
The return code tells us if we have run out of frames, which will happen if we are reading from a file. This doesn’t matter when reading from the webcam, since we can record forever, so we will ignore it.
