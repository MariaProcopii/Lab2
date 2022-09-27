# Lab2

`Admin` class handels the amount of players. Right now, in my simulation is present ony one actor of every class, but in future I'll 
extend it. `provideTable()` method can separate the players in `haveTable` - will be provided with a table, `haveNoTable` - will wait
in queue. I have also a method wich is called when we want to display how many Players we have.

`Meal` class has the methods that will provide automatically the user the chance to pick what we want to eat. Before talkig about 
`stopListCheck()` method, I'll present the Menu class. Speaking shortly, it forms the dishes form the list of ingredients. Also here
is formed the dictionary with prices for the future bill. `stopList()` method pickes what can't be orderred 'today'. User will gen -1
to his satisfied field, if he'll pick some of this dishes. `stopListCheck()` verify if the user order does not contain restricted dishes.

`Table` hold the information about table state. Each table has his index of 'good state'. If user will receive a bad or dirty table, he'll 
get -1 to his state. Better the table is, better wi'll be the mark for state. Speaking of dirty table, we can present the Cleaner class.
It will ollow us to clean the table and gain some state points, but it will pick randomly if the table will be cleaned or not. It contains
2 methods: `cleanOrNot()` will make the decision about cleaning and another one will clean the table.

`Waiter` also has his index/rating of good working wich will influence the player state/satisfaction. Waiter can take orders or bring the 
bill to the player, wich will call the methos `pay()` from player and user will simulate the paying procedure. For class `Cook` all the required
information is collected by the waiter. Here we can check the quality of waiter (slow waider will decrease the user state and vice versa).
`coocking()` will provide the user th meal which he ordered.

An interesting class here is `Barmaid`, the representation of luck in our simulation. Barman method playGame() give the user the chance to earn money and
increase his satisfied fild, however it can loose too. `playGame()` simulates a primitive card game (maybe will be upgraded). For this we need `Card` and
`Deck` classes. `Card` is a small class which stores the info about suit of card, rank and numeric value. Method `findValue()` will provide the chance to 
look at the formed dictionary in Deck and get the numeric value (ex. Queen = 12). In `Deck`, as mentioned before, we form a dictionary to represent the value
of every card (we'll need this to compare them in future). `addCards()` forms a list of object with every card possible. cardValue() forms the dictionary.

After setting the Card and Deck, we're ready to look at `Barmaid` method `playGame()` more detailed. In this method 2 cards are picked randomly (one for Barmaid
another for user). First pick 2 random numers, then placing them in the dack to get the cards. Don't forget about method `findValue()` which we call for finding
the values of cards, then compare them. Wins the bigger one. Player who loses pays the one who wins.

`Main.java` has a small visual representatiion of all discussed above.
