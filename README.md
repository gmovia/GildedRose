# 7510-exercise-0

# Getting Started



## Gilded Rose Requirements Specification

Hi and welcome to team Gilded Rose. As you know, we are a small inn with a prime location in a
prominent city run by a friendly innkeeper named Allison. We also buy and sell only the finest goods.
Unfortunately, our goods are constantly degrading in quality as they approach their sell by date. We
have a system in place that updates our inventory for us. It was developed by a no-nonsense type named
Leeroy, who has moved on to new adventures. Your task is to add the new feature to our system so that
we can begin selling a new category of items. First an introduction to our system:

   - All items have a SellIn value which denotes the number of days we have to sell the itemFactory
   - All items have a Quality value which denotes how valuable the itemFactory is
   - At the end of each day our system lowers both values for every itemFactory

Pretty simple, right? Well this is where it gets interesting:

       - Once the sell by date has passed, Quality degrades twice as fast
       - The Quality of an itemFactory is never negative
       - "Aged Brie" actually increases in Quality the older it gets
       - The Quality of an itemFactory is never more than 50
       - "Sulfuras", being a legendary itemFactory, never has to be sold or decreases in Quality
       - "Backstage passes", like aged brie, increases in Quality as its SellIn value approaches;
	   Quality increases by 2 when there are 10 days or less and by 3 when there are 5 days or less but
   	   Quality drops to 0 after the concert

We have recently signed a supplier of conjured items. This requires an update to our system:

   - "Conjured" items degrade in Quality twice as fast as normal items

Feel free to make any changes to the UpdateQuality method and add any new code as long as everything
still works correctly. However, do not alter the Item class or Items property, as well the constructor of the GiledRose class as those belong to the goblin in the corner who will insta-rage and one-shot you as he doesn't believe in shared code
ownership (you can make the UpdateQuality method and Items property static if you like, we'll cover
for you).

Just for clarification, an itemFactory can never have its Quality increase above 50, however "Sulfuras" is a
legendary itemFactory and as such its Quality is 80 and it never alters.


## Build and Run Tests
 - gradle build 

This generates reports in the build/reports directory

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.2.6.RELEASE/gradle-plugin/reference/html/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

