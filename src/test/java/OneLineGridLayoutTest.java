import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Class to test one line grid layout.
 *
 * @author lumiha
 * @since 10/06/15.
 */
public class OneLineGridLayoutTest {

    private OneLineGridLayout oneLineGridLayout;

    @Before
    public void setUp() {
        oneLineGridLayout = new OneLineGridLayout(new Grid());
    }

    @Test
    public void emptyGridPrintsLineOf9Blanks() {
        final String result = oneLineGridLayout.formatGrid();
        assertThat(result, is("         "));
    }
}
