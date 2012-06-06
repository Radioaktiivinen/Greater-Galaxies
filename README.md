Greater-Galaxies V2
================

World:

-Ship/Space station (doesnt contain any data, no owner, if i split it in half itll just be 2 space ships/stations)

*Body (multiple possible in 1 ship/space station, a single body is a grid where components are put, multiple means the ship can have rotating parts)

**Component (bodies contain components, which are attached to each other and configured by the player,
and resources such as air, water, electricity and rock flow through them,
as well as signals which are also kind of like resources)
-Player

-Space object (gas cloud, start, asteroid)

-Planet



The components can be seen from the space view, nothing is abstracted into lets say "Space ship of player A". 
Its just components on different grids connected together floating in space with planets etc.
with the player floating inside.


Gameplay:
1.Gather resources from components or using components

2.Put in components

3.Resource flows through different components (conveyor->factory->box)

4.Take resulting resource (which can be a component)

5.Float outside space ship in your space suit

6.Remove piece of hull

7.Attach component to something which carries electricity and signals (lets say the component is a lazor)

8.Configure component to take in position data (x,y)

9.Go to your control room and add a control which is directed using the mouse (when youre near it it sends a signal thru the ship with the mouse coords)
10.Configure the control to send signal to the lazor using the lazors ID or something (ITS LIEK THE INTERNET K)

11.Shoot random noobs poking your ship


An important part would be mining resources, buying resources from other ships 
(you could go near a space station with a biodome and buy food or organic materials or something) and 
manufacturing the resources with the factories youve built 
(you can chain together components to make factories which produce complex items out of many simple ones without
doing it all manually :D)

The game is side view 2D, and the player starts out on a planet walking on its surface. He has a basic space ship
capable of getting to orbit and back, but no fuel. He also has buildings on the planet, letting him to produce fuel for
the ship out of wood, oil or whatever. He needs to load the ship with water, oxygen, fuel and food to survive in orbit.
Eventually he has mined the planet for more ores and manufactured more components to his ship, letting him to go mine asteroids
and such to finally make his ship completely self sustaining, so he can go around in space and lets say make a huge
space station which provides other players resources and high tech parts and maybe protection.

Project management
==================
Project planning will begin June seventh.

You may continue to sign up if you wish, but you _MUST_ join by the seventh or you will be excluded.

Project members, please put some thought into what you want the project to be, and the tools you'd like to use (git, mercurial, svn). Nightname has joined but will be inactive until he's finished his examinations.

To better split up positions, the game will be split in MVC fashion.

Positions
---------

**Reserved:**
- Task managers (Accepts task requests and distributes tasks accordingly)
- Standards enforcer (Tags code that doesn't comply to group standards)

**Unfilled positions:**
- Designer (Creates all game graphics, preferred)
- Abstraction crew (Locates large groups of common objects that could be abstracted safely and efficiently without harm to the code base)

**Positions:**
- Controller devs (Input)
- Model devs (Data)
- View devs (Graphics)
- Scripters (All purpose)

Managing tasks
--------------

Tasks will be tagged appropriately and divided to programmers and scripters in such a way as to keep each focused on their independent tasks. Each programmer will have up to TWO tasks maximum to deal with at a time. Each scripter can have up to THREE tasks maximum to deal with at a time. Programmers will be able to choose TWO positions, one main and one sub. Scripters will be given "general" scripting tasks to accomplish.

Programmers will be able to generate scripting tasks, and scripters will be able to generate Lua VM feature requests. All groups will have access to the actual repository.

Thoughts
--------
- Maybe there should be a "task board" where you can accept tasks and report on progress.
- We really need to find a designer... :/



