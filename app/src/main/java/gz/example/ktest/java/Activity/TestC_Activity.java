package gz.example.ktest.java.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.orhanobut.logger.Logger;

import gz.example.ktest.R;

public class TestC_Activity extends Activity implements View.OnClickListener {
    private ConstraintLayout constraintLayout;
    TextView tvName;
    TextView tvJumpA;
    TextView tvJumpB;
    TextView tvJumpC;
    TextView tvJumpD;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        tvName = findViewById(R.id.tv_name);
        tvName.setText(getLocalClassName());
        tvJumpA = findViewById(R.id.tv_jumpA);
        tvJumpA.setOnClickListener(this);
        tvJumpB = findViewById(R.id.tv_jumpB);
        tvJumpB.setOnClickListener(this);
        tvJumpC = findViewById(R.id.tv_jumpC);
        tvJumpC.setOnClickListener(this);
        tvJumpD = findViewById(R.id.tv_jumpD);
        tvJumpD.setOnClickListener(this);

        Logger.d("onCreate");
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()) {
            case R.id.tv_jumpA:
                intent.setClass(getApplicationContext(), TestA_Activity.class);
                startActivity(intent);
                break;
            case R.id.tv_jumpB:
                intent.setClass(getApplicationContext(), TestB_Activity.class);
                startActivity(intent);
                break;
            case R.id.tv_jumpC:
                intent.setClass(getApplicationContext(), TestC_Activity.class);
                startActivity(intent);
                break;
            case R.id.tv_jumpD:
                intent.setClass(getApplicationContext(), TestD_Activity.class);
                startActivity(intent);
                break;
            default:
                break;
        }

    }

    @Override
    protected void onStart() {
        super.onStart();
        Logger.d("onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Logger.d("onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Logger.d("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Logger.d("onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Logger.d("onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Logger.d("onDestroy");
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Logger.d("onNewIntent");
    }

    @Override
    public void onRestoreInstanceState(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onRestoreInstanceState(savedInstanceState, persistentState);
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
    }

}