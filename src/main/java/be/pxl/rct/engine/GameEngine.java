package be.pxl.rct.engine;

public class GameEngine {

    private boolean running = true;

    public void start() {
        // It is allowed to change the ASCII art
        System.out.println("\n" +
                " .----------------.  .----------------.  .----------------.     .----------------.  .----------------.  .----------------. \n" +
                "| .--------------. || .--------------. || .--------------. |   | .--------------. || .--------------. || .--------------. |\n" +
                "| |   ______     | || |  ____  ____  | || |   _____      | |   | |  _______     | || |     ______   | || |  _________   | |\n" +
                "| |  |_   __ \\   | || | |_  _||_  _| | || |  |_   _|     | |   | | |_   __ \\    | || |   .' ___  |  | || | |  _   _  |  | |\n" +
                "| |    | |__) |  | || |   \\ \\  / /   | || |    | |       | |   | |   | |__) |   | || |  / .'   \\_|  | || | |_/ | | \\_|  | |\n" +
                "| |    |  ___/   | || |    > `' <    | || |    | |   _   | |   | |   |  __ /    | || |  | |         | || |     | |      | |\n" +
                "| |   _| |_      | || |  _/ /'`\\ \\_  | || |   _| |__/ |  | |   | |  _| |  \\ \\_  | || |  \\ `.___.'\\  | || |    _| |_     | |\n" +
                "| |  |_____|     | || | |____||____| | || |  |________|  | |   | | |____| |___| | || |   `._____.'  | || |   |_____|    | |\n" +
                "| |              | || |              | || |              | |   | |              | || |              | || |              | |\n" +
                "| '--------------' || '--------------' || '--------------' |   | '--------------' || '--------------' || '--------------' |\n" +
                " '----------------'  '----------------'  '----------------'     '----------------'  '----------------'  '----------------' \n");
    }


    /**
     * Handles the cli commands given by the player.
     *
     * @param command a command.
     */
    public void executeCommand(String command) {
        if (command.startsWith("quit")) {
            running = false;
        }
        // TODO: implement this method
    }

    public boolean isRunning() {
        return running;
    }
}