
package af.gov.anar.lang.infrastructure.util;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class IdChecksumTest {

	@Test
	public void checksumTest() {
		String id = "1234567890";
		String checkSum = ChecksumUtils.generateChecksumDigit(id);
		String finalId = id + checkSum;
		boolean res = ChecksumUtils.validateChecksum(finalId);
		assertThat(res, is(true));
	}

	@Test
	public void checksumFailTest() {
		String id = "1234567891";
		boolean res = ChecksumUtils.validateChecksum(id);
		assertThat(res, is(false));
	}

}
