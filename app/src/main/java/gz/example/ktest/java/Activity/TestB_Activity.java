package gz.example.ktest.java.Activity;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

import gz.example.ktest.R;

public class TestB_Activity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
    }
}
