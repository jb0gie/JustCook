package com.l33tm4n.CT6CTPRO;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Page1Activity extends Activity  {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pg_1);
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
	
	public void btnMealOne(View view)
	{
		Intent mealOne = new Intent(Page1Activity.this, MealOne.class);
		startActivity(mealOne);
	}
	
	public void btnMealTwo(View view)
	{
		Intent mealTwo = new Intent(Page1Activity.this, MealTwo.class);
		startActivity(mealTwo);
	}
	
	public void btnMealThree(View view)
	{
		Intent mealThree = new Intent(Page1Activity.this, MealThree.class);
		startActivity(mealThree);
	}
	
	public void btnMealFour(View view)
	{
		Intent mealFour = new Intent(Page1Activity.this, MealFour.class);
		startActivity(mealFour);
	}
}

