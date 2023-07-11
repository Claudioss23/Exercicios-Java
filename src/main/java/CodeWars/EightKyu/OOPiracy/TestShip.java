package CodeWars.EightKyu.OOPiracy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestShip {
    
    @Test
    void emptyShipShouldNotWorthToAboard() {
        Ship ship = new Ship(0 , 0);
        assertFalse(ship.isWorthIt(), "<draft: 0, crew: 0>");
    }
    
    @Test
    void shipWithLotOfBootyWorthToAboard() {
        Ship ship = new Ship(40 , 5);
        assertTrue(ship.isWorthIt(), "<draft: 40, crew: 5>");
    }
}