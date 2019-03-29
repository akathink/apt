package com.akathink.apt;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.akathink.annotations.BindView;
import com.akathink.library.YuChang;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.show_btn)
    Button mShowBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        YuChang.bind(this);

        mShowBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hi", Toast.LENGTH_LONG).show();
            }
        });
    }
}
