package magdamiu.com.abcofandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Intent(Context packageContext [from], Class<?> cls[to])
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("Name", "Android");
        startActivity(intent);
    }
}
