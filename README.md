Greater-Galaxies V2
================

Long time ago, a big space ship was launched to space from earth with a mission of habitating mars. Unexpectedly, a solaar particle
storm occurred, wiping off the magnetic field of earth, destroying all life on earth and damaging the space ship.
It drifted far into outer space, but the people inside it used the available resources and tools to create small space ships
which could independently gather resources from the "mother ship" and could be improved and added modules to easily. It took years,
but finally they managed to complete their work. After followed exponential growth of the world of the last few remaining humans, floating
somewhere in vast space.

Planets cannot be landed on due to the modular structure of the space ships. The ships cannot handle big acceleration. Fuel
is also rare and thus landing on a planet without staying there forever is impossible. Resources are gathered from asteroids and
produced in factories, biodomes and whatnot.

The structure of the world is:
-World
*Body (a grid filled with components, components might take multiple grid cells)
**Component
*Player
*Planet/Sun/Big rock

Space ships are formed of a single or many bodies. Each body is basically a grid where components are put to.
Components can be attached and detached by players. Bodies can float inside other bodies if there is space.
Resources flow through components. Resources are for example air, signal, rock. Empty hallway in the ship would move the
air resource, so if it leads to space, it quickly becomes empty and the player needs to fix it.
Signals are ran from controls to engines. When close to controls, GUIs are shown to use them, with an option for setting up
keyboard shortcuts and such.
Objects can also be configured. It is kind of like a wiring system with multiple different types of signals and with each component
deciding what signals to output based on its surroundings, settings and resources coming into it (signals)

Players spawn in a small space station component, made by another player, which will spawn new players and give them small space ships
as long as there is resources in it (the builder of the station must supply them). This could be used to get more crew to
your station or if you feel lonely.

Another option is to spawn somewhere in space and survive alone until you find other players.

Players dont own the ships, but the ship parts will have permissions given to certain players, which means if you find a powered
out spaceship floating in space, you can break in and configure it to obey you (and hope the previous owner didnt add random traps)

The gameplay is mostly building bigger and better space stations which can produce different resources. You can chain up different
components to create complex automated factories or defence systems.
Fighting exists, but it is mostly defence against the random trolls who decide to try and destroy you. A Small space ship will always be able
to escape a bigger one due to accelerating much faster and dodging weapons. If it is 2 big ships, they will harm each other badly, but will probably survive.

However, fighting against AI opponents might be an option, as it doesnt hurt the players ships (which took long to build), or maybe just
fighting against "natural disasters" like many meteors flying through the area or strong radiation or accidents like fire on the space stations and ships.

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



