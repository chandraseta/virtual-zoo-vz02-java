package virtualzoo.infrastructure;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * <p>
 * Kelas CellTest mengaplikasikan unit test pada kelas Cell.
 * </p>
 *
 * @author Rionaldi Chandraseta - 13515077
 * @version 2.0
 * @since 2.0
 */
class CellTest {

  private Cell cell1;
  private Cell cell2;

  /**
   * Inisialisasi objek Cell untuk proses test.
   */
  @Before
  public void cellSetUp() {
    cell1 = new Cell(true, "Road", "", true, false);
    cell2 = new Cell(false, "Restaurant", "Queen", false, false);
  }

  /**
   * Pengetesan getter dan setter dari kelas Cell.
   */
  @Test
  public void testGetterSetter() {
    assertTrue("Error in infrastructureAccessible()", cell1.infrastructureAccessible());
    assertFalse("Error in infrastructureAccessible()", cell2.infrastructureAccessible());
    assertEquals("Error in getType()", "Road", cell1.getType());
    assertEquals("Error in getType()", "Restaurant", cell2.getType());
    assertEquals("Error in getFacilityName()", "Queen", cell2.getFacilityName());
    assertTrue("Error in isEntrance()", cell1.isEntrance());
    assertFalse("Error in isExit()", cell2.isExit());
  }

}