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




public class MealFourPriceFour extends ListActivity{
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         
     // storing string resources into Array
        String[] meal_four_price_four = getResources().getStringArray(R.array.meal_four_price_four);
         
        // Binding resources Array to ListAdapter
        this.setListAdapter(new ArrayAdapter<String>(this, R.layout.price_seventeen, R.id.label_seventeen, meal_four_price_four));
        
        
        ListView lv = getListView();
     // MEALS FOR 4 FOR £20 
     // Perfect Pita Pizza, Chinese Style Egg Fried Rice, Chicken & Cheese Quesadilla, Mince & Vegatable Pasta, Tuna Pasta Bake, Tamagoyaki, Simply Deliecous Calezone 
        
        lv.setOnItemClickListener(new OnItemClickListener(){
            public void onItemClick( AdapterView <?> parent, View view, int   
                                     position,long id){

                 switch(position){
                      case 0:
                    	  // user clicks on the 1st list item
                    	  Intent i10 = new Intent(getApplicationContext(), FoodSevenC.class);
                          startActivity(i10);
                        break;
                      case 1:
                    	  // user clicks on the 2nd list item
                    	  Intent i11 = new Intent(getApplicationContext(), FoodFiveA.class);
                          startActivity(i11); 
                        break;
                      case 2:
                    	  // user clicks on the 3rd list item
                    	  Intent i12 = new Intent(getApplicationContext(), FoodSixA.class);
                          startActivity(i12);
                        break;
                      case 3:
                    	  // user clicks on the 4th list item
                    	  Intent i13 = new Intent(getApplicationContext(), FoodTwelve.class);
                          startActivity(i13);
                        break; 
                      case 4:
                    	  // user clicks on the 5th list item
                    	  Intent i14 = new Intent(getApplicationContext(), FoodEightA.class);
                          startActivity(i14);
                        break;
                      case 5:
                    	  // user clicks on the 6th list item
                    	  Intent i15 = new Intent(getApplicationContext(), FoodFourA.class);
                          startActivity(i15);
                        break;
                      case 6:
                    	  // user clicks on the 7th list item
                    	  Intent i16 = new Intent(getApplicationContext(), FoodThirteen.class);
                          startActivity(i16);
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
