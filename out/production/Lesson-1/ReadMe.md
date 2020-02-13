<p> Lesson 1.1.2 </p>
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

<p> Lesson 1.1.3 </p>
<p>#8 !!!!!!!!!!!!!! </p>
<p>#12 The naming convention is called camel casing. totalCost should be a data type of double because prices
have decimals.</p>
<p>#13 numSongs should be an int because you can't have half a song. </p>
<p>Conclusion 1: You may need more than one constructor for a class if you need different amounts of parameters
 in each constructor.
  For example:
  public Song(String title, double price) {
         this.title = title;
         this.price = price;
     }
     public Song(String title, double price, int rating) {
         this.title = title;
         this.price = price;
         this.rating = rating;
     }
I needed two different constructors in the Song class because I needed two parameters for one constructor and three
parameters
for the other.</p>
