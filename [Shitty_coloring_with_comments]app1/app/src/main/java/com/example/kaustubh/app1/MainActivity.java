package com.example.kaustubh.app1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;// log all activities

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "message-identifier"; //Name by conventional docs. rtfd
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"onCreate");
    }

    // start with Alt+Insert
    // link for this code - https://thenewboston.com/forum/topic.php?id=3234
    //android monitor > logcat > edit filter configuration > message-identifier as regex
    /*
    *   12-12 11:59:41.573 2288-2288/com.example.kaustubh.app1 I/message-identifier: onCreate
        12-12 11:59:41.574 2288-2288/com.example.kaustubh.app1 I/message-identifier: onStart
        12-12 11:59:41.574 2288-2288/com.example.kaustubh.app1 I/message-identifier: onResume
    */
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart"); // just for debugging
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume");
    }

    // log when you press home button
    /*
         12-12 12:01:24.213 2288-2288/com.example.kaustubh.app1 I/message-identifier: onPause
        12-12 12:01:24.593 2288-2288/com.example.kaustubh.app1 I/message-identifier: onSaveInstanceState
        12-12 12:01:24.593 2288-2288/com.example.kaustubh.app1 I/message-identifier: onStop
     */
    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy");
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG, "onSaveInstanceState");
    }


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG, "onRestoreInstanceState");
    }

}
