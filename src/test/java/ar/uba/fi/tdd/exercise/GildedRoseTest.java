package ar.uba.fi.tdd.exercise;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class GildedRoseTest {

	@Test
	public void test01SeAgregaUnItemNormalConSellIn10yQuality10luegoDeUnDiaTieneQuality9(){
		Item item = new Item("item", 10, 10, new Standard());
		GildedRose app = new GildedRose();

		app.add(item);
		app.updateQuality();

		assertEquals(9, item.getQuality());
	}

	@Test
	public void test02SeAgregaunItemNormalConSellIn10yQuality10LuegoDeUnDiaTieneSellIn9(){
		Item item = new Item("item", 10, 10, new Standard());
		GildedRose app = new GildedRose();

		app.add(item);
		app.updateQuality();

		assertEquals(9, item.getSellIn());
	}

	@Test
	public void test03SeAgregaUnItemNormalConSellIn1yQuality10LuegoDeUnDiaPoseeQuality8(){
		Item item = new Item("item", 1, 10, new Standard());
		GildedRose app = new GildedRose();

		app.add(item);
		app.updateQuality();

		assertEquals(8, item.getQuality());
	}

	@Test
	public void test04SeAgregaUnQuesoBrieConQuality15yLuegoDeUnDiaPoseeQuality16(){
		Item item = new Item("Queso brie", 9, 15, new Brie());
		GildedRose app = new GildedRose();

		app.add(item);
		app.updateQuality();

		assertEquals(16, item.getQuality());
	}

}
