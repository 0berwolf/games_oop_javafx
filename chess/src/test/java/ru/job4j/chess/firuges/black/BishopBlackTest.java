package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

class BishopBlackTest {

    @Test
    void bishopBlackPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.F8);
        bishopBlack.position();
        assertThat((bishopBlack.position()), is(Cell.F8));
    }

    @Test
    void bishopBlackCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.F8);
        Figure sample = bishopBlack.copy(Cell.F8);
        assertThat(bishopBlack.position(), is(sample.position()));
    }

    @Test
    public void bishopBlackWay() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] steps = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(steps, is(bishopBlack.way(Cell.G5)));
    }

    @Test
    public void bishopBlackIsDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        bishopBlack.way(Cell.G4);
        assertThat(bishopBlack.way(Cell.G4), is(Cell.C1));
    }
}