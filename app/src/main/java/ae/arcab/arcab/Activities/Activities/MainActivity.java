package ae.arcab.arcab.Activities.Activities;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import ae.arcab.arcab.Activities.Utils.FontUtil;
import ae.arcab.arcab.R;

public class MainActivity extends AppCompatActivity {

    private static final String TAG_LINE = "Move" + "\n" + "Together.";
    private static final int TIMER = 3000;
    private Context mContext = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }
        },TIMER);
    }

    private void init(){


        TextView textView = (TextView) findViewById(R.id.txt_view_main);
        textView.setText(TAG_LINE);
        textView.setTextSize(32);
        textView.setTypeface(null, Typeface.BOLD);
        textView.setTypeface(FontUtil.getColfaxMedium(mContext));
        textView.setTextColor(ContextCompat.getColor(mContext, R.color.colorText));

        ImageView imageView = (ImageView) findViewById(R.id.img_view_main);
        imageView.setImageDrawable(getResources().getDrawable(R.drawable.arcab));

    }
}
