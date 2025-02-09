# MonolithicAdventureGame
Monolithic Adventure Game is a text-based RPG game written in Java. The player fights enemies, uses items, and completes levels to complete the game. The project demonstrates the use of object-oriented programming (OOP) to create a simple but fun game.

Features
4 difficulty levels: The player goes through 4 levels, each of which becomes more difficult.
A variety of enemies: Skeletons, zombies and vampires with unique characteristics.
Useful items: Health Potions, gold coins and magic scrolls to help the player.
Interactive gameplay: The player can decide whether to use the found items and move on to the next level.
Simple Text graphics: The game is completely text-based, making it easy to understand and run.

Launching the game
Clone the repository:

bash
git clone https://github.com/ваш-username/monolithic-adventure-game.git
cd monolithic-adventure-game
Compile and run the game:

If you have Maven installed:

bash
mvn clean compile
mvn exec:java -Dexec.MainClass="main.MonolithicAdventureGame"
If Maven is not installed:

Open the project in an IDE (for example, IntelliJ IDEA or Eclipse).
Find the Monolithic Adventure Game class in the main package.
Run the main method.

Project structure
Basic packages and classes

player:
  Player: The class representing the player. Manages health, experience, and inventory.

enemies:
  Enemy: An abstract class for all enemies.
  Skeleton, Zombie, Vampire: Specific classes of enemies.

items:
  Item: An interface for all items.
  GoldCoin, HealthElixir, MagicScroll: Specific classes of items.
  Item Manager: Manages the player's inventory.

combat:
  Combat Manager: Manages the battles between the player and the enemies.

level:
  Level Manager: Manages levels, enemies, and items in each level.

main:
  Monolithic Adventure Game: The main game class containing a game cycle.

How to play
The beginning of the game:
  The game starts with a greeting and loading of the first level.
  The player starts with 100 health points and 0 experience points.

Fight with enemies:
  In each level, the player faces several enemies.
  After each battle, the player's health is reduced by the damage inflicted by the enemy.
  The player gains experience for each defeated enemy.

Using items:
  After the battle, the player can find items (such as health potions or gold coins).
  The player decides whether to use the item or leave it.

Moving to the next level:
  After completing a level, the player can advance to the next level or end the game.
  The game ends if the player completes all 4 levels or if his health drops to 0.

Author:
  Bekezhan (Bekzhan)
  https://github.com/Bekzhanizb
