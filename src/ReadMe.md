<h1> Lesson 1.1.2 </h1>
<p> #5 My MediaLib class and the SecondClass class both have (at least) one constructor.
They also both have a main method, and a System.out.println statement.</p>
<p>#7 The four variable types are int, double, String, and char. </p>
<p>#17 song1 prints Song@75412c2f when the program is run </p>
<p>Conclusion #1: Accessors and mutators are an advantage to have in a program because it allows information to
be spread throughout multiple classes. Also, you can easily change the data type that you are using. It also
 makes code cleaner. A disadvantage might be that is more complex than other ways of doing the same program. </p>
<p> Conclusion #2: The song, movie, and book classes all have the same variables, constructors,
and getters and setters. All of the classes have the same methods: getTitle, setTitle, getRating, and setRating. To
reduce the duplication the Books, Movies, and Song classes could have been put in one single class.</p>

<h1> Lesson 1.1.3 </h1>
<p>#8  You could do song.setFavorite(true). My preferred version of mutator for favorite is new Song  </p>
<p>#12 The naming convention is called camel casing. totalCost should be a data type of double because prices
have decimals.</p>
<p>#13 numSongs should be an int because you can't have half a song. </p>
<p>Conclusion #1: You may need more than one constructor for a class if you need different amounts of parameters in each constructor.
For example there are two parameters in public Song(String title, double price) and three parameters in public Song(String title, double price, int rating). </p>
I needed two different constructors in the Song class because I needed two parameters for one constructor and three
parameters
for the other.</p>
<h1> Lesson 1.1.4 </h1>
<p>#1a. Strings are literally objects of the String class, that happen to hold sequences of characters. Also, all class name begin with a capital letter, like in String, and primitive types start with lowercase letter (int). </p>
<p>#1b. A reference with no value  </p>
<p>#1c. String test; test = "This is a test message."; or String test = "This is a test message.";</p>
<p>#1d. A class created from another class that is called a superclass. A subclass inherits or receives all funcitonality from its superclass. </p>
<p>#1e. The superclass of the String class is the Object class. </p>
<p>#1f. You can call .getClass() for class and .getSuperclass() for superclass. </p>
<p>#10 result1 uses == and result2 uses .equals(). "==" compares the reference identity. .equals() method compares only contents.</p>
<p>#25a. Freezing would cause a short circuit evaluation (freezing && cloudy). </p>
<p>#25b. Sunny would cause a short circuit evaluation (sunny || fair). </p>
<p>#25c. !Sunny would cause a short circuit evaluation (!sunny && !fair). </p>
<p>#27a. if(!(sunny || clear)) </p>
<p>#27b. if(raining && snowing) </p>
<p>#28a. if(temperature <= 75) </p>
<p>#28b. if(temperature > 100) </p>
<p>#28c. if(temperature != 32) </p>
<p>Conclusion #1: first way --> if(str != "" && (str.length() <= 80)) second way -->()</p>
<p>Conclusion #2:  </p>
<h1> Lesson 1.1.5 </h1>
<p>#1 </p>
<p>#2 Algorithm 2 generates a better random dice roll because there are two random number generators. </p>
<p>Conclusion #1: </p>
<p>Conclusion #2: </p>
