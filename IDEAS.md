# General
- Local view of universe expands over time through continued gameplay
- Players eventually "ascend" and achieve higher power
- Players will be able to use fully client side macros
- Macros will be limited strictly to only what the user could do with a mouse or keyboard

# Game progression
- Start small, you begin with a village to control
- Villages move to cities(gradual?), and you must stave off enemies and win the support of your people
- You now have space flight, but not FTL
- You have expanded and met your first intergalactic enemy
- You have ascended and lost control of your previous forces

The goal of the game is to ascend, OR to dominate the universe. You don't have to ascend, but it's certainly an
option for advanced players.

# Map
I've always liked the ideas of tiles, so clear cut...
Anyway:
- The map is only revealed once you've explored it (duh moment)
- Each tile represents something different in each level

----
#Pending
The place for pending, but not yet final, ideas.

Radios game idea:

-Scrap technological advancement. Its unrealistic (requires artificial limitations to work), adds a huge load of extra work
and thus limits the cool stuff that could have otherwise been worked on. However, there will still be technological advancement,
but limited by resources rather than technology (which i guess the previous idea was about too, but you started at stone age.
which isnt fun considering most players will be playing at space age.)

-The universe is built out of players, components and planetary objects. It is simple. Everything else is built on top of that
and can be removen without any problems.

-Components are the building blocks of your empire. They are grid aligned, and are on the same grid if connected together,
but multiple grids may exist, collide and lets say dock using special components. Each component occupies some amount of grid cells.

*Components work by letting resources flow through them. They have inputs and outputs.

*Components have a function (possibly Lua) saying how to convert the inputs into outputs. If the output
goes into an input of another object, by default it will just flow there if theres room and at a rate specified by
some parameter. If the output goes into lets say the space, or a wall, the function is used to do some special thing.
An engine takes in (Signal) and outputs (Thrust). The thrust may go to a pipe for redirection. If it goes to space, the
function makes the ship move forward accordingly.

*Components can be easily added and a modding system can be implemented very easily by allowing players to create
new components. Components all work the same way from the view of the "engine" of the game, and thus are easy to implement.
Their behavior is data, not code.

*Components can be configured by the player to change some specific parameters which affect how the function works.
For example a controller object might have a sensitivity parameter. Inputs and outputs can also be specified through configuration
but are automatically set to available inputs and outputs which should be fine most of the time.

*Components can be placed anywhere and you can do anything with them. Build a ship in space, build a space station, build
a building on a planet (planets are not abstracted as spheres with properties when in space, so you have to build
on a spherical surface somehow OR make the planets be squares. Or just put some straight platforms on the surface of the planet.)

*Air inside the ship can be modeled as flowing resources, so players need airlocks and stuff.


The game is VERY simple, but allows for VERY complex behaviour (chaining of many components to make factories, building a
8 bit computer using components), just like all the other games we love. It allows building stuff, but it also has survival and
fighting and so on. Being very simple, it requires not too complex code and thus might be doable without failing it.
However, once the base is done, components can be added to improve gameplay and increase the amount of stuff you can do.
Players can create new components and if further scripting is allowed, they could even make it a land based game!

k.


My idea is superior overidea.

End of radios game idea.