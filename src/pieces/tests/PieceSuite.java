package pieces.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ BishopTest.class, KingTest.class, KnightTest.class,
		PawnTest.class, QueenTest.class, RookTest.class })
public class PieceSuite {

}
