package ar.uba.fi.tdd.exercise;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class GildedRoseTest {

	@Test
	public void test01UnItemNormalConSellIn10yQuality10luegoDeUnDiaTieneQuality9(){
		Item item = new Item("item", 10, 10);
		GildedRose app = new GildedRose();

		app.add(item);
		app.updateQuality();

		assertEquals(9, item.getQuality());
	}

	@Test
	public void test02unItemNormalConSellIn10yQuality10LuegoDeUnDiaTieneSellIn9(){
		Item item = new Item("item", 10, 10);
		GildedRose app = new GildedRose();

		app.add(item);
		app.updateQuality();

		assertEquals(9, item.getSellIn());
	}



}
