package ar.uba.fi.tdd.exercise;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class GildedRoseTest {

	@Test
	public void foo() {
			Item[] items = new Item[] { new Item("fixme", 0, 0) };
			GildedRose app = new GildedRose(items);
			app.updateQuality();
			assertThat("fixme").isEqualTo(app.items[0].Name);
	}

}
