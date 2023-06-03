package ranlib;
import java.util.HashMap;
import java.util.Map;

/**
 * <p><u><b>Class Name:</b></u></p>
 * <p>Turing</p>
 *
 * <p><u><b>Description:</b></u></p>
 * <p>The Turing class represents a Turing machine. It provides functionality to define transitions, set the tape input, and execute the Turing machine.</p>
 *
 * <p><u><b>Instance Variables:</b></u></p>
 * <p><code>transitions</code>: A map that stores the transitions of the Turing machine. The keys are StateSymbolPair objects representing the current state and read symbol, and the values are Transition objects representing the next state, write symbol, and direction.</p>
 * <p><code>currentState</code>: A string representing the current state of the Turing machine.</p>
 * <p><code>tapePosition</code>: An integer representing the current position on the tape.</p>
 * <p><code>tape</code>: A StringBuilder representing the tape of the Turing machine.</p>
 *
 * <p><u><b>Constructor:</b></u></p>
 * <p><code>Turing()</code>: Initializes the Turing machine by creating an empty transitions map, setting the current state to "q0", setting the tape position to 0, and creating an empty tape using a StringBuilder.</p>
 *
 * <p><u><b>Methods:</b></u></p>
 * <p><code>addTransition(String state, char readSymbol, String nextState, char writeSymbol, char direction)</code>: Adds a transition to the Turing machine. It takes the current state, read symbol, next state, write symbol, and direction as input and adds the transition to the transitions map.</p>
 * <p><code>setTape(String input)</code>: Sets the contents of the tape by taking a string input and initializing the tape using a StringBuilder.</p>
 * <p><code>run()</code>: Executes the Turing machine. It iterates until there is no transition available for the current state and read symbol. In each iteration, it retrieves the corresponding transition from the transitions map, updates the current state, writes the new symbol on the tape, and adjusts the tape position based on the direction.</p>
 * <p><code>getTapeContents()</code>: Returns the current contents of the tape as a string.</p>
 * <p><code>equals(Object obj)</code>: Overrides the equals() method to compare two TuringMachine objects for equality based on their transitions, currentState, tapePosition, and tape.</p>
 * <p><code>hashCode()</code>: Overrides the hashCode() method to generate a hash code for a TuringMachine object based on its transitions, currentState, tapePosition, and tape.</p>
 *
 * <p><u><b>Internal Classes:</b></u></p>
 * <p>StateSymbolPair: Represents a combination of the current state and read symbol. It is used as a key in the transitions map. It overrides the equals() and hashCode() methods for comparison and hashing.</p>
 * <p>Transition: Represents a transition of the Turing machine. It contains the information about the next state, write symbol, and direction.</p>
 *
 * <p><u><b>Main Method:</b></u></p>
 * <p><code>main(String[] args)</code>: The entry point of the program. It is used for testing the TuringMachine class. It creates an instance of TuringMachine, adds some example transitions, sets the tape input, runs the Turing machine, and prints the final tape contents.</p>
 *
 * <p>It's important to note that the Turing machine is a theoretical model of computation and has limitations in practical applications. It can simulate any algorithmic process but may not be efficient for certain problems.</p>
 *
 * <p><u><b>License:</b></u></p>
 * <p>Version 1.0</p>
 * <p>2023/06/03</p>
 * <p>Attribution: <a href="https://creativecommons.org/licenses/by/4.0/">CC BY</a></p>
 * <p>Adrian Morgenthal <a href="https://github.com/Voraxx">Github</a></p>
 */


public class Turing {
    // The map of transitions
    private Map<StateSymbolPair, Transition> transitions;
    // The current state of the Turing machine
    private String currentState;
    // The current position on the tape
    private int tapePosition;
    // The tape of the Turing machine
    private StringBuilder tape;

    public Turing() {
        // Initialization of data structures
        transitions = new HashMap<>();
        currentState = "q0";
        tapePosition = 0;
        tape = new StringBuilder();
    }

    // Method for adding a transition
    public void addTransition(String state, char readSymbol, String nextState, char writeSymbol, char direction) {
        transitions.put(new StateSymbolPair(state, readSymbol), new Transition(nextState, writeSymbol, direction));
    }

    // Method for setting the tape contents
    public void setTape(String input) {
        tape = new StringBuilder(input);
    }

    // Method for running the Turing machine
    public void run() {
        while (true) {
            // Read the current symbol on the tape
            char currentSymbol = tapePosition < tape.length() ? tape.charAt(tapePosition) : ' ';
            // Store the current state and read symbol as a pair
            StateSymbolPair pair = new StateSymbolPair(currentState, currentSymbol);

            // Check if there is a transition for the pair
            if (!transitions.containsKey(pair)) {
                // If not, break the execution
                break;
            }

            // Get the corresponding transition
            Transition transition = transitions.get(pair);
            // Update the state
            currentState = transition.getNextState();
            // Update the symbol on the tape
            tape.setCharAt(tapePosition, transition.getWriteSymbol());

            // Perform the tape movement
            if (transition.getDirection() == 'L') {
                // Move left
                tapePosition--;
                if (tapePosition < 0) {
                    // If the position is outside the tape, add a blank space and set position 0
                    tape.insert(0, ' ');
                    tapePosition = 0;
                }
            } else if (transition.getDirection() == 'R') {
                // Move right
                tapePosition++;
                if (tapePosition >= tape.length()) {
                    // If the position is outside the tape, add a blank space
                    tape.append(' ');
                }
            }
        }
    }

    // Method for getting the tape contents
    public String getTapeContents() {
        return tape.toString();
    }

    // Internal class to combine the state and read symbol as a pair
    private static class StateSymbolPair {
        private String state;
        private char symbol;

        public StateSymbolPair(String state, char symbol) {
            this.state = state;
            this.symbol = symbol;
        }

        // Override the equals() method for use as a key in the map
        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            StateSymbolPair other = (StateSymbolPair) obj;
            return state.equals(other.state) && symbol == other.symbol;
        }

        // Override the hashCode() method for use as a key in the map
        @Override
        public int hashCode() {
            return 31 * state.hashCode() + symbol;
        }
    }

    // Internal class to represent a transition
    private static class Transition {
        private String nextState;
        private char writeSymbol;
        private char direction;

        public Transition(String nextState, char writeSymbol, char direction) {
            this.nextState = nextState;
            this.writeSymbol = writeSymbol;
            this.direction = direction;
        }

        public String getNextState() {
            return nextState;
        }

        public char getWriteSymbol() {
            return writeSymbol;
        }

        public char getDirection() {
            return direction;
        }
    }

    // Main method for testing the Turing machine
    public static void main(String[] args) {
        // Create a Turing machine
        Turing tm = new Turing();

        // Add example transitions
        tm.addTransition("q0", '0', "q1", '1', 'R');
        tm.addTransition("q1", '1', "q0", '0', 'R');
        tm.addTransition("q0", ' ', "halt", ' ', 'N');

        // Set the tape input
        tm.setTape("00110011");

        // Run the Turing machine
        tm.run();

        // Print the tape contents
        System.out.println(tm.getTapeContents());
    }
}
