Syed Shihan 							Due Date: 2/14/21
LAB01 README						Thaddeus Pawlicki
Contact Information: sshihan@u.rochester.edu

Program Status/Algorithm Description:
The program I have created completes all of the tasks required for the project. In the following lines, I will describe each method in the program and explain how they work.
public boolean isAnagram() 
This method takes in two parameters, str1 and str2, which are representative of the two strings that will be ran through the program to determine whether or not the strings are anagrams of one another.
First the length of the strings are compared and if the size differs, then the method immediately returns false.
If they are the same length, the strings are converted into character arrays (called str1Letters[] and str2Letters[] respectively) and then through a series of for loops, they are compared to each other.
If any letter within the strings has a match, the int variable truthVal1 increases and if truthVal1 = the size of the strings then the method returns true;
Else it returns false
public boolean isRotation()
This method takes in two parameters, str1 and str2, which are representative of the two strings that will be ran through the program to determine whether or not the strings are anagrams of one another.
First the length of the strings are compared and if the size differs, then the method immediately returns false.
If they are the same length, the strings are converted into character arrays (called str1Letters[] and str2Letters[] respectively). A third character array is also created named reverseString1[].
Using a for loop, reverseString1[] is filled with elements from str1Letters[] but in reverse order
Then reverseString1[] is compared to str2Letters[] with a for loop. If the elements match, then the int variable truthVal2 increases.
Finally if truthVal2 = the size of the strings then the method returns true.
Else it returns false.
public static void main(String[] args)
This method creates a Scanner object called scnr, and then creates two strings str1 and str2 that are determined by whatever the user inputs into the console
These strings are then used as parameters for the isAnagram() method. If the method returns true, then the statement “Anagram: True” is printed out. If the method returns false, then the statement “Anagram: False” is printed out.
These strings are then used as parameters for the isRotation() method. If the method returns true, then the statement “Rotation: True” is printed out. If the method returns false, then the statement “Rotation: False” is printed out.
