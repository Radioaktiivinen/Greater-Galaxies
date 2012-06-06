Entity Naming

Variables shall begin with a lower case letter.

Constants shall begin with an upper case letter.

Functions shall begin with a lower case letter.

Types shall begin with an upper case letter.

Enumerators shall begin with an upper case letter.

Names

Use sensible, descriptive names.

Do not use short cryptic names or names based on internal jokes. It shall be easy to type a name without looking up how it is spelt.
Exception: Loop variables and variables with a small scope (less than 20 lines) may have short names to save space if the purpose of that variable is obvious.

Only use english names.

It is confusing when mixing languages for names. English is the preferred language because of its spread in the software market and because most libraries used already use english.
Use name prefixes for identifiers declared in different modules

This avoids name clashes.
Indentation and Spacing

Braces shall follow "K&R Bracing Style".

The K&R Bracing Style was first introduced in The C Programming Language by Brian Kernighan and Dennis Ritchie.
The opening brace is placed at the end of the enclosing statement and the closing brace is on a line on its own lined up with the enclosing statement. Statements and declaration between the braces are indented relative to the enclosing statement Note that the opening brace of a function body is placed on a line on its own lined up with the function declaration.

Loop and conditional statements shall always have brace enclosed sub-statements.

The code looks more consistent if all conditional and loop statements have braces.
Even if there is only a single statement after the condition or loop statement today, there might be a need for more code in the future.

Braces without any contents may be placed on the same line.

The only time when two braces can occur on the same line is when they do not contain any code.
<pre>while (...)
{}</pre>
Each statement shall be placed on a line on its own.

There is no need to make code compact. Putting several statements on the same line only makes the code cryptic to read.
Declare each variable in a separate declaration.

This makes it easier to see all variables.
Lines shall not exceed 80 characters.

Even if your editor handles long lines, other people may have set up their editors differently. Long lines in the code may also cause problems for other programs and printers.
Comments

Comments shall be written in english

Use JavaDoc style comments.

The comment styles /// and /** ... */ are used by JavaDoc, Doxygen and some other code documenting tools.
All comments shall be placed above the line the comment describes, indented identically.

Being consistent on placement of comments removes any question on what the comment refers to.
Every class shall have a comment that describes its purpose.

Every function shall have a comment that describes its purpose.

Declarations

Do not use global variables.

Global variables are initialised when the program starts whether it will be used or not.
If global variables are using other global variables for their initialisation there may be a problem if the dependent variables are not initialised yet. The initialisation order of global variables in different object files is not defined.

The parts of a class definition must be public, protected and private.

This makes it easy to read the class definition as the public interface is of interest to most readers.
Statements

All switch statements shall have a default label.

Even if there is no action for the default label, it shall be included to show that the programmer has considered values not covered by case labels. If the case labels cover all possibilities, it is useful to put an assertion there to document the fact that it is impossible to get here. An assertion also protects from a future situation where a new possibility is introduced by mistake.
Other Typographical Issues

Do not use literal numbers other than 0 and 1.

Use constants instead of literal numbers to make the code consistent and easy to maintain. The name of the constant is also used to document the purpose of the number.
Use plenty of assertions.

Assertions are useful to verify pre-conditions, post-conditions and any other conditions that should never happen. Pre-conditions are useful to verify that functions are called with valid arguments. They are also useful as documentation of what argument value ranges a function is designed to work with.