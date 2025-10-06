package oop.classes;

import java.util.logging.Logger;

/**
 * Inheritance.
 */
class ChessDemo {

    Logger logger = Logger.getLogger(getClass().getName());

    // cannot be overridden
    final ChessPlayer getFirstPlayer() {
        return ChessPlayer.WHITE;
    }

    public static void main(String[] args) {

        ChessDemo demo = new ChessDemo();

        ChessPlayer firstPlayer = demo.getFirstPlayer();

        // string representation of the object
        String log = "Player 1 / " + firstPlayer.toString();
        demo.logger.info(log);

        // hash code value for the object
        log = "Hash 1 / " + firstPlayer.hashCode();
        demo.logger.info(log);

        ChessPlayer secondPlayer = ChessPlayer.BLACK;

        log = "Player 2 / " + secondPlayer;
        demo.logger.info(log);

        log = "Hash 2 / " + secondPlayer.hashCode();
        demo.logger.info(log);
    }
}
