package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;
import static org.assertj.core.api.Assertions.*;

class BishopBlackTest {

    @Test
    void whenPositionTrue() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A3);
        assertThat(bishopBlack.position()).isEqualTo(Cell.A3);
    }

    @Test
    void whenCopyTrue() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A3);
        assertThat(bishopBlack.copy(Cell.A3).position()).isEqualTo(Cell.A3);
    }


    @Test
    void way() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] expected = new Cell[] {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        Cell[] out = bishopBlack.way(Cell.G5);
        assertThat(out).isEqualTo(expected);
    }
}