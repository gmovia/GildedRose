package ar.uba.fi.tdd.exercise;

import ar.uba.fi.tdd.exercise.QualityStrategy.Backstage;
import ar.uba.fi.tdd.exercise.QualityStrategy.Brie;
import ar.uba.fi.tdd.exercise.QualityStrategy.Maker;
import ar.uba.fi.tdd.exercise.QualityStrategy.Standard;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class GildedRoseTest {

	Maker maker = new Maker();

	@Test
	public void test01SeAgregaUnItemNormalConSellIn10yQuality10luegoDeUnDiaTieneQuality9(){
		Item item = maker.buildItemStandard("item", 10, 10);
		GildedRose app = new GildedRose();

		app.add(item);
		app.updateQuality();

		assertEquals(9, item.getQuality());
	}

	@Test
	public void test02SeAgregaunItemNormalConSellIn10yQuality10LuegoDeUnUpdateTieneSellIn9(){
		Item item = maker.buildItemStandard("item", 10, 10);
		GildedRose app = new GildedRose();

		app.add(item);
		app.updateQuality();

		assertEquals(9, item.getSellIn());
	}

	@Test
	public void test03SeAgregaUnItemNormalConSellIn1yQuality10LuegoDeUnUpdatePoseeQuality8(){
		Item item = maker.buildItemStandard("item", 1, 10);
		GildedRose app = new GildedRose();

		app.add(item);
		app.updateQuality();

		assertEquals(8, item.getQuality());
	}

	@Test
	public void test04SeAgregaUnQuesoBrieConQuality15yLuegoDeUnUpdatePoseeQuality16(){
		Item item = maker.buildAgedBrie(9, 15);
		GildedRose app = new GildedRose();

		app.add(item);
		app.updateQuality();

		assertEquals(16, item.getQuality());
	}

	@Test
	public void test05seAgregaUnQuesoBrieConSellIn12YLuegoDeUnUpdateDisminuyeEnUnaUnidad(){
		Item item = maker.buildAgedBrie(12, 15);
		GildedRose app = new GildedRose();

		app.add(item);
		app.updateQuality();

		assertEquals(11, item.getSellIn());
	}

	@Test
	public void test06seAgregaBackstagePassesConSellIn16yQuality9yLuegoDeUnUpdatePoseeQuality10(){
		Item item = maker.buildBackstagePasses(16, 9);
		GildedRose app = new GildedRose();

		app.add(item);
		app.updateQuality();

		assertEquals(10, item.getQuality());
	}

	@Test
	public void test07seAgregaBackstagePassesConSellIn9yQuality12yLuegoDeUnUpdatePoseeQuality14(){
		Item item = maker.buildBackstagePasses(9, 12);
		GildedRose app = new GildedRose();

		app.add(item);
		app.updateQuality();

		assertEquals(14, item.getQuality());
	}

	@Test
	public void test08seAgregaBackstagePassesConSellIn4yQuality21yLuegoDeUnUpdatePoseeQuality24(){
		Item item = maker.buildBackstagePasses(4, 21);
		GildedRose app = new GildedRose();

		app.add(item);
		app.updateQuality();

		assertEquals(24, item.getQuality());
	}

	@Test
	public void test09seAgregaBackstagePassesConSellIn1yQuality35yLuegoDeUnUpdatePoseeQuality0(){
		Item item = maker.buildBackstagePasses(1, 35);
		GildedRose app = new GildedRose();

		app.add(item);
		app.updateQuality();

		assertEquals(0, item.getQuality());
	}
}
