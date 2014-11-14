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




public class MealOnePriceFour extends ListActivity{
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         
     // storing string resources into Array
        String[] meal_one_price_four = getResources().getStringArray(R.array.meal_one_price_four);
         
        // Binding resources Array to ListAdapter
        this.setListAdapter(new ArrayAdapter<String>(this, R.layout.price_four, R.id.label_four, meal_one_price_four));
        
        
        ListView lv = getListView();
     // MEALS FOR 1 FOR £20 
     // Spaghetti Bolognese, Tuna Pasta Bake and Mince & Vegatable Pasta 
        
        lv.setOnItemClickListener(new OnItemClickListener(){
            public void onItemClick( AdapterView <?> parent, View view, int   
                                     position,long id){

                 switch(position){
                      case 0:
                    	  // user clicks on the 1st list item
                    	  Intent i10 = new Intent(getApplicationContext(), FoodElevenA.class);
                          startActivity(i10);
                        break;
                      case 1:
                    	  // user clicks on the 2nd list item
                    	  Intent i11 = new Intent(getApplicationContext(), FoodEightA.class);
                          startActivity(i11); 
                         break;
                      case 2:
                    	  // user clicks on the 3rd list item
                    	  Intent i12 = new Intent(getApplicationContext(), FoodTwelve.class);
                          startActivity(i12); 
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
