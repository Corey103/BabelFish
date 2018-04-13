package com.example.corey.androidstudioproject;

        import android.os.Bundle;
        import android.support.design.widget.FloatingActionButton;
        import android.support.design.widget.Snackbar;
        import android.support.v7.app.AppCompatActivity;
        import android.support.v7.widget.Toolbar;
        import android.view.View;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.app.Activity;
        import android.content.Intent;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.AdapterView.OnItemClickListener;
        import android.widget.ArrayAdapter;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.ListView;
        import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
private Button button;
private Button button2;
private Button button3;
private Button button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button.setOnItemClickListener(
                                new OnItemClickListener() {

                                    @Override
                                public void onItemClick(AdapterView<?> adapterView, View view, // Some code partially sampled from StackExchange
                                                            int position, long id) {
                                    Object o = mShoppingList.getItemAtPosition(position); // Gets our item
                                     editPos = o.toString(); // Pulls the string
                                       System.out.println(o); // Prints for checking sake
                                     Intent intent = new Intent(ShoppingList.this, EditDelete.class); // Creates intent for our second class
                                    startActivityForResult(intent, 1); // Lets us return the item
                                }


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    //
    //
    //public class ShoppingList extends Activity {
    //    private ListView mShoppingList;
    //    private EditText mItemEdit;
    //    private Button mAddButton;
    //    private ArrayAdapter<String> mAdapter;
    //    private Button toastButton;
    //    private String editPos = "";
    //
    //    @Override
    //    protected void onCreate(Bundle savedInstanceState) { // Lines 25-34 sampled
    //        super.onCreate(savedInstanceState);
    //        setContentView(R.layout.activity_shopping_list);
    //        mShoppingList = findViewById(R.id.shopping_listView);
    //        mItemEdit = findViewById(R.id.item_editText);
    //        mAddButton = findViewById(R.id.add_button);
    //
    //        mAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);
    //        mShoppingList.setAdapter(mAdapter);
    //        mShoppingList.setOnItemClickListener(
    //                new OnItemClickListener() {
    //
    //                    @Override
    //                    public void onItemClick(AdapterView<?> adapterView, View view, // Some code partially sampled from StackExchange
    //                                            int position, long id) {
    //                        Object o = mShoppingList.getItemAtPosition(position); // Gets our item
    //                        editPos = o.toString(); // Pulls the string
    //                        System.out.println(o); // Prints for checking sake
    //                        Intent intent = new Intent(ShoppingList.this, EditDelete.class); // Creates intent for our second class
    //                        startActivityForResult(intent, 1); // Lets us return the item
    //                    }
    //
    //                }
    //        );
    //        mAddButton.setOnClickListener(new View.OnClickListener() {
    //                                          @Override
    //                                          public void onClick(View v) {
    //                                              //Upon click, adds the item after error checking
    //                                              String item = mItemEdit.getText().toString();
    //                                              // Checks to see if the item is blank
    //                                              if (item.equals("")) { // Original Code
    //                                                  Toast.makeText(getApplicationContext(), // Original Code
    //                                                          "Cannot be blank!", Toast.LENGTH_LONG).show(); // Original Code
    //
    //                                              } else {
    //                                                  // Checks to see if the item is a duplicate of another item
    //                                                  int duplicateCheck = 0; //Original code
    //                                                  for (int i = 0; i < mAdapter.getCount(); i++) { // Original code
    //                                                      if (item.equalsIgnoreCase(mAdapter.getItem(i))) { // Original Code
    //                                                          Toast.makeText(getApplicationContext(), // Original Code
    //                                                                  "Duplicate, discarding!", Toast.LENGTH_LONG).show(); // Original Code
    //                                                          duplicateCheck = 1; // Original Code
    //                                                      }
    //
    //                                                  }
    //                                                  // If check passes, adds to the list
    //                                                  if (duplicateCheck == 0) { // Original Code
    //                                                      mAdapter.add(item); // Original Code
    //                                                      mAdapter.notifyDataSetChanged(); // Original Code
    //                                                      mItemEdit.setText(""); // Original Code
    //
    //                                                  }
    //
    //                                              }
    //
    //                                          }
    //
    //
    //                                      }
    //        );
    //
    //    }
    //
    //    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
    //        int duplicateCheck = 0;
    //
    //        if (intent != null) {
    //            if (resultCode == 1) {
    //                String returnedResult = intent.getData().toString();
    //                System.out.println(returnedResult); // Prints for error sake
    //                for (int i = 0; i < mAdapter.getCount(); i++) {
    //                    if (returnedResult.equalsIgnoreCase(mAdapter.getItem(i))) { // Original Code
    //                        Toast.makeText(getApplicationContext(), // Original Code
    //                                "Duplicate, discarding!", Toast.LENGTH_LONG).show(); // Original Code
    //                        duplicateCheck = 1; // Original Code
    //                    }
    //                }
    //                if (duplicateCheck == 0 && !returnedResult.equals("")) {
    //                    mAdapter.remove(editPos); // Removes/readds the item
    //                    mAdapter.add(returnedResult); // Original Code
    //                    mAdapter.notifyDataSetChanged(); // Original Code
    //                    mItemEdit.setText(""); // Original Code
    //
    //                }
    //                else if (!returnedResult.equals("")){
    //                    Toast.makeText(getApplicationContext(), // Original Code
    //                            "Blank, nothing changed!", Toast.LENGTH_LONG).show(); // Original Code
    //                }
    //            }
    //        }
    //        if (resultCode == 2) {
    //            mAdapter.remove(editPos);
    //
    //            mAdapter.notifyDataSetChanged(); // Original Code
    //            mItemEdit.setText(""); // Original Code
    //        }
    //    }
    //
    //}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
