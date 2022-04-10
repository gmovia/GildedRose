package ar.uba.fi.tdd.exercise;

import ar.uba.fi.tdd.exercise.Maker.Maker;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class GildedRoseTest {

	Maker maker = new Maker();

	@Test
	public void test01SeAgregaUnItemNormalConSellIn10yQuality10luegoDeUnDiaTieneQuality9() {
		Item item = maker.buildItemStandard("item", 10, 10);
		GildedRose app = new GildedRose();

		app.add(item);
		app.updateQuality();

		assertEquals(9, item.getQuality());
	}

	@Test
	public void test02SeAgregaunItemNormalConSellIn10yQuality10LuegoDeUnUpdateTieneSellIn9() {
		Item item = maker.buildItemStandard("item", 10, 10);
		GildedRose app = new GildedRose();

		app.add(item);
		app.updateQuality();

		assertEquals(9, item.getSellIn());
	}

	@Test
	public void test03SeAgregaUnItemNormalConSellIn1yQuality10LuegoDeUnUpdatePoseeQuality8() {
		Item item = maker.buildItemStandard("item", 1, 10);
		GildedRose app = new GildedRose();

		app.add(item);
		app.updateQuality();

		assertEquals(8, item.getQuality());
	}

	@Test
	public void test04SeAgregaUnQuesoBrieConQuality15yLuegoDeUnUpdatePoseeQuality16() {
		Item item = maker.buildAgedBrie(9, 15);
		GildedRose app = new GildedRose();

		app.add(item);
		app.updateQuality();

		assertEquals(16, item.getQuality());
	}

	@Test
	public void test05seAgregaUnQuesoBrieConSellIn12YLuegoDeUnUpdateDisminuyeEnUnaUnidad() {
		Item item = maker.buildAgedBrie(12, 15);
		GildedRose app = new GildedRose();

		app.add(item);
		app.updateQuality();

		assertEquals(11, item.getSellIn());
	}

	@Test
	public void test06seAgregaBackstagePassesConSellIn16yQuality9yLuegoDeUnUpdatePoseeQuality10() {
		Item item = maker.buildBackstagePasses(16, 9);
		GildedRose app = new GildedRose();

		app.add(item);
		app.updateQuality();

		assertEquals(10, item.getQuality());
	}

	@Test
	public void test07seAgregaBackstagePassesConSellIn9yQuality12yLuegoDeUnUpdatePoseeQuality14() {
		Item item = maker.buildBackstagePasses(9, 12);
		GildedRose app = new GildedRose();

		app.add(item);
		app.updateQuality();

		assertEquals(14, item.getQuality());
	}

	@Test
	public void test08seAgregaBackstagePassesConSellIn4yQuality21yLuegoDeUnUpdatePoseeQuality24() {
		Item item = maker.buildBackstagePasses(4, 21);
		GildedRose app = new GildedRose();

		app.add(item);
		app.updateQuality();

		assertEquals(24, item.getQuality());
	}

	@Test
	public void test09seAgregaBackstagePassesConSellIn1yQuality35yLuegoDeUnUpdatePoseeQuality0() {
		Item item = maker.buildBackstagePasses(1, 35);
		GildedRose app = new GildedRose();

		app.add(item);
		app.updateQuality();

		assertEquals(0, item.getQuality());
	}

	@Test
	public void test10seAgregaSulfureQualityyLuegoDeUnUpdatePoseeQualityConstante() {
		Item item = maker.buildSulfure();
		GildedRose app = new GildedRose();

		int quality = item.getQuality();

		app.add(item);
		app.updateQuality();

		assertEquals(quality, item.getQuality());
	}

	@Test
	public void test11seAgregaUnItemNormalConSellIn4yQuality10yLuegoDe6UpdatePoseeQuality1() {
		Item item = maker.buildItemStandard("item", 4, 10);
		GildedRose app = new GildedRose();

		app.add(item);

		for (int day = 0; day < 6; day++) {
			app.updateQuality();
		}

		assertEquals(1, item.getQuality());
	}

	@Test
	public void test12seAgregaUnQuesoBrieConSellIn3yQuality12yLuegoDe7UpdatePoseeQuality19() {
		Item item = maker.buildAgedBrie(3, 12);
		GildedRose app = new GildedRose();

		app.add(item);

		for (int day = 0; day < 7; day++) {
			app.updateQuality();
		}

		assertEquals(19, item.getQuality());
	}

	@Test
	public void test13seAgregaBackstagePassesConSellIn12yQuality15yLuegoDe5UpdatePoseeQuality24() {
		Item item = maker.buildBackstagePasses(12, 15);
		GildedRose app = new GildedRose();

		app.add(item);

		for (int day = 0; day < 5; day++) {
			app.updateQuality();
		}

		assertEquals(24, item.getQuality());
	}

	@Test
	public void test14seAgregaBackstagePassesConSellIn13yQuality21yLuegoDe9UpdatePoseeQuality39() {
		Item item = maker.buildBackstagePasses(13, 21);
		GildedRose app = new GildedRose();

		app.add(item);

		for (int day = 0; day < 9; day++) {
			app.updateQuality();
		}

		assertEquals(39, item.getQuality());
	}

	@Test
	public void test14seAgregaBackstagePassesConSellIn12yQuality16yLuegoDe11UpdatePoseeQuality42() {
		Item item = maker.buildBackstagePasses(12, 16);
		GildedRose app = new GildedRose();

		app.add(item);

		for (int day = 0; day < 11; day++) {
			app.updateQuality();
		}

		assertEquals(42, item.getQuality());
	}

	@Test
	public void test15seAgregaBackstagePassesConSellIn12yQuality16yLuegoDe12UpdatePoseeQuality0() {
		Item item = maker.buildBackstagePasses(12, 16);
		GildedRose app = new GildedRose();

		app.add(item);

		for (int day = 0; day < 12; day++) {
			app.updateQuality();
		}

		assertEquals(0, item.getQuality());
	}

	@Test
	public void test16seAgregaBackstagePassesConSellIn12yQuality16yLuegoDe21UpdatePoseeQuality0() {
		Item item = maker.buildBackstagePasses(12, 16);
		GildedRose app = new GildedRose();

		app.add(item);

		for (int day = 0; day < 21; day++) {
			app.updateQuality();
		}

		assertEquals(0, item.getQuality());
	}

	@Test
	public void test17seAgregaSulfureQualityyLuegoDe12UpdateNoSeModificaSuQuality() {
		Item item = maker.buildSulfure();
		GildedRose app = new GildedRose();

		int quality = item.getQuality();

		app.add(item);

		for (int day = 0; day < 12; day++) {
			app.updateQuality();
		}

		assertEquals(quality, item.getQuality());
	}

	@Test
	public void test18seAgregaUnItemNormalConSellIn3yQuality0YLuegoDeUnUpdatePoseeQuality0() {
		Item item = maker.buildItemStandard("item", 3, 0);
		GildedRose app = new GildedRose();

		app.add(item);
		app.updateQuality();


		assertEquals(0, item.getQuality());
	}

	@Test
	public void test19seAgregaUnItemNormalConSellIn3yQuality5YLuegoDe6UpdatePoseeQuality0() {
		Item item = maker.buildItemStandard("item", 3, 5);
		GildedRose app = new GildedRose();

		app.add(item);

		for (int day = 0; day < 6; day++) {
			app.updateQuality();
		}

		assertEquals(0, item.getQuality());
	}

	@Test
	public void test20seAgregaUnQuesoBrieConSellIn5yQuality49YLuegoDUpdatePoseeQuality50() {
		Item item = maker.buildAgedBrie(5, 49);
		GildedRose app = new GildedRose();

		app.add(item);

		for (int day = 0; day < 1; day++) {
			app.updateQuality();
		}

		assertEquals(50, item.getQuality());
	}

	@Test
	public void test21seAgregaUnQuesoBrieConSellIn5yQuality50YLuegoDeUpdatePoseeQuality50() {
		Item item = maker.buildAgedBrie(5, 50);
		GildedRose app = new GildedRose();

		app.add(item);

		for (int day = 0; day < 1; day++) {
			app.updateQuality();
		}

		assertEquals(50, item.getQuality());
	}

	@Test
	public void test22seAgregaUnQuesoBrieConSellIn5yQuality50YLuego4UpdatePoseeQuality50() {
		Item item = maker.buildAgedBrie(5, 50);
		GildedRose app = new GildedRose();

		app.add(item);

		for (int day = 0; day < 5; day++) {
			app.updateQuality();
		}

		assertEquals(50, item.getQuality());
	}

	@Test
	public void test23seAgregaUnBackstagePaseConSellIn12yQuality47YLuego4UpdatePoseeQuality50() {
		Item item = maker.buildBackstagePasses(12, 47);
		GildedRose app = new GildedRose();

		app.add(item);

		for (int day = 0; day < 4; day++) {
			app.updateQuality();
		}

		assertEquals(50, item.getQuality());
	}

	@Test
	public void test24seAgregaUnBackstagePaseConSellIn12yQuality35YLuego8UpdatePoseeQuality50() {
		Item item = maker.buildBackstagePasses(12, 35);
		GildedRose app = new GildedRose();

		app.add(item);

		for (int day = 0; day < 8; day++) {
			app.updateQuality();
		}

		assertEquals(50, item.getQuality());
	}

	@Test
	public void test25seAgregaUnItemConjuradoConSellIn4yQuality20YLuegoDe2UpdatePoseeQuality16(){
		Item item = maker.buildItemConjured("item",4, 20);
		GildedRose app = new GildedRose();

		app.add(item);

		for (int day = 0; day < 2; day++) {
			app.updateQuality();
		}

		assertEquals(16, item.getQuality());
	}

	@Test
	public void test26seAgregaUnItemConjuradoConSellIn4yQuality20YLuegoDe3UpdatePoseeQuality14(){
		Item item = maker.buildItemConjured("item",4, 20);
		GildedRose app = new GildedRose();

		app.add(item);

		for (int day = 0; day < 3; day++) {
			app.updateQuality();
		}

		assertEquals(14, item.getQuality());
	}

	@Test
	public void test27seAgregaUnItemConjuradoConSellIn4yQuality20YLuegoDe6UpdatePoseeQuality2(){
		Item item = maker.buildItemConjured("item",4, 20);
		GildedRose app = new GildedRose();

		app.add(item);

		for (int day = 0; day < 6; day++) {
			app.updateQuality();
		}

		assertEquals(2, item.getQuality());
	}

	@Test
	public void test28seAgregaUnItemConjuradoConSellIn4yQuality20YLuegoDe9UpdatePoseeQuality0(){
		Item item = maker.buildItemConjured("item",4, 20);
		GildedRose app = new GildedRose();

		app.add(item);

		for (int day = 0; day < 8; day++) {
			app.updateQuality();
		}

		assertEquals(0, item.getQuality());
	}
}
