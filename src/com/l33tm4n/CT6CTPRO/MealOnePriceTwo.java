package com.l33tm4n.CT6CTPRO;


import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;




public class MealOnePriceTwo extends ListActivity{
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         
     // storing string resources into Array
        String[] meal_one_price_two = getResources().getStringArray(R.array.meal_one_price_two);
         
        // Binding resources Array to ListAdapter
        this.setListAdapter(new ArrayAdapter<String>(this, R.layout.price_two, R.id.label_two, meal_one_price_two));
        
        
        ListView lv = getListView();
     // MEALS FOR 1 FOR £10 
     // Tamagoyaki, Chinese Style Egg Fried Rice & Chicken & Cheese Quesadilla 
        
        lv.setOnItemClickListener(new OnItemClickListener(){
            public void onItemClick( AdapterView <?> parent, View view, int   
                                     position,long id){

                 switch(position){
                      case 0:
                    	  // user clicks on the 1st list item
                    	  Intent i4 = new Intent(getApplicationContext(), FoodFour.class);
                          startActivity(i4);
                        break;
                      case 1:
                    	  // user clicks on the 2nd list item
                    	  Intent i5 = new Intent(getApplicationContext(), FoodFive.class);
                          startActivity(i5); 
                         break;
                      case 2:
                    	  // user clicks on the 3rd list item
                    	  Intent i6 = new Intent(getApplicationContext(), FoodSix.class);
                          startActivity(i6); 
                 }
            }
         });
  
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

	
}
