package gz.example.ktest.java.Activity;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.orhanobut.logger.Logger;

import java.util.List;

import gz.example.ktest.R;
import gz.example.ktest.java.Util.StatusBarUtil;
import gz.example.ktest.java.View.BaseTitleBar;

public class TestB_Activity extends Activity implements View.OnClickListener {
    private ConstraintLayout constraintLayout;
    private BaseTitleBar baseTitleBar;
    private TextView tvJumpA;
    private TextView tvJumpB;
    private TextView tvJumpC;
    private TextView tvJumpD;
    private TextView tvPrint;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        StatusBarUtil.setStatusBarColor(this,Color.parseColor("#ffffff"));
        baseTitleBar = findViewById(R.id.v_title);
        baseTitleBar.setText(getLocalClassName());
        tvJumpA = findViewById(R.id.tv_jumpA);
        tvJumpA.setOnClickListener(this);
        tvJumpB = findViewById(R.id.tv_jumpB);
        tvJumpB.setOnClickListener(this);
        tvJumpC = findViewById(R.id.tv_jumpC);
        tvJumpC.setOnClickListener(this);
        tvJumpD = findViewById(R.id.tv_jumpD);
        tvJumpD.setOnClickListener(this);
        tvPrint = findViewById(R.id.tv_print);
        tvPrint.setOnClickListener(this);
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
            case R.id.tv_print:
                ActivityManager am = (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);
                List<ActivityManager.RunningTaskInfo> runningTaskInfoList = am.getRunningTasks(10);
                for (ActivityManager.RunningTaskInfo runningTaskInfo : runningTaskInfoList) {
                    Logger.d("number of activities: " + runningTaskInfo.numActivities);
                    Logger.d("topActivity: " + runningTaskInfo.topActivity);
                    Logger.d("baseActivity: " + runningTaskInfo.baseActivity.toString());
                }
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
        Logger.d("onRestoreInstanceState");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Logger.d("onSaveInstanceState");
    }

}
