import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.webtoon.R;

public class MainActivity extends AppCompatActivity {
    TextView webtoon, best, my, play, setting;
    ViewPager viewPager;
    PagerViewAdapter PagerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
    }
}
