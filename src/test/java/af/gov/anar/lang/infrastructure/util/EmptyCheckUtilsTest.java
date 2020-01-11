package af.gov.anar.lang.infrastructure.util;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.*;
import java.util.stream.IntStream;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class EmptyCheckUtilsTest {

	@BeforeClass
	public static void setup() {

	}

	@Test
	public void isNullEmptyObjectTest() {
		Date d = null;
		assertTrue(EmptyCheckUtils.isNullEmpty(d));
	}

	@Test
	public void isNullEmptyStringTest() {
		String str = null;
		assertTrue(EmptyCheckUtils.isNullEmpty(""));
		assertTrue(EmptyCheckUtils.isNullEmpty("   "));
		assertTrue(EmptyCheckUtils.isNullEmpty(str));
		assertFalse(EmptyCheckUtils.isNullEmpty(" jfashd kjasdkjf"));
	}

	@Test
	public void isNullEmptyCollectionTest() {
		List<String> strings = null;
		Set<String> stringSet = new HashSet<>();
		List<String> names = new ArrayList<>();
		IntStream.of(10).forEach(i -> names.add("name : " + i));
		assertTrue(EmptyCheckUtils.isNullEmpty(strings));
		assertTrue(EmptyCheckUtils.isNullEmpty(stringSet));
		assertFalse(EmptyCheckUtils.isNullEmpty(names));
	}

	@Test
	public void isNullEmptyMapTest() {
		Map<Integer, String> nameRollMapp = null;
		Map<Integer, String> nameNumberMapp = new HashMap<>();
		Map<Integer, String> nameStateMapp = new HashMap<>();
		IntStream.of(10).forEach(i -> nameStateMapp.put(i, "State code : " + i));

		assertTrue(EmptyCheckUtils.isNullEmpty(nameRollMapp));
		assertTrue(EmptyCheckUtils.isNullEmpty(nameNumberMapp));
		assertFalse(EmptyCheckUtils.isNullEmpty(nameStateMapp));
	}

}
