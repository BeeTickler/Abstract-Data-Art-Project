# Abstract-Data-Art-Project
A showcase of what I did in the year 2025 and my goals for 2026.
# Project: New Scene, New Me

## Introduction

Software engineers develop programs to create visual and audio experiences using object-oriented programming. As we begin 2026, your goal is to create an animation program that reflects on your experiences from 2025 and visualizes your goals and aspirations for the year ahead using the Theater and Scene API.

## Requirements

Use your knowledge of object-oriented programming, one-dimensional (1D) arrays, algorithms, and the Theater/Scene API to create your animation program:
- **Write Scene subclasses** – Create two Scene subclasses: one to visualize your 2025 recap (LastYear) and another to project your 2026 goals (ThisYear). Each class must include both a no-argument constructor and a parameterized constructor.
- **Use private instance variables** – Implement proper encapsulation by declaring instance variables as private in your Scene subclasses.
- **Create 1D arrays** – Create at least two 1D arrays to store data for your scenes. One array must be created using an initializer list, and one array must be populated by reading from a text file using the FileReader class.
- **Write a method** – Write a method that finds or manipulates the elements in a 1D array to provide the information your user needs.
- **Access and modify array elements** – Use algorithms to traverse, access, and/or modify elements in your 1D arrays to display personalized content in your scenes.
- **Use logic and iteration** – Incorporate selection statements (if/if-else) and loops (while, for, or enhanced for) to control the flow and display of content in your scenes.
Incorporate variety of media – Use at least four different types of Scene API methods across both scenes (examples: drawImage(), drawText(), drawRectangle(), drawEllipse(), playSound(), setTextStyle(), setFillColor(), etc.).
- **Create a UML diagram** – Design a UML class diagram showing your Scene subclasses with their instance variables, constructors, and methods before you begin coding.
- **Document your code** – Use multi-line comments to explain the purpose of each method (including preconditions and postconditions) and single-line comments to explain code segments.

## UML Diagram 

Put an image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here. Make sure your image file name is one work, otherwise it might not properly get displayed on this README. 

![alt text](<Screenshot 2026-01-19 224830.png>)

## Description of 2025 recap

2025 was a bizzare adventure for me. I went to my first ever anime convention, but it was't just cosplayers and vendures, but also cars. Multiple custom jpm and other cars were brought out and came to be displayed in the convention center. I was lucky to experience and be up close to highly praised cars with my cousin. I also got my custom Anya mousepad from one of the vendures and got many stickers. I also spent my time reading manga. Though there was many mangas that I have read, the top 2 best mangas that I read was Chainsaw Man and Tower of God. These mangas stood out to me because of their story and the many plotpoints that came about. There was also the relationships between the characters which I enjoyed. Up to this point Tower of God has been the largest manga that I have read and its not even completed. Most of this year was spent of gaming. I spent lots of hours grinding on Valorant, Battle Cats, and Terria to name a few, and I hoped to 100% these games to show my determination and dedication and passion toward these games. Though the holidays were mid and subjuctive, I enjoyed this 2.5% of my life and hope that I can do more in the next year.

## Description of 2026 goals

In 2026, the goals that I want to achieve are to get my driving permit since I am coming to age, building more lego flowers(mostly from the Botanical lego sets), and lastly achieving ascendant rank in valorant.(radient by the end of highschool) Though these goals are quite easy, I still hope that I will always represent my best self.

## Scene API Usage

I used a variety of methods from the Scene API to build a complete animation experience that combined visuals, text, and sound. To display visuals, I used drawImage() to show images from my 1D arrays and clear() to reset the screen between scenes. Text-based methods like drawText(), setTextHeight(), setTextColor(), and setTextStyle() allowed me to create clear title screens, captions, and end screens with different fonts, sizes, and colors to match the mood of each scene.

To control timing and flow, I used pause() to create smooth transitions between screens and images so the animation did not change too quickly. For audio, I used playSound() along with helper methods to load and clip background music, which helped set the tone for both the 2025 recap and 2026 goals scenes. Finally, I used Theater.playScenes() to play both Scene subclasses in sequence, allowing the animation to progress naturally from reflecting on last year to looking ahead to the new year.