package gz.example.ktest.java.View;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

import gz.example.ktest.R;

public class BaseTitleBar extends LinearLayout implements View.OnClickListener {
    private ImageView ivBack;
    private ImageView ivMore;
    private TextView tvTittle;
    private Context context;

    public BaseTitleBar(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        initValue(context, attrs);
    }

    public BaseTitleBar(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        initValue(context, attrs);
    }

    private void initValue(Context context, AttributeSet attrs) {
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.BaseTitleBar);
        int style = typedArray.getInt(R.styleable.BaseTitleBar_title_style, 0);
        initView(context, attrs, style);
        typedArray.recycle();
    }

    private void initView(Context context, AttributeSet attrs, int style) {
        View view = LayoutInflater.from(context).inflate(R.layout.view_titlebar, this);
        ivBack = view.findViewById(R.id.iv_back);
        ivBack.setOnClickListener(this);
        ivMore = view.findViewById(R.id.iv_more);
        tvTittle = view.findViewById(R.id.iv_title);
        if (style != 0) {
            ivMore.setVisibility(VISIBLE);
        } else {
            ivMore.setVisibility(INVISIBLE);
        }
    }

    public void setText(String title) {
        if (!TextUtils.isEmpty(title)) {
            tvTittle.setText(title);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_back:
                Activity activity = (Activity) context;
                activity.finish();
                break;
            default:
                break;
        }
    }
}
