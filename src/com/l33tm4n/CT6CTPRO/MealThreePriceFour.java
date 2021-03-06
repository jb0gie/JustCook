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




public class MealThreePriceFour extends ListActivity{
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         
     // storing string resources into Array
        String[] meal_three_price_four = getResources().getStringArray(R.array.meal_three_price_four);
         
        // Binding resources Array to ListAdapter
        this.setListAdapter(new ArrayAdapter<String>(this, R.layout.price_thirteen, R.id.label_thirteen, meal_three_price_four));
        
        
        ListView lv = getListView();
     // MEALS FOR 3 FOR �20   
     // Chinese Style Egg Fried Rice, Chicken & Cheese Quesadilla, Tuna Pasta Bake, Simply Deliecous Calezone
        
        lv.setOnItemClickListener(new OnItemClickListener(){
            public void onItemClick( AdapterView <?> parent, View view, int   
                                     position,long id){

                 switch(position){
                      case 0:
                    	  // user clicks on the 1st list item
                    	  Intent i1 = new Intent(getApplicationContext(), FoodFiveB.class);
                          startActivity(i1);
                        break;
                      case 1:
                    	  // user clicks on the 2nd list item
                    	  Intent i2 = new Intent(getApplicationContext(), FoodSixA.class);
                          startActivity(i2);
                          break;
                      case 2:
                    	  // user clicks on the 3rd list item
                    	  Intent i3 = new Intent(getApplicationContext(), FoodEightA.class);
                          startActivity(i3);
                        break;
                      case 3:
                    	  // user clicks on the 4th list item
                    	  Intent i4 = new Intent(getApplicationContext(), FoodThirteen.class);
                          startActivity(i4);
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
