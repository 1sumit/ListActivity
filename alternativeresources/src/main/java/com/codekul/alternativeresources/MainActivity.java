package com.codekul.alternativeresources;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       /* if(savedInstanceState != null){
            ((TextView)findViewById(R.id.txtDt)).setText(savedInstanceState.getString("txtDt"));
        }*/
        setContentView(R.layout.activity_main);
        mt("onCreate");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        mt("onrestart");
    }
    @Override
    protected void onStart(){
        super.onStart();
        mt("onStart");
    }
    @Override
    protected void onResume(){
        super.onResume();
        mt("onResume");
    }
    @Override
    protected void onPause() {
        mt("onPause");
        super.onPause();
    }
    @Override
    protected void onStop() {
        mt("onStop");
        super.onStop();
    }
    @Override
    protected void onDestroy() {

        mt("onDestroy");
        super.onDestroy();
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("txtDt", ((TextView) findViewById(R.id.txtDt)).getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        if (savedInstanceState != null) {
            ((TextView) findViewById(R.id.txtDt))
                    .setText(savedInstanceState.getString("txtDt"));
        }
    }

    protected void onDt(View view)
    {
        ((TextView)findViewById(R.id.txtDt)).setText(String.valueOf(System.currentTimeMillis()));
    }
    private void mt(String msg){
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }
}
