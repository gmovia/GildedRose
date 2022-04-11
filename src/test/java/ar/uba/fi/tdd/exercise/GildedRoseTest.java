package ar.uba.fi.tdd.exercise;

import ar.uba.fi.tdd.exercise.Item.Item;
import ar.uba.fi.tdd.exercise.Item.ItemFactory;
import ar.uba.fi.tdd.exercise.Maker.Maker;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class GildedRoseTest {

	private static final String NAME_ITEM = "Item";
	private static final String NAME_BRIE = "Aged Brie";
	private static final String NAME_SULFURAS = "Sulfuras, Hand of Ragnaros";
	private static final String NAME_BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";
	private static final String NAME_CONJURED = "Conjured";
	Item[] items = new Item[1];

	@Test
	public void test01SeAgregaUnItemNormalConSellIn10yQuality10luegoDeUnDiaTieneQuality9() {
		Item item = new Item(NAME_ITEM, 10, 10);
		items[0] = item;
		GildedRose app = new GildedRose(items);

		app.updateQuality();

		assertEquals(9, item.quality);
	}

	@Test
	public void test02SeAgregaunItemNormalConSellIn10yQuality10LuegoDeUnUpdateTieneSellIn9() {
		Item item = new Item(NAME_ITEM, 10, 10);
		items[0] = item;
		GildedRose app = new GildedRose(items);

		app.updateQuality();

		assertEquals(9, item.sellIn);
	}

	@Test
	public void test03SeAgregaUnItemNormalConSellIn1yQuality10LuegoDeUnUpdatePoseeQuality8() {
		Item item = new Item(NAME_ITEM, 1, 10);
		items[0] = item;
		GildedRose app = new GildedRose(items);

		app.updateQuality();

		assertEquals(8, item.quality);
	}

	@Test
	public void test04SeAgregaUnQuesoBrieConQuality15yLuegoDeUnUpdatePoseeQuality16() {
		Item item = new Item(NAME_BRIE, 9, 15);
		items[0] = item;
		GildedRose app = new GildedRose(items);

		app.updateQuality();

		assertEquals(16, item.quality);
	}

	@Test
	public void test05seAgregaUnQuesoBrieConSellIn12YLuegoDeUnUpdateDisminuyeEnUnaUnidad() {
		Item item = new Item(NAME_BRIE, 12, 15);
		items[0] = item;
		GildedRose app = new GildedRose(items);

		app.updateQuality();

		assertEquals(11, item.sellIn);
	}

	@Test
	public void test06seAgregaBackstagePassesConSellIn16yQuality9yLuegoDeUnUpdatePoseeQuality10() {
		Item item = new Item(NAME_BACKSTAGE, 16, 9);
		items[0] = item;
		GildedRose app = new GildedRose(items);

		app.updateQuality();

		assertEquals(10, item.quality);
	}

	@Test
	public void test07seAgregaBackstagePassesConSellIn9yQuality12yLuegoDeUnUpdatePoseeQuality14() {
		Item item = new Item(NAME_BACKSTAGE, 9, 12);
		items[0] = item;
		GildedRose app = new GildedRose(items);

		app.updateQuality();

		assertEquals(14, item.quality);
	}

	@Test
	public void test08seAgregaBackstagePassesConSellIn4yQuality21yLuegoDeUnUpdatePoseeQuality24() {
		Item item = new Item(NAME_BACKSTAGE, 4, 21);
		items[0] = item;
		GildedRose app = new GildedRose(items);

		app.updateQuality();

		assertEquals(24, item.quality);
	}

	@Test
	public void test09seAgregaBackstagePassesConSellIn1yQuality35yLuegoDeUnUpdatePoseeQuality0() {
		Item item = new Item(NAME_BACKSTAGE, 1, 35);
		items[0] = item;
		GildedRose app = new GildedRose(items);

		app.updateQuality();

		assertEquals(0, item.quality);
	}

	@Test
	public void test10seAgregaSulfureQualityYLuegoDeUnUpdatePoseeQualityConstante() {
		Item item = new Item(NAME_SULFURAS, 2, 80);
		items[0] = item;
		GildedRose app = new GildedRose(items);

		int quality = item.quality;

		app.updateQuality();

		assertEquals(quality, item.quality);
	}

	@Test
	public void test11seAgregaUnItemNormalConSellIn4yQuality10yLuegoDe6UpdatePoseeQuality1() {
		Item item = new Item(NAME_ITEM, 4, 10);
		items[0] = item;
		GildedRose app = new GildedRose(items);

		for (int day = 0; day < 6; day++) {
			app.updateQuality();
		}

		assertEquals(1, item.quality);
	}

	@Test
	public void test12seAgregaUnQuesoBrieConSellIn3yQuality12yLuegoDe7UpdatePoseeQuality19() {
		Item item = new Item(NAME_BRIE, 3, 12);
		items[0] = item;
		GildedRose app = new GildedRose(items);

		for (int day = 0; day < 7; day++) {
			app.updateQuality();
		}

		assertEquals(19, item.quality);
	}

	@Test
	public void test13seAgregaBackstagePassesConSellIn12yQuality15yLuegoDe5UpdatePoseeQuality24() {
		Item item = new Item(NAME_BACKSTAGE, 12, 15);
		items[0] = item;
		GildedRose app = new GildedRose(items);

		for (int day = 0; day < 5; day++) {
			app.updateQuality();
		}

		assertEquals(24, item.quality);
	}

	@Test
	public void test14seAgregaBackstagePassesConSellIn13yQuality21yLuegoDe9UpdatePoseeQuality39() {
		Item item = new Item(NAME_BACKSTAGE, 13, 21);
		items[0] = item;
		GildedRose app = new GildedRose(items);

		for (int day = 0; day < 9; day++) {
			app.updateQuality();
		}

		assertEquals(39, item.quality);
	}

	@Test
	public void test14seAgregaBackstagePassesConSellIn12yQuality16yLuegoDe11UpdatePoseeQuality42() {
		Item item = new Item(NAME_BACKSTAGE, 12, 16);
		items[0] = item;
		GildedRose app = new GildedRose(items);

		for (int day = 0; day < 11; day++) {
			app.updateQuality();
		}

		assertEquals(42, item.quality);
	}

	@Test
	public void test15seAgregaBackstagePassesConSellIn12yQuality16yLuegoDe12UpdatePoseeQuality0() {
		Item item = new Item(NAME_BACKSTAGE, 12, 16);
		items[0] = item;
		GildedRose app = new GildedRose(items);

		for (int day = 0; day < 12; day++) {
			app.updateQuality();
		}

		assertEquals(0, item.quality);
	}

	@Test
	public void test16seAgregaBackstagePassesConSellIn12yQuality16yLuegoDe21UpdatePoseeQuality0() {
		Item item = new Item(NAME_BACKSTAGE, 12, 16);
		items[0] = item;
		GildedRose app = new GildedRose(items);

		for (int day = 0; day < 21; day++) {
			app.updateQuality();
		}

		assertEquals(0, item.quality);
	}

	@Test
	public void test17seAgregaSulfureQualityYLuegoDe12UpdateNoSeModificaSuQuality() {
		Item item = new Item(NAME_SULFURAS, 12, 80);
		items[0] = item;
		GildedRose app = new GildedRose(items);


		int quality = item.quality;

		for (int day = 0; day < 12; day++) {
			app.updateQuality();
		}

		assertEquals(quality, item.quality);
	}

	@Test
	public void test18seAgregaUnItemNormalConSellIn3yQuality0YLuegoDeUnUpdatePoseeQuality0() {
		Item item = new Item(NAME_ITEM, 3, 0);
		items[0] = item;
		GildedRose app = new GildedRose(items);

		app.updateQuality();

		assertEquals(0, item.quality);
	}

	@Test
	public void test19seAgregaUnItemNormalConSellIn3yQuality5YLuegoDe6UpdatePoseeQuality0() {
		Item item = new Item(NAME_ITEM, 3, 5);
		items[0] = item;
		GildedRose app = new GildedRose(items);

		for (int day = 0; day < 6; day++) {
			app.updateQuality();
		}

		assertEquals(0, item.quality);
	}

	@Test
	public void test20seAgregaUnQuesoBrieConSellIn5yQuality49YLuegoDUpdatePoseeQuality50() {
		Item item = new Item(NAME_BRIE, 5, 49);
		items[0] = item;
		GildedRose app = new GildedRose(items);

		for (int day = 0; day < 1; day++) {
			app.updateQuality();
		}

		assertEquals(50, item.quality);
	}

	@Test
	public void test21seAgregaUnQuesoBrieConSellIn5yQuality50YLuegoDeUpdatePoseeQuality50() {
		Item item = new Item(NAME_BRIE, 5, 50);
		items[0] = item;
		GildedRose app = new GildedRose(items);

		for (int day = 0; day < 1; day++) {
			app.updateQuality();
		}

		assertEquals(50, item.quality);
	}

	@Test
	public void test22seAgregaUnQuesoBrieConSellIn5yQuality50YLuego4UpdatePoseeQuality50() {
		Item item = new Item(NAME_BRIE, 5, 50);
		items[0] = item;
		GildedRose app = new GildedRose(items);

		for (int day = 0; day < 5; day++) {
			app.updateQuality();
		}

		assertEquals(50, item.quality);
	}

	@Test
	public void test23seAgregaUnBackstagePaseConSellIn12yQuality47YLuego4UpdatePoseeQuality50() {
		Item item = new Item(NAME_BACKSTAGE, 12, 47);
		items[0] = item;
		GildedRose app = new GildedRose(items);

		for (int day = 0; day < 4; day++) {
			app.updateQuality();
		}

		assertEquals(50, item.quality);
	}

	@Test
	public void test24seAgregaUnBackstagePaseConSellIn12yQuality35YLuego8UpdatePoseeQuality50() {
		Item item = new Item(NAME_BACKSTAGE, 12, 35);
		items[0] = item;
		GildedRose app = new GildedRose(items);

		for (int day = 0; day < 8; day++) {
			app.updateQuality();
		}

		assertEquals(50, item.quality);
	}

	@Test
	public void test25seAgregaUnItemConjuradoConSellIn4yQuality20YLuegoDe2UpdatePoseeQuality16(){
		Item item = new Item(NAME_CONJURED, 4, 20);
		items[0] = item;
		GildedRose app = new GildedRose(items);

		for (int day = 0; day < 2; day++) {
			app.updateQuality();
		}

		assertEquals(16, item.quality);
	}

	@Test
	public void test26seAgregaUnItemConjuradoConSellIn4yQuality20YLuegoDe3UpdatePoseeQuality14(){
		Item item = new Item(NAME_CONJURED, 4, 20);
		items[0] = item;
		GildedRose app = new GildedRose(items);

		for (int day = 0; day < 3; day++) {
			app.updateQuality();
		}

		assertEquals(14, item.quality);
	}

	@Test
	public void test27seAgregaUnItemConjuradoConSellIn4yQuality20YLuegoDe6UpdatePoseeQuality2(){
		Item item = new Item(NAME_CONJURED, 4, 20);
		items[0] = item;
		GildedRose app = new GildedRose(items);

		for (int day = 0; day < 6; day++) {
			app.updateQuality();
		}

		assertEquals(2, item.quality);
	}

	@Test
	public void test28seAgregaUnItemConjuradoConSellIn4yQuality20YLuegoDe9UpdatePoseeQuality0(){
		Item item = new Item(NAME_CONJURED, 4, 20);
		items[0] = item;
		GildedRose app = new GildedRose(items);

		for (int day = 0; day < 8; day++) {
			app.updateQuality();
		}

		assertEquals(0, item.quality);
	}


}
