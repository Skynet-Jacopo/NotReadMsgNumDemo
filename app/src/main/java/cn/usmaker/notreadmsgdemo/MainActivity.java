package cn.usmaker.notreadmsgdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private BottomBarView mBottomBarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBottomBarView = (BottomBarView) findViewById(R.id.bottom_bar_view);
        mBottomBarView.setMessageCount(0);
        findViewById(R.id.btn_send_msg).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mBottomBarView.addMsg();
            }
        });
        findViewById(R.id.btn_accept_msg).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mBottomBarView.setMessageCount(0);
            }
        });
    }
}
