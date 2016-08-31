package com.duanlian.baidumapdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView myAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myAddress = (TextView) findViewById(R.id.address);
    }
    public void location(View view){
        //跳转到定位的activity
        Intent intent = new Intent(MainActivity.this, MapActivity.class);
        startActivityForResult(intent,1);
    }

    /**
     * 回调方法拿到数据
     * @param requestCode  请求码
     * @param resultCode  结果码
     * @param data   数据
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==1&&resultCode==RESULT_OK) {
            myAddress.setText("维度:"+data.getStringExtra("getLatitude")+"\n"+"精度:"+data.getStringExtra("getLongitude")+"\n"+"地址:"+data.getStringExtra("getAddress"));
        }
    }
}
