package com.example.user.reminder;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class CheckBoxActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        setTitle("CheckBoxActivity");
        Button btn=(Button)findViewById(R.id.button);
        final CheckBox zlc = (CheckBox)findViewById((R.id.zlc));
        final CheckBox qry = (CheckBox)findViewById((R.id.qry));
        final CheckBox zxz = (CheckBox)findViewById((R.id.zxz));
        btn.setOnClickListener(new Button.OnClickListener(){
                                  public void onClick(View v){
                                        String r = "";
                                        if(zlc.isChecked()) {
                                            r = r + "," + zlc.getText();
                                        }
                                        if (qry.isChecked()){
                                          r = r + "," + qry.getText();
                                       }
                                        if(zxz.isChecked()){
                                          r = r + "," + zxz.getText();
                                       }
                                       setTitle(r);
                                   }
                               }
        );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_check_box, menu);
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
