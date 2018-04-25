package kanin.com.example.android.showbru;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import kanin.com.example.android.showbru.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Add Fragment
        if (savedInstanceState==null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentMainFragment, new MainFragment())
                    .commit();
        }


    }   //Main Method

}   //Main Class
