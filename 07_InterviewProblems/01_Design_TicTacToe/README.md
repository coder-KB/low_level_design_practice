Created Enum for Symbols (X, O, Empty) and Game State (IN_PROGRESS, XWON, OWON, DRAW)

For Player, Created a Player Strategy, For now, it will be Human Strategy for reading input and making move (But later can be extended to AI Strategy as well)

Position Object to store row and column where the Symbol has to be placed

Board will have the functionality like making move, checking valid move, printing board, checking winning state

TicTacToeGame will take care of the game where the board will be printed and then input will be taken and winning check will be called and finally announcing the result.