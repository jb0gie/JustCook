package com.l33tm4n.CT6CTPRO;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MealOne extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.meal_one);
		getActionBar().setDisplayHomeAsUpEnabled(true);

	}	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    switch (item.getItemId()) {
	    // Respond to the action bar's Up/Home button
	    case android.R.id.home:
	        NavUtils.navigateUpFromSameTask(this);
	        return true;
	    }
	    return super.onOptionsItemSelected(item);
	}
	
	public void btnPriceOne(View view)
	//meals for �5 
	{
		Intent priceOne = new Intent(MealOne.this, MealOnePriceOne.class);
		startActivity(priceOne);
	}
	
	public void btnPriceTwo(View view)
	//meals for �10 
	{
		Intent priceTwo = new Intent(MealOne.this, MealOnePriceTwo.class);
		startActivity(priceTwo);
	}
	
	public void btnPriceThree(View view)
	//meals for �15 
	{
		Intent priceThree = new Intent(MealOne.this, MealOnePriceThree.class);
		startActivity(priceThree);
	}
	
	public void btnPriceFour(View view)
	//meals for �20 
	{
		Intent priceFour = new Intent(MealOne.this, MealOnePriceFour.class);
		startActivity(priceFour);
	}
}
